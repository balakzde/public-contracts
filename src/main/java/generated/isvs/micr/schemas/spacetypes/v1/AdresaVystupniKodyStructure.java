//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.23 at 01:46:39 AM CET 
//


package generated.isvs.micr.schemas.spacetypes.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdresaVystupniKodyStructure", propOrder = {
    "adresaPredavaciKod",
    "castObcePredavaciKod",
    "mestskaCastPredavaciKod",
    "objektCisloDomovni",
    "ulicePredavaciKod",
    "uliceNazev",
    "objektCisloOrientacni",
    "psc",
    "adresaKvalifikatorKod"
})
public class AdresaVystupniKodyStructure {

    @XmlElement(name = "AdresaPredavaciKod")
    protected ObjektAdresaPredavaciKodType adresaPredavaciKod;
    @XmlElement(name = "CastObcePredavaciKod")
    protected CastObcePredavaciKodType castObcePredavaciKod;
    @XmlElement(name = "MestskaCastPredavaciKod")
    protected MestskaCastPredavaciKodType mestskaCastPredavaciKod;
    @XmlElement(name = "ObjektCisloDomovni")
    protected ObjektCisloDomovniStructure objektCisloDomovni;
    @XmlElement(name = "UlicePredavaciKod")
    protected UlicePredavaciKodType ulicePredavaciKod;
    @XmlElement(name = "UliceNazev")
    protected UliceNazevType uliceNazev;
    @XmlElement(name = "ObjektCisloOrientacni")
    protected ObjektCisloOrientacniType objektCisloOrientacni;
    @XmlElement(name = "PSC")
    protected PSCType psc;
    @XmlElement(name = "AdresaKvalifikatorKod")
    protected AdresaKvalifikatorKodType adresaKvalifikatorKod;


    public ObjektAdresaPredavaciKodType getAdresaPredavaciKod() {
        return adresaPredavaciKod;
    }


    public void setAdresaPredavaciKod(ObjektAdresaPredavaciKodType value) {
        this.adresaPredavaciKod = value;
    }


    public CastObcePredavaciKodType getCastObcePredavaciKod() {
        return castObcePredavaciKod;
    }


    public void setCastObcePredavaciKod(CastObcePredavaciKodType value) {
        this.castObcePredavaciKod = value;
    }


    public MestskaCastPredavaciKodType getMestskaCastPredavaciKod() {
        return mestskaCastPredavaciKod;
    }


    public void setMestskaCastPredavaciKod(MestskaCastPredavaciKodType value) {
        this.mestskaCastPredavaciKod = value;
    }


    public ObjektCisloDomovniStructure getObjektCisloDomovni() {
        return objektCisloDomovni;
    }


    public void setObjektCisloDomovni(ObjektCisloDomovniStructure value) {
        this.objektCisloDomovni = value;
    }


    public UlicePredavaciKodType getUlicePredavaciKod() {
        return ulicePredavaciKod;
    }


    public void setUlicePredavaciKod(UlicePredavaciKodType value) {
        this.ulicePredavaciKod = value;
    }


    public UliceNazevType getUliceNazev() {
        return uliceNazev;
    }


    public void setUliceNazev(UliceNazevType value) {
        this.uliceNazev = value;
    }


    public ObjektCisloOrientacniType getObjektCisloOrientacni() {
        return objektCisloOrientacni;
    }


    public void setObjektCisloOrientacni(ObjektCisloOrientacniType value) {
        this.objektCisloOrientacni = value;
    }


    public PSCType getPSC() {
        return psc;
    }


    public void setPSC(PSCType value) {
        this.psc = value;
    }


    public AdresaKvalifikatorKodType getAdresaKvalifikatorKod() {
        return adresaKvalifikatorKod;
    }


    public void setAdresaKvalifikatorKod(AdresaKvalifikatorKodType value) {
        this.adresaKvalifikatorKod = value;
    }

}
