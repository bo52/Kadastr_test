//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.06 at 12:22:20 PM MSK 
//


package XML.MP_v06;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Характеристика лесного участка
 * 
 * <p>Java class for tForestUse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tForestUse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Kind"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{}dNaturalObjects"&gt;
 *               &lt;pattern value="233001000000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ForestUse" type="{}dForestUse" minOccurs="0"/&gt;
 *         &lt;element name="ProtectiveForest" type="{}s255" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tForestUse", propOrder = {
    "kind",
    "forestUse",
    "protectiveForest"
})
public class TForestUse {

    @XmlElement(name = "Kind", required = true)
    protected String kind;
    @XmlElement(name = "ForestUse")
    protected String forestUse;
    @XmlElement(name = "ProtectiveForest")
    protected String protectiveForest;

    /**
     * Gets the value of the kind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKind() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKind(String value) {
        this.kind = value;
    }

    /**
     * Gets the value of the forestUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForestUse() {
        return forestUse;
    }

    /**
     * Sets the value of the forestUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForestUse(String value) {
        this.forestUse = value;
    }

    /**
     * Gets the value of the protectiveForest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectiveForest() {
        return protectiveForest;
    }

    /**
     * Sets the value of the protectiveForest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectiveForest(String value) {
        this.protectiveForest = value;
    }

}
