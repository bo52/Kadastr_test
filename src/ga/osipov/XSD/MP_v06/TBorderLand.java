//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.21 at 09:42:06 AM MSK 
//


package ga.osipov.XSD.MP_v06;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * �������� ������� (�� ����� �� �����) � ��������
 * 
 * <p>Java class for tBorderLand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tBorderLand"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}tBorder"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Edge" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Definition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Neighbours" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="NeighboursName" type="{}s255" maxOccurs="unbounded"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tBorderLand", propOrder = {
    "edge"
})
public class TBorderLand
    extends TBorder
{

    @XmlElement(name = "Edge")
    protected TBorderLand.Edge edge;

    /**
     * Gets the value of the edge property.
     * 
     * @return
     *     possible object is
     *     {@link TBorderLand.Edge }
     *     
     */
    public TBorderLand.Edge getEdge() {
        return edge;
    }

    /**
     * Sets the value of the edge property.
     * 
     * @param value
     *     allowed object is
     *     {@link TBorderLand.Edge }
     *     
     */
    public void setEdge(TBorderLand.Edge value) {
        this.edge = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Definition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Neighbours" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="NeighboursName" type="{}s255" maxOccurs="unbounded"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "definition",
        "neighbours"
    })
    public static class Edge {

        @XmlElement(name = "Definition")
        protected String definition;
        @XmlElement(name = "Neighbours")
        protected TBorderLand.Edge.Neighbours neighbours;

        /**
         * Gets the value of the definition property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDefinition() {
            return definition;
        }

        /**
         * Sets the value of the definition property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDefinition(String value) {
            this.definition = value;
        }

        /**
         * Gets the value of the neighbours property.
         * 
         * @return
         *     possible object is
         *     {@link TBorderLand.Edge.Neighbours }
         *     
         */
        public TBorderLand.Edge.Neighbours getNeighbours() {
            return neighbours;
        }

        /**
         * Sets the value of the neighbours property.
         * 
         * @param value
         *     allowed object is
         *     {@link TBorderLand.Edge.Neighbours }
         *     
         */
        public void setNeighbours(TBorderLand.Edge.Neighbours value) {
            this.neighbours = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="NeighboursName" type="{}s255" maxOccurs="unbounded"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "neighboursName"
        })
        public static class Neighbours {

            @XmlElement(name = "NeighboursName", required = true)
            protected List<String> neighboursName;

            /**
             * Gets the value of the neighboursName property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the neighboursName property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNeighboursName().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getNeighboursName() {
                if (neighboursName == null) {
                    neighboursName = new ArrayList<String>();
                }
                return this.neighboursName;
            }

        }

    }

}