//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.23 at 01:46:39 AM CET 
//


package generated.isvs.micr.schemas.corecomponenttypes.v1;

import java.math.BigDecimal;
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
import generated.isvs.micr.schemas.spacetypes.v1.NadmorskaVyskaType;


/**
 * Hodnota velikosti, hmotnosti, objemu apod., z�skan� pomoc� procesu m��en�; voliteln� spolu s dopl�kovou informac� o jednotce, v n� je �daj vyj�d�en
 * 
 * <p>Java class for MereniType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MereniType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *       &lt;attribute name="jednotkaKod" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="jednotkaCiselnikID" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="objektID" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;anyAttribute/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MereniType", propOrder = {
    "value"
})
@XmlSeeAlso({
    MnozstviType.class,
    NadmorskaVyskaType.class
})
public class MereniType {

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "jednotkaKod")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String jednotkaKod;
    @XmlAttribute(name = "jednotkaCiselnikID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String jednotkaCiselnikID;
    @XmlAttribute(name = "objektID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String objektID;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the jednotkaKod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJednotkaKod() {
        return jednotkaKod;
    }

    /**
     * Sets the value of the jednotkaKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJednotkaKod(String value) {
        this.jednotkaKod = value;
    }

    /**
     * Gets the value of the jednotkaCiselnikID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJednotkaCiselnikID() {
        return jednotkaCiselnikID;
    }

    /**
     * Sets the value of the jednotkaCiselnikID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJednotkaCiselnikID(String value) {
        this.jednotkaCiselnikID = value;
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
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}