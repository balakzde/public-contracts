import crawler.ISVZCrawler;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.ISVZService;
import service.InsertIntoDBService;

import java.io.IOException;
import java.sql.SQLException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:test-for-developers.xml"})
public class TestForDevelopers {
    private static final String URI_PREFIX = "https://www.softender.cz/cah/";
    private static final String URI_SUFFIX = "/XMLdataVZ?od=07042015&do=10102015";

    //
//    C�lem je vyt�it v�dy k�d ve�ejn� zak�zky, jej� n�zev, stav, druh zad�vac�ho ��zen�.
//
//    K n� v�echny uchaze�e, v�etn� subdodavatel� i nab�dkov�ch cen - ty je nutn� ulo�it jako ��slo. Nakonec je pot�eba vyt�it v�t�ze, v�etn� v�t�zn�ch cen.

    @Autowired
    private InsertIntoDBService insertIntoDBService;
    @Autowired
    private ISVZService isvzService;
    @Autowired
    private ISVZCrawler isvzCrawler;

    @org.junit.Test
    public void test() {
        try {
            isvzCrawler.crawl();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void test2() {
            isvzService.findProfilStructure("http://soad.profilzadavatele.cz/");

    }
}
