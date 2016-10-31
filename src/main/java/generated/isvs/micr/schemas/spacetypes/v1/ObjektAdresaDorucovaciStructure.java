//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.23 at 01:46:39 AM CET 
//


package generated.isvs.micr.schemas.spacetypes.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import generated.isvs.micr.schemas.commontypes.v1.RozsireniStructure;
import generated.isvs.micr.schemas.corecomponenttypes.v1.TextType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjektAdresaDorucovaciStructure", propOrder = {
    "radekText",
    "rozsireni"
})
public class ObjektAdresaDorucovaciStructure {

    @XmlElement(name = "RadekText", required = true)
    protected List<TextType> radekText;
    @XmlElement(name = "Rozsireni", namespace = "urn:cz:isvs:micr:schemas:CommonTypes:v1")
    protected RozsireniStructure rozsireni;
    @XmlAttribute(name = "objektID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String objektID;


    public List<TextType> getRadekText() {
        if (radekText == null) {
            radekText = new ArrayList<TextType>();
        }
        return this.radekText;
    }


    public RozsireniStructure getRozsireni() {
        return rozsireni;
    }


    public void setRozsireni(RozsireniStructure value) {
        this.rozsireni = value;
    }


    public String getObjektID() {
        return objektID;
    }


    public void setObjektID(String value) {
        this.objektID = value;
    }

}
