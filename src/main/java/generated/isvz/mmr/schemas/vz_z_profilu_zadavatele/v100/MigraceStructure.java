//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.23 at 01:46:39 AM CET 
//


package generated.isvz.mmr.schemas.vz_z_profilu_zadavatele.v100;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MigraceStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MigraceStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kod_vz_na_profilu_puvodni" type="{urn:cz:isvz:mmr:schemas:vz-z-profilu-zadavatele:v100}KodVzNaProfiluType"/>
 *         &lt;element name="profil_kod_puvodni" type="{urn:cz:isvz:mmr:schemas:vz-z-profilu-zadavatele:v100}ProfilKodType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MigraceStructure", propOrder = {
    "kodVzNaProfiluPuvodni",
    "profilKodPuvodni"
})
public class MigraceStructure {

    @XmlElement(name = "kod_vz_na_profilu_puvodni", required = true)
    protected KodVzNaProfiluType kodVzNaProfiluPuvodni;
    @XmlElement(name = "profil_kod_puvodni", required = true)
    protected ProfilKodType profilKodPuvodni;

    /**
     * Gets the value of the kodVzNaProfiluPuvodni property.
     * 
     * @return
     *     possible object is
     *     {@link KodVzNaProfiluType }
     *     
     */
    public KodVzNaProfiluType getKodVzNaProfiluPuvodni() {
        return kodVzNaProfiluPuvodni;
    }

    /**
     * Sets the value of the kodVzNaProfiluPuvodni property.
     * 
     * @param value
     *     allowed object is
     *     {@link KodVzNaProfiluType }
     *     
     */
    public void setKodVzNaProfiluPuvodni(KodVzNaProfiluType value) {
        this.kodVzNaProfiluPuvodni = value;
    }

    /**
     * Gets the value of the profilKodPuvodni property.
     * 
     * @return
     *     possible object is
     *     {@link ProfilKodType }
     *     
     */
    public ProfilKodType getProfilKodPuvodni() {
        return profilKodPuvodni;
    }

    /**
     * Sets the value of the profilKodPuvodni property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfilKodType }
     *     
     */
    public void setProfilKodPuvodni(ProfilKodType value) {
        this.profilKodPuvodni = value;
    }

}
