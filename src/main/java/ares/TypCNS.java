
package ares;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typ_CNS.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;simpleType name="typ_CNS">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Crkev"/>
 *     &lt;enumeration value="Svaz"/>
 *     &lt;enumeration value="Prvnick osoba"/>
 *     &lt;enumeration value="Crkevn prvnick osoba"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "typ_CNS", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2")
@XmlEnum
public enum TypCNS {

    @XmlEnumValue("C\u00edrkev")
    CiRKEV("C\u00edrkev"),
    @XmlEnumValue("Svaz")
    SVAZ("Svaz"),
    @XmlEnumValue("Pr\u00e1vnick\u00e1 osoba")
    PRaVNICKa_OSOBA("Pr\u00e1vnick\u00e1 osoba"),
    @XmlEnumValue("C\u00edrkevn\u00ed pr\u00e1vnick\u00e1 osoba")
    CiRKEVNi_PRaVNICKa_OSOBA("C\u00edrkevn\u00ed pr\u00e1vnick\u00e1 osoba");
    private final String value;

    TypCNS(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypCNS fromValue(String v) {
        for (TypCNS c : TypCNS.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
