//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.23 at 01:46:39 AM CET 
//


package generated.isvs.micr.schemas.corecomponenttypes.v1;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;

import generated.isvs.micr.schemas.businesstypes.v2.NeziskovaInstituceSluzbaType;
import generated.isvs.micr.schemas.businesstypes.v2.StatutarniOrganDruhType;
import generated.isvs.micr.schemas.businesstypes.v2.SubjektObchodniJmenoType;
import generated.isvs.micr.schemas.businesstypes.v2.SubjektObchodniJmenoZkraceneType;
import generated.isvs.micr.schemas.businesstypes.v2.SubjektPredmetPodnikaniType;
import generated.isvs.micr.schemas.businesstypes.v2.SubjektProvozType;
import generated.isvs.micr.schemas.businesstypes.v2.SubjektVlastnikPodilType;
import generated.isvs.micr.schemas.businesstypes.v2.VladniInstituceFunkceType;
import generated.isvs.micr.schemas.commontypes.v1.DatumMezinarodniType;
import generated.isvs.micr.schemas.commontypes.v1.DokumentNazevType;
import generated.isvs.micr.schemas.commontypes.v1.DokumentObsahTextType;
import generated.isvs.micr.schemas.commontypes.v1.DokumentPopisType;
import generated.isvs.micr.schemas.commontypes.v1.MenaType;
import generated.isvs.micr.schemas.commontypes.v1.MernaJednotkaNazevType;
import generated.isvs.micr.schemas.commontypes.v1.ObdobiSledovaneDobaType;
import generated.isvs.micr.schemas.commontypes.v1.PravniPredpisCitaceType;
import generated.isvs.micr.schemas.commontypes.v1.RokType;
import generated.isvs.micr.schemas.commontypes.v1.SmlouvaPopisType;
import generated.isvs.micr.schemas.dataelementstypes.v1.DatovyKonstruktDilciMaximumVyskytPocetType;
import generated.isvs.micr.schemas.dataelementstypes.v1.DatovyKonstruktDilciMinimumVyskytPocetType;
import generated.isvs.micr.schemas.dataelementstypes.v1.DatovyKonstruktDilciUdajeDoplnujiciType;
import generated.isvs.micr.schemas.dataelementstypes.v1.DatovyKonstruktDilciVyskytPodminkaType;
import generated.isvs.micr.schemas.dataelementstypes.v1.DatovyKonstruktDilciZpracovaniZpusobType;
import generated.isvs.micr.schemas.dataelementstypes.v1.DatovyPrvekCiselnikNazevType;
import generated.isvs.micr.schemas.dataelementstypes.v1.DatovyPrvekCiselnikPolozkaNazevType;
import generated.isvs.micr.schemas.dataelementstypes.v1.DatovyPrvekCiselnikPolozkaNazevZkracenyType;
import generated.isvs.micr.schemas.dataelementstypes.v1.DatovyPrvekCiselnikSpravceType;
import generated.isvs.micr.schemas.dataelementstypes.v1.DatovyPrvekDefiniceType;
import generated.isvs.micr.schemas.dataelementstypes.v1.DatovyPrvekDelkaMaximalniType;
import generated.isvs.micr.schemas.dataelementstypes.v1.DatovyPrvekHodnotaDruhType;
import generated.isvs.micr.schemas.dataelementstypes.v1.DatovyPrvekHodnotyPripustneType;
import generated.isvs.micr.schemas.dataelementstypes.v1.DatovyPrvekKomentarType;
import generated.isvs.micr.schemas.dataelementstypes.v1.DatovyPrvekNazevType;
import generated.isvs.micr.schemas.dataelementstypes.v1.DatovyPrvekPredpisJinyType;
import generated.isvs.micr.schemas.dataelementstypes.v1.DatovyPrvekPredpisPravniType;
import generated.isvs.micr.schemas.dataelementstypes.v1.DatovyPrvekPrezentaceFormaType;
import generated.isvs.micr.schemas.dataelementstypes.v1.DatovyPrvekPrezentaceKategorieType;
import generated.isvs.micr.schemas.dataelementstypes.v1.DatovyPrvekPrezentaceSchemaType;
import generated.isvs.micr.schemas.dataelementstypes.v1.DatovyPrvekSkupinaNazevType;
import generated.isvs.micr.schemas.dataelementstypes.v1.DatovyPrvekSpravceType;
import generated.isvs.micr.schemas.dataelementstypes.v1.DatovyPrvekSynonymumType;
import generated.isvs.micr.schemas.dataelementstypes.v1.DatovyPrvekVyrazRegularniType;
import generated.isvs.micr.schemas.dataelementstypes.v1.DatovyPrvekZdrojHodnotType;
import generated.isvs.micr.schemas.dataelementstypes.v1.DatovySlovnikAtributTvarDefaultniType;
import generated.isvs.micr.schemas.dataelementstypes.v1.DatovySlovnikDefiniceType;
import generated.isvs.micr.schemas.dataelementstypes.v1.DatovySlovnikElementTvarDefaultniType;
import generated.isvs.micr.schemas.dataelementstypes.v1.KlicoveSlovoType;
import generated.isvs.micr.schemas.dataelementstypes.v1.PravaAutorskaType;
import generated.isvs.micr.schemas.dataelementstypes.v1.PrispelType;
import generated.isvs.micr.schemas.dataelementstypes.v1.PublikovalType;
import generated.isvs.micr.schemas.dataelementstypes.v1.PuvodType;
import generated.isvs.micr.schemas.dataelementstypes.v1.VytvorilType;
import generated.isvs.micr.schemas.persontypes.v2.DokladUradVydaniType;
import generated.isvs.micr.schemas.persontypes.v2.OsobaDiagnozaPlnyNazevType;
import generated.isvs.micr.schemas.persontypes.v2.OsobaDiagnozaType;
import generated.isvs.micr.schemas.persontypes.v2.OsobaJazykZnalostNazevType;
import generated.isvs.micr.schemas.persontypes.v2.OsobaJmenoType;
import generated.isvs.micr.schemas.persontypes.v2.OsobaPrijmeniType;
import generated.isvs.micr.schemas.persontypes.v2.OsobaTitulPredJmenemType;
import generated.isvs.micr.schemas.persontypes.v2.OsobaTitulZaJmenemType;
import generated.isvs.micr.schemas.persontypes.v2.OsobaZamestnaniPostaveniType;
import generated.isvs.micr.schemas.persontypes.v2.OsobniSpotrebaDruhType;
import generated.isvs.micr.schemas.persontypes.v2.PracovniPomerDruhType;
import generated.isvs.micr.schemas.persontypes.v2.PrijmeniBazeType;
import generated.isvs.micr.schemas.spacetypes.v1.AdresaTextType;
import generated.isvs.micr.schemas.spacetypes.v1.CastObceNazevType;
import generated.isvs.micr.schemas.spacetypes.v1.CastObceZkracenyNazevType;
import generated.isvs.micr.schemas.spacetypes.v1.KatastrNazevType;
import generated.isvs.micr.schemas.spacetypes.v1.KatastrSouradniceType;
import generated.isvs.micr.schemas.spacetypes.v1.KrajNazevType;
import generated.isvs.micr.schemas.spacetypes.v1.MestskaCastNazevType;
import generated.isvs.micr.schemas.spacetypes.v1.ObecNazevType;
import generated.isvs.micr.schemas.spacetypes.v1.ObecPoverenyUradNazevType;
import generated.isvs.micr.schemas.spacetypes.v1.ObecRozsirenaPusobnostNazevType;
import generated.isvs.micr.schemas.spacetypes.v1.ObecSouradniceType;
import generated.isvs.micr.schemas.spacetypes.v1.ObecZkracenyNazevType;
import generated.isvs.micr.schemas.spacetypes.v1.OblastNazevType;
import generated.isvs.micr.schemas.spacetypes.v1.ObvodPrahaNazevType;
import generated.isvs.micr.schemas.spacetypes.v1.ObvodPrahaStatistickyNazevType;
import generated.isvs.micr.schemas.spacetypes.v1.OkresNazevType;
import generated.isvs.micr.schemas.spacetypes.v1.ParcelaSouradniceType;
import generated.isvs.micr.schemas.spacetypes.v1.PostaDodaciNazevType;
import generated.isvs.micr.schemas.spacetypes.v1.PostaDodaciZkracenyNazevType;
import generated.isvs.micr.schemas.spacetypes.v1.PostaProvozovnaNazevType;
import generated.isvs.micr.schemas.spacetypes.v1.SpravniObvodPrahaNazevType;
import generated.isvs.micr.schemas.spacetypes.v1.StatType;
import generated.isvs.micr.schemas.spacetypes.v1.StatZkracenyNazevType;
import generated.isvs.micr.schemas.spacetypes.v1.UliceNazevType;
import generated.isvs.micr.schemas.spacetypes.v1.UliceZkracenyNazevType;
import generated.isvs.micr.schemas.spacetypes.v1.ZakladniSidelniJednotkaNazevType;
import generated.isvs.micr.schemas.spacetypes.v1.ZakladniSidelniJednotkaSouradniceType;
import generated.isvz.mmr.schemas.vz_z_profilu_zadavatele.v100.IcoType;
import generated.isvz.mmr.schemas.vz_z_profilu_zadavatele.v100.NazevVZType;
import generated.isvz.mmr.schemas.vz_z_profilu_zadavatele.v100.PoznamkaType;


/**
 * Znakov� �et�zec, obecn� ve form�tu voln�ho textu i v�ce slov; voliteln� spolu s dopl�kovou informac� o jazyku
 * <p/>
 * <p>Java class for TextType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="TextType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="jazykKod" type="{urn:cz:isvs:micr:schemas:CoreComponentTypes:v1}jazykType" />
 *       &lt;attribute name="objektID" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;anyAttribute/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextType", propOrder = {
        "value"
})
@XmlSeeAlso({
        IcoType.class,
        NazevVZType.class,
        PoznamkaType.class,
        generated.isvz.mmr.schemas.vz_z_profilu_zadavatele.v100.NazevType.class,
        DokumentObsahTextType.class,
        MenaType.class,
        ObdobiSledovaneDobaType.class,
        DatumMezinarodniType.class,
        DokumentNazevType.class,
        PravniPredpisCitaceType.class,
        RokType.class,
        SmlouvaPopisType.class,
        DokumentPopisType.class,
        MernaJednotkaNazevType.class,
        SubjektObchodniJmenoZkraceneType.class,
        NeziskovaInstituceSluzbaType.class,
        VladniInstituceFunkceType.class,
        SubjektVlastnikPodilType.class,
        StatutarniOrganDruhType.class,
        SubjektPredmetPodnikaniType.class,
        SubjektObchodniJmenoType.class,
        SubjektProvozType.class,
        generated.isvs.micr.schemas.corecomponenttypes.v1.NazevType.class,
        OsobaJmenoType.class,
        OsobaTitulZaJmenemType.class,
        OsobaJazykZnalostNazevType.class,
        OsobaDiagnozaType.class,
        OsobaPrijmeniType.class,
        OsobniSpotrebaDruhType.class,
        OsobaTitulPredJmenemType.class,
        OsobaDiagnozaPlnyNazevType.class,
        generated.isvs.micr.schemas.persontypes.v2.JazykType.class,
        DokladUradVydaniType.class,
        OsobaZamestnaniPostaveniType.class,
        PracovniPomerDruhType.class,
        PrijmeniBazeType.class,
        PostaDodaciZkracenyNazevType.class,
        ZakladniSidelniJednotkaNazevType.class,
        KatastrSouradniceType.class,
        MestskaCastNazevType.class,
        ZakladniSidelniJednotkaSouradniceType.class,
        ObvodPrahaNazevType.class,
        PostaProvozovnaNazevType.class,
        ObecSouradniceType.class,
        KatastrNazevType.class,
        OblastNazevType.class,
        ObecZkracenyNazevType.class,
        ObvodPrahaStatistickyNazevType.class,
        OkresNazevType.class,
        UliceZkracenyNazevType.class,
        ObecNazevType.class,
        SpravniObvodPrahaNazevType.class,
        CastObceNazevType.class,
        StatZkracenyNazevType.class,
        StatType.class,
        ObecRozsirenaPusobnostNazevType.class,
        ObecPoverenyUradNazevType.class,
        KrajNazevType.class,
        AdresaTextType.class,
        CastObceZkracenyNazevType.class,
        PostaDodaciNazevType.class,
        ParcelaSouradniceType.class,
        UliceNazevType.class,
        DatovyPrvekSpravceType.class,
        DatovyKonstruktDilciUdajeDoplnujiciType.class,
        DatovyPrvekPrezentaceKategorieType.class,
        DatovyPrvekPredpisPravniType.class,
        DatovyKonstruktDilciMinimumVyskytPocetType.class,
        DatovyPrvekVyrazRegularniType.class,
        DatovyPrvekNazevType.class,
        DatovyPrvekSkupinaNazevType.class,
        PuvodType.class,
        DatovyPrvekCiselnikNazevType.class,
        DatovyPrvekDelkaMaximalniType.class,
        DatovyPrvekHodnotyPripustneType.class,
        PublikovalType.class,
        PrispelType.class,
        DatovyPrvekCiselnikSpravceType.class,
        PravaAutorskaType.class,
        DatovyPrvekPrezentaceFormaType.class,
        DatovyPrvekPrezentaceSchemaType.class,
        DatovyPrvekCiselnikPolozkaNazevType.class,
        DatovyPrvekKomentarType.class,
        DatovySlovnikDefiniceType.class,
        DatovyPrvekCiselnikPolozkaNazevZkracenyType.class,
        DatovyKonstruktDilciMaximumVyskytPocetType.class,
        DatovySlovnikElementTvarDefaultniType.class,
        DatovyKonstruktDilciZpracovaniZpusobType.class,
        DatovyPrvekZdrojHodnotType.class,
        DatovyPrvekSynonymumType.class,
        DatovyPrvekPredpisJinyType.class,
        KlicoveSlovoType.class,
        DatovyPrvekDefiniceType.class,
        VytvorilType.class,
        DatovyKonstruktDilciVyskytPodminkaType.class,
        DatovySlovnikAtributTvarDefaultniType.class,
        DatovyPrvekHodnotaDruhType.class
})
public class TextType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "jazykKod")
    protected generated.isvs.micr.schemas.corecomponenttypes.v1.JazykType jazykKod;
    @XmlAttribute(name = "objektID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String objektID;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the value property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the jazykKod property.
     *
     * @return possible object is
     * {@link generated.isvs.micr.schemas.corecomponenttypes.v1.JazykType }
     */
    public generated.isvs.micr.schemas.corecomponenttypes.v1.JazykType getJazykKod() {
        return jazykKod;
    }

    /**
     * Sets the value of the jazykKod property.
     *
     * @param value allowed object is
     *              {@link generated.isvs.micr.schemas.corecomponenttypes.v1.JazykType }
     */
    public void setJazykKod(generated.isvs.micr.schemas.corecomponenttypes.v1.JazykType value) {
        this.jazykKod = value;
    }

    /**
     * Gets the value of the objektID property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getObjektID() {
        return objektID;
    }

    /**
     * Sets the value of the objektID property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setObjektID(String value) {
        this.objektID = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * <p/>
     * <p/>
     * the map is keyed by the name of the attribute and
     * the value is the string value of the attribute.
     * <p/>
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     *
     * @return always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}