//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.23 at 01:46:39 AM CET 
//


package generated.isvs.micr.schemas.persontypes.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import generated.isvs.micr.schemas.businesstypes.v2.SubjektObchodniJmenoType;
import generated.isvs.micr.schemas.businesstypes.v2.SubjektProvozType;
import generated.isvs.micr.schemas.commontypes.v1.RozsireniStructure;
import generated.isvs.micr.schemas.spacetypes.v1.ObjektAdresaNazvyStructure;


/**
 * Složený datový prvek o zaměstnání a zaměstnavateli obyvatele.
 * 
 * 
 * <p>Java class for OsobaZamestnaniStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OsobaZamestnaniStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PostaveniKod" type="{urn:cz:isvs:micr:schemas:PersonTypes:v2}OsobaZamestnaniPostaveniKodType"/>
 *         &lt;element name="ZamestnavatelObchodniJmeno" type="{urn:cz:isvs:micr:schemas:BusinessTypes:v2}SubjektObchodniJmenoType"/>
 *         &lt;element name="ZamestnavatelAdresa" type="{urn:cz:isvs:micr:schemas:SpaceTypes:v1}ObjektAdresaNazvyStructure"/>
 *         &lt;element name="Provoz" type="{urn:cz:isvs:micr:schemas:BusinessTypes:v2}SubjektProvozType"/>
 *         &lt;element name="ProvozAdresa" type="{urn:cz:isvs:micr:schemas:SpaceTypes:v1}ObjektAdresaNazvyStructure"/>
 *         &lt;element ref="{urn:cz:isvs:micr:schemas:CommonTypes:v1}Rozsireni" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="objektID" type="{http://www.w3.org/2001/XMLSchema}token" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OsobaZamestnaniStructure", propOrder = {
    "postaveniKod",
    "zamestnavatelObchodniJmeno",
    "zamestnavatelAdresa",
    "provoz",
    "provozAdresa",
    "rozsireni"
})
public class OsobaZamestnaniStructure {

    @XmlElement(name = "PostaveniKod", required = true)
    protected OsobaZamestnaniPostaveniKodType postaveniKod;
    @XmlElement(name = "ZamestnavatelObchodniJmeno", required = true)
    protected SubjektObchodniJmenoType zamestnavatelObchodniJmeno;
    @XmlElement(name = "ZamestnavatelAdresa", required = true)
    protected ObjektAdresaNazvyStructure zamestnavatelAdresa;
    @XmlElement(name = "Provoz", required = true)
    protected SubjektProvozType provoz;
    @XmlElement(name = "ProvozAdresa", required = true)
    protected ObjektAdresaNazvyStructure provozAdresa;
    @XmlElement(name = "Rozsireni", namespace = "urn:cz:isvs:micr:schemas:CommonTypes:v1")
    protected RozsireniStructure rozsireni;
    @XmlAttribute(name = "objektID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String objektID;

    /**
     * Gets the value of the postaveniKod property.
     * 
     * @return
     *     possible object is
     *     {@link OsobaZamestnaniPostaveniKodType }
     *     
     */
    public OsobaZamestnaniPostaveniKodType getPostaveniKod() {
        return postaveniKod;
    }

    /**
     * Sets the value of the postaveniKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsobaZamestnaniPostaveniKodType }
     *     
     */
    public void setPostaveniKod(OsobaZamestnaniPostaveniKodType value) {
        this.postaveniKod = value;
    }

    /**
     * Gets the value of the zamestnavatelObchodniJmeno property.
     * 
     * @return
     *     possible object is
     *     {@link SubjektObchodniJmenoType }
     *     
     */
    public SubjektObchodniJmenoType getZamestnavatelObchodniJmeno() {
        return zamestnavatelObchodniJmeno;
    }

    /**
     * Sets the value of the zamestnavatelObchodniJmeno property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjektObchodniJmenoType }
     *     
     */
    public void setZamestnavatelObchodniJmeno(SubjektObchodniJmenoType value) {
        this.zamestnavatelObchodniJmeno = value;
    }

    /**
     * Gets the value of the zamestnavatelAdresa property.
     * 
     * @return
     *     possible object is
     *     {@link ObjektAdresaNazvyStructure }
     *     
     */
    public ObjektAdresaNazvyStructure getZamestnavatelAdresa() {
        return zamestnavatelAdresa;
    }

    /**
     * Sets the value of the zamestnavatelAdresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjektAdresaNazvyStructure }
     *     
     */
    public void setZamestnavatelAdresa(ObjektAdresaNazvyStructure value) {
        this.zamestnavatelAdresa = value;
    }

    /**
     * Gets the value of the provoz property.
     * 
     * @return
     *     possible object is
     *     {@link SubjektProvozType }
     *     
     */
    public SubjektProvozType getProvoz() {
        return provoz;
    }

    /**
     * Sets the value of the provoz property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjektProvozType }
     *     
     */
    public void setProvoz(SubjektProvozType value) {
        this.provoz = value;
    }

    /**
     * Gets the value of the provozAdresa property.
     * 
     * @return
     *     possible object is
     *     {@link ObjektAdresaNazvyStructure }
     *     
     */
    public ObjektAdresaNazvyStructure getProvozAdresa() {
        return provozAdresa;
    }

    /**
     * Sets the value of the provozAdresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjektAdresaNazvyStructure }
     *     
     */
    public void setProvozAdresa(ObjektAdresaNazvyStructure value) {
        this.provozAdresa = value;
    }

    /**
     * Gets the value of the rozsireni property.
     * 
     * @return
     *     possible object is
     *     {@link RozsireniStructure }
     *     
     */
    public RozsireniStructure getRozsireni() {
        return rozsireni;
    }

    /**
     * Sets the value of the rozsireni property.
     * 
     * @param value
     *     allowed object is
     *     {@link RozsireniStructure }
     *     
     */
    public void setRozsireni(RozsireniStructure value) {
        this.rozsireni = value;
    }

    /**
     * Gets the value of the objektID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjektID() {
        return objektID;
    }

    /**
     * Sets the value of the objektID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjektID(String value) {
        this.objektID = value;
    }

}
