import db.DatabaseConnectionFactory;
import dto.SourceInfoDto;
import dto.SubmitterDto;
import generated.isvz.mmr.schemas.vz_z_profilu_zadavatele.v100.ProfilStructure;
import org.apache.ibatis.jdbc.ScriptRunner;
import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.DatabaseService;
import service.ISVZCrawlerService;
import service.ISVZService;
import util.SubmitterTransformer;

import java.io.*;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;

public class Main {

    final static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) throws SQLException, IOException, NoSuchAlgorithmException, KeyManagementException {

        if (args.length == 0) {
            printWrongCommand();
            System.exit(0);
        }

        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring.xml"});

        final String command = args[0];
        switch (command) {
            case "reload-db": {
                if (args.length > 1) {
                    closeAppWithWrongCommand(context);
                }
                reloadDb(context);
                break;
            }

            case "delete-collected-data": {
                if (args.length > 2) {
                    closeAppWithWrongCommand(context);
                }
                deleteCollectedData(args, context);
                break;
            }
            case "reload-sources": {
                if (args.length > 1) {
                    closeAppWithWrongCommand(context);
                }
                reloadSources(context);
                break;
            }
            default:
                if (args.length > 2) {
                    closeAppWithWrongCommand(context);
                }
                collectData(args, context, command);
                break;
        }
        context.close();
    }

    private static void deleteCollectedData(String[] args, ClassPathXmlApplicationContext context) throws SQLException {
        final Integer year;
        if (args.length == 2) {
            try {
                year = Integer.parseInt(args[1]);
            } catch (Exception e) {
                context.close();
                printWrongCommand();
                System.exit(0);
                return;
            }
        } else {
            year = null;
        }

        final Scanner scanner = new Scanner(System.in);
        System.out.println("Are you sure?");
        if (year == null) {
            System.out.println("This command will delete all collected data exept sources with urls!");
        } else {
            System.out.println("This command will delete all collected for year '" + year + "' data exept sources with urls!");

        }
        System.out.println("Write 'yes' to confirm or anything else to cancel");
        final String confirmation = scanner.nextLine();
        if (confirmation.equals("yes")) {
            final DatabaseService databaseService = context.getBean(DatabaseService.class);
            databaseService.deleteCollectedData(year);
        } else {
            context.close();
            System.exit(0);
        }
    }

    private static void collectData(String[] args, ClassPathXmlApplicationContext context, String command) throws SQLException {
        final int year;
        try {
            year = Integer.parseInt(command);
        } catch (Exception e) {
            printWrongCommand();
            context.close();
            System.exit(0);
            return;
        }

        if (year < 2000) {
            System.out.println("There probably aren't any data before year 2000. Dont waste your time!");
            context.close();
            System.exit(0);
        }

        final Date date = createDateFromYear(year);
        final Date present = DateTime.now().toDate();
        if (date.after(present)) {
            System.out.println("Wrong year! This year hasn't even been yet");
            context.close();
            System.exit(0);
        }

        final DatabaseService databaseService = context.getBean(DatabaseService.class);
        final ISVZService isvzService = context.getBean(ISVZService.class);

        final Date lastDate;
        try {
            lastDate = databaseService.loadRetrievalLastDate(year);
        } catch (RuntimeException e) {
            System.out.println("year " + year + " is already completed");
            System.exit(0);
            return;
        }

        final List<SourceInfoDto> sourceInfoSources = databaseService.loadSources();
        if (args.length == 2) {
            final Iterator<SourceInfoDto> iterator = sourceInfoSources.iterator();
            while (iterator.hasNext()) {
                final SourceInfoDto next = iterator.next();
                iterator.remove();
                if (next.getIco().equals(args[1])) {
                    break;
                }
            }
            if (sourceInfoSources.isEmpty()) {
                System.out.println("Probably wrong ico, because it is not in database!");
                context.close();
                System.exit(0);
            }
        }


        int numberOfErrors = 0;

        for (SourceInfoDto sourceInfoDto : sourceInfoSources) {
            final ProfilStructure profilStructure;
            try {
                profilStructure = isvzService.findProfilStructure(sourceInfoDto.getUrl(), year, lastDate);
            } catch (Exception e) {
                databaseService.saveError(sourceInfoDto, e.getMessage(), year, e.getClass().toString());
                numberOfErrors++;
                logger.error("error during parsing " + sourceInfoDto.getName() + ", " + sourceInfoDto.getIco() + ", " + sourceInfoDto.getUrl() + "\n" + e.getMessage());
                continue;
            }

            final SubmitterDto submitterDto;
            try {
                submitterDto = SubmitterTransformer.transformSubmitterToDto(profilStructure);
            } catch (Exception e) {
                databaseService.saveError(sourceInfoDto, e.getMessage(), year, e.getClass().toString());
                numberOfErrors++;
                logger.error("error during transforming to dto " + sourceInfoDto.getName() + ", " + sourceInfoDto.getIco() + ", " + sourceInfoDto.getUrl() + "\n" + e.getMessage());
                continue;
            }

            try {
                databaseService.saveSubmitter(submitterDto, year);
            } catch (Exception e) {
                databaseService.saveError(sourceInfoDto, e.getMessage(), year, e.getClass().toString());
                numberOfErrors++;
                logger.error("error during saving " + sourceInfoDto.getName() + ", " + sourceInfoDto.getIco() + ", " + sourceInfoDto.getUrl() + "\n" + e.getMessage());
                continue;
            }
        }
        final DateTime now = DateTime.now();
        final DateTime lastDayOfTheYear = new DateTime(year, 12, 31, 0, 0);
        final boolean after = now.isAfter(lastDayOfTheYear);
        databaseService.saveRetrieval(year, after, (after ? lastDayOfTheYear.toDate() : now.toDate()), numberOfErrors);
    }

    private static void closeAppWithWrongCommand(ClassPathXmlApplicationContext context) {
        context.close();
        printWrongCommand();
        System.exit(0);
    }

    private static void reloadSources(ClassPathXmlApplicationContext context) throws SQLException, IOException {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Are you sure?");
        System.out.println("This command will reload valid submitters of public contract");
        System.out.println("All data collected about public contracts will not be changed");
        System.out.println("Write 'yes' to confirm or anything else to cancel");
        final String confirmation = scanner.nextLine();
        if (confirmation.equals("yes")) {
            final DatabaseService databaseService = context.getBean(DatabaseService.class);
            final ISVZCrawlerService isvzCrawlerService = context.getBean(ISVZCrawlerService.class);
            logger.info("deleting submitters");
            databaseService.deleteSources();
            logger.info("crawling web for submitters");
            final List<SourceInfoDto> allSubmitters = isvzCrawlerService.findAllSubmitters();
            logger.info("saving submitters");
            databaseService.saveSources(allSubmitters);
        } else {
            context.close();
            System.exit(0);
        }
    }


    private static void reloadDb(ClassPathXmlApplicationContext context) throws FileNotFoundException {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Are you sure?");
        System.out.println("This command will drop and rebuild all tables related to public contract!");
        System.out.println("Write 'yes' to confirm or anything else to cancel");
        final String confirmation = scanner.nextLine();
        if (confirmation.equals("yes")) {
            reloadDatabase(context);
        } else {
            context.close();
            System.exit(0);
        }
    }

    private static Date createDateFromYear(int year) {
        final Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.YEAR, year);
        return calendar.getTime();
    }

    private static void printWrongCommand() {
        System.out.println("Wrong argument!");
        System.out.println("Valid arguments are:");
        System.out.println("'reload-db' - drops all tables from database and creates schema (Do NOT use if you don't want to loose data!!!)");
        System.out.println("'reload-sources' - deletes and reloads urls of submitters (ETA 20 minutes)");
        System.out.println("'delete-collected-data [yyyy]' - delete all collected data except sources with urls, [yyyy] is optional and is used to delete data only for that year");
        System.out.println("'yyyy [ico]' - e.g. '2015' or '2015 28119169' - search and save data for all submitters for 2015, [ico] is optional and is used if previous attempt fail, so you can start after last saved submitter (ETA 8 hours)");
    }

    private static void reloadDatabase(ClassPathXmlApplicationContext context) throws FileNotFoundException {
        final DatabaseConnectionFactory databaseConnectionFactory = context.getBean(DatabaseConnectionFactory.class);

        // Initialize object for ScripRunner
        final Connection connection = databaseConnectionFactory.getConnection();
        final ScriptRunner sr = new ScriptRunner(connection);

        final InputStream dropStream = Main.class.getResourceAsStream("sql/drop.sql");
        final Reader dropReader = new InputStreamReader(dropStream);

        sr.runScript(dropReader);

        final InputStream initStream = Main.class.getResourceAsStream("sql/init.sql");
        final Reader initReader = new InputStreamReader(initStream);

        sr.runScript(initReader);

    }
}
