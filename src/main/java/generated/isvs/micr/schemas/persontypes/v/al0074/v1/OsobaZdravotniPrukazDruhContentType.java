//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.23 at 01:46:39 AM CET 
//


package generated.isvs.micr.schemas.persontypes.v.al0074.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;



@XmlType(name = "OsobaZdravotniPrukazDruhContentType", namespace = "urn:cz:isvs:micr:schemas:PersonTypes:v:AL0074:v1")
@XmlEnum
public enum OsobaZdravotniPrukazDruhContentType {

    TP("TP"),
    ZTP("ZTP"),
    @XmlEnumValue("ZTP-P")
    ZTP_P("ZTP-P"),
    @XmlEnumValue("\u017e\u00e1dn\u00fd")
    ZADNY("\u017e\u00e1dn\u00fd");
    private final String value;

    OsobaZdravotniPrukazDruhContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OsobaZdravotniPrukazDruhContentType fromValue(String v) {
        for (OsobaZdravotniPrukazDruhContentType c: OsobaZdravotniPrukazDruhContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
