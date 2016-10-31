//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.23 at 01:46:39 AM CET 
//


package generated.isvz.mmr.schemas.vz_z_profilu_zadavatele.v100;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * Korenova struktura pro predani seznamu VZ z profilu zadavatele
 * 
 * <p>Java class for ProfilStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProfilStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="profil_kod" type="{urn:cz:isvz:mmr:schemas:vz-z-profilu-zadavatele:v100}ProfilKodType"/>
 *         &lt;element name="zadavatel" type="{urn:cz:isvz:mmr:schemas:vz-z-profilu-zadavatele:v100}ZadavatelStructure"/>
 *         &lt;element name="zakazka" type="{urn:cz:isvz:mmr:schemas:vz-z-profilu-zadavatele:v100}ZakazkaStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;any processContents='skip' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfilStructure", propOrder = {
    "profilKod",
    "zadavatel",
    "zakazka",
    "any"
})
public class ProfilStructure {

    @XmlElement(name = "profil_kod", required = true)
    protected ProfilKodType profilKod;
    @XmlElement(required = true)
    protected ZadavatelStructure zadavatel;
    protected List<ZakazkaStructure> zakazka;
    @XmlAnyElement
    protected List<Element> any;

    /**
     * Gets the value of the profilKod property.
     * 
     * @return
     *     possible object is
     *     {@link ProfilKodType }
     *     
     */
    public ProfilKodType getProfilKod() {
        return profilKod;
    }

    /**
     * Sets the value of the profilKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfilKodType }
     *     
     */
    public void setProfilKod(ProfilKodType value) {
        this.profilKod = value;
    }

    /**
     * Gets the value of the zadavatel property.
     * 
     * @return
     *     possible object is
     *     {@link ZadavatelStructure }
     *     
     */
    public ZadavatelStructure getZadavatel() {
        return zadavatel;
    }

    /**
     * Sets the value of the zadavatel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZadavatelStructure }
     *     
     */
    public void setZadavatel(ZadavatelStructure value) {
        this.zadavatel = value;
    }

    /**
     * Gets the value of the zakazka property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zakazka property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZakazka().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZakazkaStructure }
     * 
     * 
     */
    public List<ZakazkaStructure> getZakazka() {
        if (zakazka == null) {
            zakazka = new ArrayList<ZakazkaStructure>();
        }
        return this.zakazka;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * 
     * 
     */
    public List<Element> getAny() {
        if (any == null) {
            any = new ArrayList<Element>();
        }
        return this.any;
    }

}
