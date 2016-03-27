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

import generated.isvs.micr.schemas.commontypes.v1.URLType;
import generated.isvs.micr.schemas.corecomponenttypes.v1.DatumCasType;
import generated.isvs.micr.schemas.corecomponenttypes.v1.PocetType;
import org.w3c.dom.Element;


/**
 * <p>Java class for DokumentVzStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DokumentVzStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="url" type="{urn:cz:isvs:micr:schemas:CommonTypes:v1}URLType" minOccurs="0"/>
 *         &lt;element name="typ_dokumentu" type="{urn:cz:isvz:mmr:schemas:vz-z-profilu-zadavatele:v100}TypDokumentuType" minOccurs="0"/>
 *         &lt;element name="jiny_dokument_nazev" type="{urn:cz:isvz:mmr:schemas:vz-z-profilu-zadavatele:v100}NazevType" minOccurs="0"/>
 *         &lt;element name="cas_vlozeni_na_profil" type="{urn:cz:isvs:micr:schemas:CoreComponentTypes:v1}DatumCasType" minOccurs="0"/>
 *         &lt;element name="cislo_verze" type="{urn:cz:isvs:micr:schemas:CoreComponentTypes:v1}PocetType" minOccurs="0"/>
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
@XmlType(name = "DokumentVzStructure", propOrder = {
    "url",
    "typDokumentu",
    "jinyDokumentNazev",
    "casVlozeniNaProfil",
    "cisloVerze",
    "any"
})
public class DokumentVzStructure {

    protected URLType url;
    @XmlElement(name = "typ_dokumentu")
    protected TypDokumentuType typDokumentu;
    @XmlElement(name = "jiny_dokument_nazev")
    protected NazevType jinyDokumentNazev;
    @XmlElement(name = "cas_vlozeni_na_profil")
    protected DatumCasType casVlozeniNaProfil;
    @XmlElement(name = "cislo_verze")
    protected PocetType cisloVerze;
    @XmlAnyElement
    protected List<Element> any;

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link URLType }
     *     
     */
    public URLType getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link URLType }
     *     
     */
    public void setUrl(URLType value) {
        this.url = value;
    }

    /**
     * Gets the value of the typDokumentu property.
     * 
     * @return
     *     possible object is
     *     {@link TypDokumentuType }
     *     
     */
    public TypDokumentuType getTypDokumentu() {
        return typDokumentu;
    }

    /**
     * Sets the value of the typDokumentu property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypDokumentuType }
     *     
     */
    public void setTypDokumentu(TypDokumentuType value) {
        this.typDokumentu = value;
    }

    /**
     * Gets the value of the jinyDokumentNazev property.
     * 
     * @return
     *     possible object is
     *     {@link NazevType }
     *     
     */
    public NazevType getJinyDokumentNazev() {
        return jinyDokumentNazev;
    }

    /**
     * Sets the value of the jinyDokumentNazev property.
     * 
     * @param value
     *     allowed object is
     *     {@link NazevType }
     *     
     */
    public void setJinyDokumentNazev(NazevType value) {
        this.jinyDokumentNazev = value;
    }

    /**
     * Gets the value of the casVlozeniNaProfil property.
     * 
     * @return
     *     possible object is
     *     {@link DatumCasType }
     *     
     */
    public DatumCasType getCasVlozeniNaProfil() {
        return casVlozeniNaProfil;
    }

    /**
     * Sets the value of the casVlozeniNaProfil property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatumCasType }
     *     
     */
    public void setCasVlozeniNaProfil(DatumCasType value) {
        this.casVlozeniNaProfil = value;
    }

    /**
     * Gets the value of the cisloVerze property.
     * 
     * @return
     *     possible object is
     *     {@link PocetType }
     *     
     */
    public PocetType getCisloVerze() {
        return cisloVerze;
    }

    /**
     * Sets the value of the cisloVerze property.
     * 
     * @param value
     *     allowed object is
     *     {@link PocetType }
     *     
     */
    public void setCisloVerze(PocetType value) {
        this.cisloVerze = value;
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
