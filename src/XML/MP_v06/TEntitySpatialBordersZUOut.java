//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.06 at 12:22:20 PM MSK 
//


package XML.MP_v06;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Описание местоположения характерных точек границ и частей границ (от точки до точки) земельного участка
 * 
 * <p>Java class for tEntitySpatialBordersZUOut complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tEntitySpatialBordersZUOut"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}tEntitySpatialZUOut"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Borders" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Border" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{}tBorder"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Edge"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;extension base="{}tLength"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Neighbours" type="{}tCadastralNumbers" minOccurs="0"/&gt;
 *                                       &lt;element name="DirectionAngle" type="{}tDirectionAngle" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/extension&gt;
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
@XmlType(name = "tEntitySpatialBordersZUOut", propOrder = {
    "borders"
})
public class TEntitySpatialBordersZUOut
    extends TEntitySpatialZUOut
{

    @XmlElement(name = "Borders")
    protected TEntitySpatialBordersZUOut.Borders borders;

    /**
     * Gets the value of the borders property.
     * 
     * @return
     *     possible object is
     *     {@link TEntitySpatialBordersZUOut.Borders }
     *     
     */
    public TEntitySpatialBordersZUOut.Borders getBorders() {
        return borders;
    }

    /**
     * Sets the value of the borders property.
     * 
     * @param value
     *     allowed object is
     *     {@link TEntitySpatialBordersZUOut.Borders }
     *     
     */
    public void setBorders(TEntitySpatialBordersZUOut.Borders value) {
        this.borders = value;
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
     *         &lt;element name="Border" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{}tBorder"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Edge"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;extension base="{}tLength"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Neighbours" type="{}tCadastralNumbers" minOccurs="0"/&gt;
     *                             &lt;element name="DirectionAngle" type="{}tDirectionAngle" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/extension&gt;
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
        "border"
    })
    public static class Borders {

        @XmlElement(name = "Border", required = true)
        protected List<TEntitySpatialBordersZUOut.Borders.Border> border;

        /**
         * Gets the value of the border property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the border property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBorder().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TEntitySpatialBordersZUOut.Borders.Border }
         * 
         * 
         */
        public List<TEntitySpatialBordersZUOut.Borders.Border> getBorder() {
            if (border == null) {
                border = new ArrayList<TEntitySpatialBordersZUOut.Borders.Border>();
            }
            return this.border;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{}tBorder"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Edge"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;extension base="{}tLength"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Neighbours" type="{}tCadastralNumbers" minOccurs="0"/&gt;
         *                   &lt;element name="DirectionAngle" type="{}tDirectionAngle" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/extension&gt;
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
        @XmlType(name = "", propOrder = {
            "edge"
        })
        public static class Border
            extends TBorder
        {

            @XmlElement(name = "Edge", required = true)
            protected TEntitySpatialBordersZUOut.Borders.Border.Edge edge;

            /**
             * Gets the value of the edge property.
             * 
             * @return
             *     possible object is
             *     {@link TEntitySpatialBordersZUOut.Borders.Border.Edge }
             *     
             */
            public TEntitySpatialBordersZUOut.Borders.Border.Edge getEdge() {
                return edge;
            }

            /**
             * Sets the value of the edge property.
             * 
             * @param value
             *     allowed object is
             *     {@link TEntitySpatialBordersZUOut.Borders.Border.Edge }
             *     
             */
            public void setEdge(TEntitySpatialBordersZUOut.Borders.Border.Edge value) {
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
             *     &lt;extension base="{}tLength"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="Neighbours" type="{}tCadastralNumbers" minOccurs="0"/&gt;
             *         &lt;element name="DirectionAngle" type="{}tDirectionAngle" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/extension&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "neighbours",
                "directionAngle"
            })
            public static class Edge
                extends TLength
            {

                @XmlElement(name = "Neighbours")
                protected TCadastralNumbers neighbours;
                @XmlElement(name = "DirectionAngle")
                protected TDirectionAngle directionAngle;

                /**
                 * Gets the value of the neighbours property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TCadastralNumbers }
                 *     
                 */
                public TCadastralNumbers getNeighbours() {
                    return neighbours;
                }

                /**
                 * Sets the value of the neighbours property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TCadastralNumbers }
                 *     
                 */
                public void setNeighbours(TCadastralNumbers value) {
                    this.neighbours = value;
                }

                /**
                 * Gets the value of the directionAngle property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TDirectionAngle }
                 *     
                 */
                public TDirectionAngle getDirectionAngle() {
                    return directionAngle;
                }

                /**
                 * Sets the value of the directionAngle property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TDirectionAngle }
                 *     
                 */
                public void setDirectionAngle(TDirectionAngle value) {
                    this.directionAngle = value;
                }

            }

        }

    }

}
