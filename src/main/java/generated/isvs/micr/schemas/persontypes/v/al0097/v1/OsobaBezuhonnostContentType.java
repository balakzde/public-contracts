//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.23 at 01:46:39 AM CET 
//


package generated.isvs.micr.schemas.persontypes.v.al0097.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;



@XmlType(name = "OsobaBezuhonnostContentType", namespace = "urn:cz:isvs:micr:schemas:PersonTypes:v:AL0097:v1")
@XmlEnum
public enum OsobaBezuhonnostContentType {

    @XmlEnumValue("netrest\u00e1n")
    NETRESTAN("netrest\u00e1n"),
    @XmlEnumValue("trest\u00e1n")
    TRESTAN("trest\u00e1n");
    private final String value;

    OsobaBezuhonnostContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OsobaBezuhonnostContentType fromValue(String v) {
        for (OsobaBezuhonnostContentType c: OsobaBezuhonnostContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
