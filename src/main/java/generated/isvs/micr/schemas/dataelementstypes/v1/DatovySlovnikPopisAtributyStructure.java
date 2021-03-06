//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.23 at 01:46:39 AM CET 
//


package generated.isvs.micr.schemas.dataelementstypes.v1;

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


/**
 * Struktura, zahrnující popis atributů datového slovníku.
 * 
 * <p>Java class for DatovySlovnikPopisAtributyStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatovySlovnikPopisAtributyStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SkupinaKod" type="{urn:cz:isvs:micr:schemas:DataElementsTypes:v1}DatovyPrvekSkupinaKodType"/>
 *         &lt;element name="SkupinaNazev" type="{urn:cz:isvs:micr:schemas:DataElementsTypes:v1}DatovyPrvekSkupinaNazevType" minOccurs="0"/>
 *         &lt;element name="Definice" type="{urn:cz:isvs:micr:schemas:DataElementsTypes:v1}DatovySlovnikDefiniceType" minOccurs="0"/>
 *         &lt;element name="VyhlaseniDatum" type="{urn:cz:isvs:micr:schemas:DataElementsTypes:v1}VyhlaseniDatumType" minOccurs="0"/>
 *         &lt;element name="PlatnostOdDatum" type="{urn:cz:isvs:micr:schemas:DataElementsTypes:v1}PlatnostOdDatumType" minOccurs="0"/>
 *         &lt;element name="PlatnostDoDatum" type="{urn:cz:isvs:micr:schemas:DataElementsTypes:v1}PlatnostDoDatumType" minOccurs="0"/>
 *         &lt;element name="OblastKod" type="{urn:cz:isvs:micr:schemas:DataElementsTypes:v1}DatovyPrvekOblastKodType"/>
 *         &lt;element name="OblastNazev" type="{urn:cz:isvs:micr:schemas:DataElementsTypes:v1}DatovyPrvekOblastNazevType" minOccurs="0"/>
 *         &lt;element name="SchemaSoubor" type="{urn:cz:isvs:micr:schemas:DataElementsTypes:v1}DatovySlovnikSchemaSouborType" minOccurs="0"/>
 *         &lt;element name="SchemaAdresa" type="{urn:cz:isvs:micr:schemas:DataElementsTypes:v1}DatovySlovnikSchemaAdresaType" minOccurs="0"/>
 *         &lt;element name="Verze" type="{urn:cz:isvs:micr:schemas:DataElementsTypes:v1}DatovySlovnikVerzeType" minOccurs="0"/>
 *         &lt;element name="JmennyProstorCilovy" type="{urn:cz:isvs:micr:schemas:DataElementsTypes:v1}DatovySlovnikJmennyProstorCilovyType" minOccurs="0"/>
 *         &lt;element name="JmenneProstorySeznam" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="JmennyProstor" type="{urn:cz:isvs:micr:schemas:DataElementsTypes:v1}JmennyProstorStructure" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ElementTvarDefaultni" type="{urn:cz:isvs:micr:schemas:DataElementsTypes:v1}DatovySlovnikElementTvarDefaultniType"/>
 *         &lt;element name="AtributTvarDefaultni" type="{urn:cz:isvs:micr:schemas:DataElementsTypes:v1}DatovySlovnikAtributTvarDefaultniType"/>
 *         &lt;element name="SchemataImportovanaSeznam" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SchemaImportovane" type="{urn:cz:isvs:micr:schemas:DataElementsTypes:v1}DatovySlovnikSchemaImportovaneStructure" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PravaAutorska" type="{urn:cz:isvs:micr:schemas:DataElementsTypes:v1}PravaAutorskaType" minOccurs="0"/>
 *         &lt;element name="VytvorilSeznam" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Vytvoril" type="{urn:cz:isvs:micr:schemas:DataElementsTypes:v1}VytvorilType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PrispelSeznam" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Prispel" type="{urn:cz:isvs:micr:schemas:DataElementsTypes:v1}PrispelType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="JazykKod" type="{urn:cz:isvs:micr:schemas:DataElementsTypes:v1}JazykKodType" minOccurs="0"/>
 *         &lt;element name="Format" type="{urn:cz:isvs:micr:schemas:DataElementsTypes:v1}FormatType" minOccurs="0"/>
 *         &lt;element name="TypeDublinCore" type="{urn:cz:isvs:micr:schemas:DataElementsTypes:v1}TypeDublinCoreType" minOccurs="0"/>
 *         &lt;element name="Publikoval" type="{urn:cz:isvs:micr:schemas:DataElementsTypes:v1}PublikovalType" minOccurs="0"/>
 *         &lt;element name="KlicovaSlovaSeznam" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="KlicoveSlovo" type="{urn:cz:isvs:micr:schemas:DataElementsTypes:v1}KlicoveSlovoType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Licence" type="{urn:cz:isvs:micr:schemas:DataElementsTypes:v1}LicenceType" minOccurs="0"/>
 *         &lt;element name="DrzitelPrav" type="{urn:cz:isvs:micr:schemas:DataElementsTypes:v1}DrzitelPravType" minOccurs="0"/>
 *         &lt;element name="Puvod" type="{urn:cz:isvs:micr:schemas:DataElementsTypes:v1}PuvodType" minOccurs="0"/>
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
@XmlType(name = "DatovySlovnikPopisAtributyStructure", propOrder = {
    "skupinaKod",
    "skupinaNazev",
    "definice",
    "vyhlaseniDatum",
    "platnostOdDatum",
    "platnostDoDatum",
    "oblastKod",
    "oblastNazev",
    "schemaSoubor",
    "schemaAdresa",
    "verze",
    "jmennyProstorCilovy",
    "jmenneProstorySeznam",
    "elementTvarDefaultni",
    "atributTvarDefaultni",
    "schemataImportovanaSeznam",
    "pravaAutorska",
    "vytvorilSeznam",
    "prispelSeznam",
    "jazykKod",
    "format",
    "typeDublinCore",
    "publikoval",
    "klicovaSlovaSeznam",
    "licence",
    "drzitelPrav",
    "puvod",
    "rozsireni"
})
public class DatovySlovnikPopisAtributyStructure {

    @XmlElement(name = "SkupinaKod", required = true)
    protected DatovyPrvekSkupinaKodType skupinaKod;
    @XmlElement(name = "SkupinaNazev")
    protected DatovyPrvekSkupinaNazevType skupinaNazev;
    @XmlElement(name = "Definice")
    protected DatovySlovnikDefiniceType definice;
    @XmlElement(name = "VyhlaseniDatum")
    protected VyhlaseniDatumType vyhlaseniDatum;
    @XmlElement(name = "PlatnostOdDatum")
    protected PlatnostOdDatumType platnostOdDatum;
    @XmlElement(name = "PlatnostDoDatum")
    protected PlatnostDoDatumType platnostDoDatum;
    @XmlElement(name = "OblastKod", required = true)
    protected DatovyPrvekOblastKodType oblastKod;
    @XmlElement(name = "OblastNazev")
    protected DatovyPrvekOblastNazevType oblastNazev;
    @XmlElement(name = "SchemaSoubor")
    protected DatovySlovnikSchemaSouborType schemaSoubor;
    @XmlElement(name = "SchemaAdresa")
    protected DatovySlovnikSchemaAdresaType schemaAdresa;
    @XmlElement(name = "Verze")
    protected DatovySlovnikVerzeType verze;
    @XmlElement(name = "JmennyProstorCilovy")
    protected DatovySlovnikJmennyProstorCilovyType jmennyProstorCilovy;
    @XmlElement(name = "JmenneProstorySeznam")
    protected JmenneProstorySeznam jmenneProstorySeznam;
    @XmlElement(name = "ElementTvarDefaultni", required = true)
    protected DatovySlovnikElementTvarDefaultniType elementTvarDefaultni;
    @XmlElement(name = "AtributTvarDefaultni", required = true)
    protected DatovySlovnikAtributTvarDefaultniType atributTvarDefaultni;
    @XmlElement(name = "SchemataImportovanaSeznam")
    protected SchemataImportovanaSeznam schemataImportovanaSeznam;
    @XmlElement(name = "PravaAutorska")
    protected PravaAutorskaType pravaAutorska;
    @XmlElement(name = "VytvorilSeznam")
    protected VytvorilSeznam vytvorilSeznam;
    @XmlElement(name = "PrispelSeznam")
    protected PrispelSeznam prispelSeznam;
    @XmlElement(name = "JazykKod")
    protected JazykKodType jazykKod;
    @XmlElement(name = "Format")
    protected FormatType format;
    @XmlElement(name = "TypeDublinCore")
    protected TypeDublinCoreType typeDublinCore;
    @XmlElement(name = "Publikoval")
    protected PublikovalType publikoval;
    @XmlElement(name = "KlicovaSlovaSeznam")
    protected KlicovaSlovaSeznam klicovaSlovaSeznam;
    @XmlElement(name = "Licence")
    protected LicenceType licence;
    @XmlElement(name = "DrzitelPrav")
    protected DrzitelPravType drzitelPrav;
    @XmlElement(name = "Puvod")
    protected PuvodType puvod;
    @XmlElement(name = "Rozsireni", namespace = "urn:cz:isvs:micr:schemas:CommonTypes:v1")
    protected RozsireniStructure rozsireni;
    @XmlAttribute(name = "objektID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String objektID;

    /**
     * Gets the value of the skupinaKod property.
     * 
     * @return
     *     possible object is
     *     {@link DatovyPrvekSkupinaKodType }
     *     
     */
    public DatovyPrvekSkupinaKodType getSkupinaKod() {
        return skupinaKod;
    }

    /**
     * Sets the value of the skupinaKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatovyPrvekSkupinaKodType }
     *     
     */
    public void setSkupinaKod(DatovyPrvekSkupinaKodType value) {
        this.skupinaKod = value;
    }

    /**
     * Gets the value of the skupinaNazev property.
     * 
     * @return
     *     possible object is
     *     {@link DatovyPrvekSkupinaNazevType }
     *     
     */
    public DatovyPrvekSkupinaNazevType getSkupinaNazev() {
        return skupinaNazev;
    }

    /**
     * Sets the value of the skupinaNazev property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatovyPrvekSkupinaNazevType }
     *     
     */
    public void setSkupinaNazev(DatovyPrvekSkupinaNazevType value) {
        this.skupinaNazev = value;
    }

    /**
     * Gets the value of the definice property.
     * 
     * @return
     *     possible object is
     *     {@link DatovySlovnikDefiniceType }
     *     
     */
    public DatovySlovnikDefiniceType getDefinice() {
        return definice;
    }

    /**
     * Sets the value of the definice property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatovySlovnikDefiniceType }
     *     
     */
    public void setDefinice(DatovySlovnikDefiniceType value) {
        this.definice = value;
    }

    /**
     * Gets the value of the vyhlaseniDatum property.
     * 
     * @return
     *     possible object is
     *     {@link VyhlaseniDatumType }
     *     
     */
    public VyhlaseniDatumType getVyhlaseniDatum() {
        return vyhlaseniDatum;
    }

    /**
     * Sets the value of the vyhlaseniDatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link VyhlaseniDatumType }
     *     
     */
    public void setVyhlaseniDatum(VyhlaseniDatumType value) {
        this.vyhlaseniDatum = value;
    }

    /**
     * Gets the value of the platnostOdDatum property.
     * 
     * @return
     *     possible object is
     *     {@link PlatnostOdDatumType }
     *     
     */
    public PlatnostOdDatumType getPlatnostOdDatum() {
        return platnostOdDatum;
    }

    /**
     * Sets the value of the platnostOdDatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlatnostOdDatumType }
     *     
     */
    public void setPlatnostOdDatum(PlatnostOdDatumType value) {
        this.platnostOdDatum = value;
    }

    /**
     * Gets the value of the platnostDoDatum property.
     * 
     * @return
     *     possible object is
     *     {@link PlatnostDoDatumType }
     *     
     */
    public PlatnostDoDatumType getPlatnostDoDatum() {
        return platnostDoDatum;
    }

    /**
     * Sets the value of the platnostDoDatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlatnostDoDatumType }
     *     
     */
    public void setPlatnostDoDatum(PlatnostDoDatumType value) {
        this.platnostDoDatum = value;
    }

    /**
     * Gets the value of the oblastKod property.
     * 
     * @return
     *     possible object is
     *     {@link DatovyPrvekOblastKodType }
     *     
     */
    public DatovyPrvekOblastKodType getOblastKod() {
        return oblastKod;
    }

    /**
     * Sets the value of the oblastKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatovyPrvekOblastKodType }
     *     
     */
    public void setOblastKod(DatovyPrvekOblastKodType value) {
        this.oblastKod = value;
    }

    /**
     * Gets the value of the oblastNazev property.
     * 
     * @return
     *     possible object is
     *     {@link DatovyPrvekOblastNazevType }
     *     
     */
    public DatovyPrvekOblastNazevType getOblastNazev() {
        return oblastNazev;
    }

    /**
     * Sets the value of the oblastNazev property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatovyPrvekOblastNazevType }
     *     
     */
    public void setOblastNazev(DatovyPrvekOblastNazevType value) {
        this.oblastNazev = value;
    }

    /**
     * Gets the value of the schemaSoubor property.
     * 
     * @return
     *     possible object is
     *     {@link DatovySlovnikSchemaSouborType }
     *     
     */
    public DatovySlovnikSchemaSouborType getSchemaSoubor() {
        return schemaSoubor;
    }

    /**
     * Sets the value of the schemaSoubor property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatovySlovnikSchemaSouborType }
     *     
     */
    public void setSchemaSoubor(DatovySlovnikSchemaSouborType value) {
        this.schemaSoubor = value;
    }

    /**
     * Gets the value of the schemaAdresa property.
     * 
     * @return
     *     possible object is
     *     {@link DatovySlovnikSchemaAdresaType }
     *     
     */
    public DatovySlovnikSchemaAdresaType getSchemaAdresa() {
        return schemaAdresa;
    }

    /**
     * Sets the value of the schemaAdresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatovySlovnikSchemaAdresaType }
     *     
     */
    public void setSchemaAdresa(DatovySlovnikSchemaAdresaType value) {
        this.schemaAdresa = value;
    }

    /**
     * Gets the value of the verze property.
     * 
     * @return
     *     possible object is
     *     {@link DatovySlovnikVerzeType }
     *     
     */
    public DatovySlovnikVerzeType getVerze() {
        return verze;
    }

    /**
     * Sets the value of the verze property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatovySlovnikVerzeType }
     *     
     */
    public void setVerze(DatovySlovnikVerzeType value) {
        this.verze = value;
    }

    /**
     * Gets the value of the jmennyProstorCilovy property.
     * 
     * @return
     *     possible object is
     *     {@link DatovySlovnikJmennyProstorCilovyType }
     *     
     */
    public DatovySlovnikJmennyProstorCilovyType getJmennyProstorCilovy() {
        return jmennyProstorCilovy;
    }

    /**
     * Sets the value of the jmennyProstorCilovy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatovySlovnikJmennyProstorCilovyType }
     *     
     */
    public void setJmennyProstorCilovy(DatovySlovnikJmennyProstorCilovyType value) {
        this.jmennyProstorCilovy = value;
    }

    /**
     * Gets the value of the jmenneProstorySeznam property.
     * 
     * @return
     *     possible object is
     *     {@link JmenneProstorySeznam }
     *     
     */
    public JmenneProstorySeznam getJmenneProstorySeznam() {
        return jmenneProstorySeznam;
    }

    /**
     * Sets the value of the jmenneProstorySeznam property.
     * 
     * @param value
     *     allowed object is
     *     {@link JmenneProstorySeznam }
     *     
     */
    public void setJmenneProstorySeznam(JmenneProstorySeznam value) {
        this.jmenneProstorySeznam = value;
    }

    /**
     * Gets the value of the elementTvarDefaultni property.
     * 
     * @return
     *     possible object is
     *     {@link DatovySlovnikElementTvarDefaultniType }
     *     
     */
    public DatovySlovnikElementTvarDefaultniType getElementTvarDefaultni() {
        return elementTvarDefaultni;
    }

    /**
     * Sets the value of the elementTvarDefaultni property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatovySlovnikElementTvarDefaultniType }
     *     
     */
    public void setElementTvarDefaultni(DatovySlovnikElementTvarDefaultniType value) {
        this.elementTvarDefaultni = value;
    }

    /**
     * Gets the value of the atributTvarDefaultni property.
     * 
     * @return
     *     possible object is
     *     {@link DatovySlovnikAtributTvarDefaultniType }
     *     
     */
    public DatovySlovnikAtributTvarDefaultniType getAtributTvarDefaultni() {
        return atributTvarDefaultni;
    }

    /**
     * Sets the value of the atributTvarDefaultni property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatovySlovnikAtributTvarDefaultniType }
     *     
     */
    public void setAtributTvarDefaultni(DatovySlovnikAtributTvarDefaultniType value) {
        this.atributTvarDefaultni = value;
    }

    /**
     * Gets the value of the schemataImportovanaSeznam property.
     * 
     * @return
     *     possible object is
     *     {@link SchemataImportovanaSeznam }
     *     
     */
    public SchemataImportovanaSeznam getSchemataImportovanaSeznam() {
        return schemataImportovanaSeznam;
    }

    /**
     * Sets the value of the schemataImportovanaSeznam property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemataImportovanaSeznam }
     *     
     */
    public void setSchemataImportovanaSeznam(SchemataImportovanaSeznam value) {
        this.schemataImportovanaSeznam = value;
    }

    /**
     * Gets the value of the pravaAutorska property.
     * 
     * @return
     *     possible object is
     *     {@link PravaAutorskaType }
     *     
     */
    public PravaAutorskaType getPravaAutorska() {
        return pravaAutorska;
    }

    /**
     * Sets the value of the pravaAutorska property.
     * 
     * @param value
     *     allowed object is
     *     {@link PravaAutorskaType }
     *     
     */
    public void setPravaAutorska(PravaAutorskaType value) {
        this.pravaAutorska = value;
    }

    /**
     * Gets the value of the vytvorilSeznam property.
     * 
     * @return
     *     possible object is
     *     {@link VytvorilSeznam }
     *     
     */
    public VytvorilSeznam getVytvorilSeznam() {
        return vytvorilSeznam;
    }

    /**
     * Sets the value of the vytvorilSeznam property.
     * 
     * @param value
     *     allowed object is
     *     {@link VytvorilSeznam }
     *     
     */
    public void setVytvorilSeznam(VytvorilSeznam value) {
        this.vytvorilSeznam = value;
    }

    /**
     * Gets the value of the prispelSeznam property.
     * 
     * @return
     *     possible object is
     *     {@link PrispelSeznam }
     *     
     */
    public PrispelSeznam getPrispelSeznam() {
        return prispelSeznam;
    }

    /**
     * Sets the value of the prispelSeznam property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrispelSeznam }
     *     
     */
    public void setPrispelSeznam(PrispelSeznam value) {
        this.prispelSeznam = value;
    }

    /**
     * Gets the value of the jazykKod property.
     * 
     * @return
     *     possible object is
     *     {@link JazykKodType }
     *     
     */
    public JazykKodType getJazykKod() {
        return jazykKod;
    }

    /**
     * Sets the value of the jazykKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JazykKodType }
     *     
     */
    public void setJazykKod(JazykKodType value) {
        this.jazykKod = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link FormatType }
     *     
     */
    public FormatType getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormatType }
     *     
     */
    public void setFormat(FormatType value) {
        this.format = value;
    }

    /**
     * Gets the value of the typeDublinCore property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDublinCoreType }
     *     
     */
    public TypeDublinCoreType getTypeDublinCore() {
        return typeDublinCore;
    }

    /**
     * Sets the value of the typeDublinCore property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDublinCoreType }
     *     
     */
    public void setTypeDublinCore(TypeDublinCoreType value) {
        this.typeDublinCore = value;
    }

    /**
     * Gets the value of the publikoval property.
     * 
     * @return
     *     possible object is
     *     {@link PublikovalType }
     *     
     */
    public PublikovalType getPublikoval() {
        return publikoval;
    }

    /**
     * Sets the value of the publikoval property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublikovalType }
     *     
     */
    public void setPublikoval(PublikovalType value) {
        this.publikoval = value;
    }

    /**
     * Gets the value of the klicovaSlovaSeznam property.
     * 
     * @return
     *     possible object is
     *     {@link KlicovaSlovaSeznam }
     *     
     */
    public KlicovaSlovaSeznam getKlicovaSlovaSeznam() {
        return klicovaSlovaSeznam;
    }

    /**
     * Sets the value of the klicovaSlovaSeznam property.
     * 
     * @param value
     *     allowed object is
     *     {@link KlicovaSlovaSeznam }
     *     
     */
    public void setKlicovaSlovaSeznam(KlicovaSlovaSeznam value) {
        this.klicovaSlovaSeznam = value;
    }

    /**
     * Gets the value of the licence property.
     * 
     * @return
     *     possible object is
     *     {@link LicenceType }
     *     
     */
    public LicenceType getLicence() {
        return licence;
    }

    /**
     * Sets the value of the licence property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenceType }
     *     
     */
    public void setLicence(LicenceType value) {
        this.licence = value;
    }

    /**
     * Gets the value of the drzitelPrav property.
     * 
     * @return
     *     possible object is
     *     {@link DrzitelPravType }
     *     
     */
    public DrzitelPravType getDrzitelPrav() {
        return drzitelPrav;
    }

    /**
     * Sets the value of the drzitelPrav property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrzitelPravType }
     *     
     */
    public void setDrzitelPrav(DrzitelPravType value) {
        this.drzitelPrav = value;
    }

    /**
     * Gets the value of the puvod property.
     * 
     * @return
     *     possible object is
     *     {@link PuvodType }
     *     
     */
    public PuvodType getPuvod() {
        return puvod;
    }

    /**
     * Sets the value of the puvod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PuvodType }
     *     
     */
    public void setPuvod(PuvodType value) {
        this.puvod = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="JmennyProstor" type="{urn:cz:isvs:micr:schemas:DataElementsTypes:v1}JmennyProstorStructure" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "jmennyProstor"
    })
    public static class JmenneProstorySeznam {

        @XmlElement(name = "JmennyProstor", required = true)
        protected List<JmennyProstorStructure> jmennyProstor;

        /**
         * Gets the value of the jmennyProstor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the jmennyProstor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getJmennyProstor().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JmennyProstorStructure }
         * 
         * 
         */
        public List<JmennyProstorStructure> getJmennyProstor() {
            if (jmennyProstor == null) {
                jmennyProstor = new ArrayList<JmennyProstorStructure>();
            }
            return this.jmennyProstor;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="KlicoveSlovo" type="{urn:cz:isvs:micr:schemas:DataElementsTypes:v1}KlicoveSlovoType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "klicoveSlovo"
    })
    public static class KlicovaSlovaSeznam {

        @XmlElement(name = "KlicoveSlovo", required = true)
        protected List<KlicoveSlovoType> klicoveSlovo;

        /**
         * Gets the value of the klicoveSlovo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the klicoveSlovo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getKlicoveSlovo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link KlicoveSlovoType }
         * 
         * 
         */
        public List<KlicoveSlovoType> getKlicoveSlovo() {
            if (klicoveSlovo == null) {
                klicoveSlovo = new ArrayList<KlicoveSlovoType>();
            }
            return this.klicoveSlovo;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Prispel" type="{urn:cz:isvs:micr:schemas:DataElementsTypes:v1}PrispelType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "prispel"
    })
    public static class PrispelSeznam {

        @XmlElement(name = "Prispel")
        protected PrispelType prispel;

        /**
         * Gets the value of the prispel property.
         * 
         * @return
         *     possible object is
         *     {@link PrispelType }
         *     
         */
        public PrispelType getPrispel() {
            return prispel;
        }

        /**
         * Sets the value of the prispel property.
         * 
         * @param value
         *     allowed object is
         *     {@link PrispelType }
         *     
         */
        public void setPrispel(PrispelType value) {
            this.prispel = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="SchemaImportovane" type="{urn:cz:isvs:micr:schemas:DataElementsTypes:v1}DatovySlovnikSchemaImportovaneStructure" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "schemaImportovane"
    })
    public static class SchemataImportovanaSeznam {

        @XmlElement(name = "SchemaImportovane", required = true)
        protected List<DatovySlovnikSchemaImportovaneStructure> schemaImportovane;

        /**
         * Gets the value of the schemaImportovane property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the schemaImportovane property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSchemaImportovane().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DatovySlovnikSchemaImportovaneStructure }
         * 
         * 
         */
        public List<DatovySlovnikSchemaImportovaneStructure> getSchemaImportovane() {
            if (schemaImportovane == null) {
                schemaImportovane = new ArrayList<DatovySlovnikSchemaImportovaneStructure>();
            }
            return this.schemaImportovane;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Vytvoril" type="{urn:cz:isvs:micr:schemas:DataElementsTypes:v1}VytvorilType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "vytvoril"
    })
    public static class VytvorilSeznam {

        @XmlElement(name = "Vytvoril")
        protected VytvorilType vytvoril;

        /**
         * Gets the value of the vytvoril property.
         * 
         * @return
         *     possible object is
         *     {@link VytvorilType }
         *     
         */
        public VytvorilType getVytvoril() {
            return vytvoril;
        }

        /**
         * Sets the value of the vytvoril property.
         * 
         * @param value
         *     allowed object is
         *     {@link VytvorilType }
         *     
         */
        public void setVytvoril(VytvorilType value) {
            this.vytvoril = value;
        }

    }

}
