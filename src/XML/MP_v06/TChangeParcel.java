//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.06 at 12:22:20 PM MSK 
//


package XML.MP_v06;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Описание измененного земельного участка и его частей
 * 
 * <p>Java class for tChangeParcel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tChangeParcel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CadastralBlock" type="{}CadastralBlockType"/&gt;
 *         &lt;element name="ProvidingPassCadastralNumbers" type="{}tProvidingPassCadastralNumbers" minOccurs="0"/&gt;
 *         &lt;element name="ObjectRealty" type="{}tObjectRealty" minOccurs="0"/&gt;
 *         &lt;element name="SubParcels" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NewSubParcel" type="{}tNewSubParcel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ExistSubParcel" type="{}tExistSubParcel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="InvariableSubParcel" type="{}tInvariableSubParcel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DeleteEntryParcels" type="{}tDeleteEntryParcels" minOccurs="0"/&gt;
 *         &lt;element name="TransformationEntryParcels" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TransformationEntryParcel" type="{}tCadastralNumberInp" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TransformationContours" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TransformationContour" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ProvidingPassCadastralNumbers" type="{}tProvidingPassCadastralNumbers" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="NumberRecord" use="required" type="{}p10" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="CadastralNumber" use="required" type="{}CadastralNumberType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tChangeParcel", propOrder = {
    "cadastralBlock",
    "providingPassCadastralNumbers",
    "objectRealty",
    "subParcels",
    "deleteEntryParcels",
    "transformationEntryParcels",
    "transformationContours",
    "note"
})
public class TChangeParcel {

    @XmlElement(name = "CadastralBlock", required = true)
    protected String cadastralBlock;
    @XmlElement(name = "ProvidingPassCadastralNumbers")
    protected TProvidingPassCadastralNumbers providingPassCadastralNumbers;
    @XmlElement(name = "ObjectRealty")
    protected TObjectRealty objectRealty;
    @XmlElement(name = "SubParcels")
    protected TChangeParcel.SubParcels subParcels;
    @XmlElement(name = "DeleteEntryParcels")
    protected TDeleteEntryParcels deleteEntryParcels;
    @XmlElement(name = "TransformationEntryParcels")
    protected TChangeParcel.TransformationEntryParcels transformationEntryParcels;
    @XmlElement(name = "TransformationContours")
    protected TChangeParcel.TransformationContours transformationContours;
    @XmlElement(name = "Note")
    protected String note;
    @XmlAttribute(name = "CadastralNumber", required = true)
    protected String cadastralNumber;

    /**
     * Gets the value of the cadastralBlock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCadastralBlock() {
        return cadastralBlock;
    }

    /**
     * Sets the value of the cadastralBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCadastralBlock(String value) {
        this.cadastralBlock = value;
    }

    /**
     * Gets the value of the providingPassCadastralNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link TProvidingPassCadastralNumbers }
     *     
     */
    public TProvidingPassCadastralNumbers getProvidingPassCadastralNumbers() {
        return providingPassCadastralNumbers;
    }

    /**
     * Sets the value of the providingPassCadastralNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link TProvidingPassCadastralNumbers }
     *     
     */
    public void setProvidingPassCadastralNumbers(TProvidingPassCadastralNumbers value) {
        this.providingPassCadastralNumbers = value;
    }

    /**
     * Gets the value of the objectRealty property.
     * 
     * @return
     *     possible object is
     *     {@link TObjectRealty }
     *     
     */
    public TObjectRealty getObjectRealty() {
        return objectRealty;
    }

    /**
     * Sets the value of the objectRealty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TObjectRealty }
     *     
     */
    public void setObjectRealty(TObjectRealty value) {
        this.objectRealty = value;
    }

    /**
     * Gets the value of the subParcels property.
     * 
     * @return
     *     possible object is
     *     {@link TChangeParcel.SubParcels }
     *     
     */
    public TChangeParcel.SubParcels getSubParcels() {
        return subParcels;
    }

    /**
     * Sets the value of the subParcels property.
     * 
     * @param value
     *     allowed object is
     *     {@link TChangeParcel.SubParcels }
     *     
     */
    public void setSubParcels(TChangeParcel.SubParcels value) {
        this.subParcels = value;
    }

    /**
     * Gets the value of the deleteEntryParcels property.
     * 
     * @return
     *     possible object is
     *     {@link TDeleteEntryParcels }
     *     
     */
    public TDeleteEntryParcels getDeleteEntryParcels() {
        return deleteEntryParcels;
    }

    /**
     * Sets the value of the deleteEntryParcels property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDeleteEntryParcels }
     *     
     */
    public void setDeleteEntryParcels(TDeleteEntryParcels value) {
        this.deleteEntryParcels = value;
    }

    /**
     * Gets the value of the transformationEntryParcels property.
     * 
     * @return
     *     possible object is
     *     {@link TChangeParcel.TransformationEntryParcels }
     *     
     */
    public TChangeParcel.TransformationEntryParcels getTransformationEntryParcels() {
        return transformationEntryParcels;
    }

    /**
     * Sets the value of the transformationEntryParcels property.
     * 
     * @param value
     *     allowed object is
     *     {@link TChangeParcel.TransformationEntryParcels }
     *     
     */
    public void setTransformationEntryParcels(TChangeParcel.TransformationEntryParcels value) {
        this.transformationEntryParcels = value;
    }

    /**
     * Gets the value of the transformationContours property.
     * 
     * @return
     *     possible object is
     *     {@link TChangeParcel.TransformationContours }
     *     
     */
    public TChangeParcel.TransformationContours getTransformationContours() {
        return transformationContours;
    }

    /**
     * Sets the value of the transformationContours property.
     * 
     * @param value
     *     allowed object is
     *     {@link TChangeParcel.TransformationContours }
     *     
     */
    public void setTransformationContours(TChangeParcel.TransformationContours value) {
        this.transformationContours = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the cadastralNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCadastralNumber() {
        return cadastralNumber;
    }

    /**
     * Sets the value of the cadastralNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCadastralNumber(String value) {
        this.cadastralNumber = value;
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
     *         &lt;element name="NewSubParcel" type="{}tNewSubParcel" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ExistSubParcel" type="{}tExistSubParcel" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="InvariableSubParcel" type="{}tInvariableSubParcel" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "newSubParcel",
        "existSubParcel",
        "invariableSubParcel"
    })
    public static class SubParcels {

        @XmlElement(name = "NewSubParcel")
        protected List<TNewSubParcel> newSubParcel;
        @XmlElement(name = "ExistSubParcel")
        protected List<TExistSubParcel> existSubParcel;
        @XmlElement(name = "InvariableSubParcel")
        protected List<TInvariableSubParcel> invariableSubParcel;

        /**
         * Gets the value of the newSubParcel property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the newSubParcel property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNewSubParcel().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TNewSubParcel }
         * 
         * 
         */
        public List<TNewSubParcel> getNewSubParcel() {
            if (newSubParcel == null) {
                newSubParcel = new ArrayList<TNewSubParcel>();
            }
            return this.newSubParcel;
        }

        /**
         * Gets the value of the existSubParcel property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the existSubParcel property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExistSubParcel().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TExistSubParcel }
         * 
         * 
         */
        public List<TExistSubParcel> getExistSubParcel() {
            if (existSubParcel == null) {
                existSubParcel = new ArrayList<TExistSubParcel>();
            }
            return this.existSubParcel;
        }

        /**
         * Gets the value of the invariableSubParcel property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the invariableSubParcel property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInvariableSubParcel().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TInvariableSubParcel }
         * 
         * 
         */
        public List<TInvariableSubParcel> getInvariableSubParcel() {
            if (invariableSubParcel == null) {
                invariableSubParcel = new ArrayList<TInvariableSubParcel>();
            }
            return this.invariableSubParcel;
        }

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
     *         &lt;element name="TransformationContour" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ProvidingPassCadastralNumbers" type="{}tProvidingPassCadastralNumbers" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="NumberRecord" use="required" type="{}p10" /&gt;
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
        "transformationContour"
    })
    public static class TransformationContours {

        @XmlElement(name = "TransformationContour", required = true)
        protected List<TChangeParcel.TransformationContours.TransformationContour> transformationContour;

        /**
         * Gets the value of the transformationContour property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the transformationContour property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTransformationContour().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TChangeParcel.TransformationContours.TransformationContour }
         * 
         * 
         */
        public List<TChangeParcel.TransformationContours.TransformationContour> getTransformationContour() {
            if (transformationContour == null) {
                transformationContour = new ArrayList<TChangeParcel.TransformationContours.TransformationContour>();
            }
            return this.transformationContour;
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
         *         &lt;element name="ProvidingPassCadastralNumbers" type="{}tProvidingPassCadastralNumbers" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="NumberRecord" use="required" type="{}p10" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "providingPassCadastralNumbers"
        })
        public static class TransformationContour {

            @XmlElement(name = "ProvidingPassCadastralNumbers")
            protected TProvidingPassCadastralNumbers providingPassCadastralNumbers;
            @XmlAttribute(name = "NumberRecord", required = true)
            protected BigInteger numberRecord;

            /**
             * Gets the value of the providingPassCadastralNumbers property.
             * 
             * @return
             *     possible object is
             *     {@link TProvidingPassCadastralNumbers }
             *     
             */
            public TProvidingPassCadastralNumbers getProvidingPassCadastralNumbers() {
                return providingPassCadastralNumbers;
            }

            /**
             * Sets the value of the providingPassCadastralNumbers property.
             * 
             * @param value
             *     allowed object is
             *     {@link TProvidingPassCadastralNumbers }
             *     
             */
            public void setProvidingPassCadastralNumbers(TProvidingPassCadastralNumbers value) {
                this.providingPassCadastralNumbers = value;
            }

            /**
             * Gets the value of the numberRecord property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getNumberRecord() {
                return numberRecord;
            }

            /**
             * Sets the value of the numberRecord property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setNumberRecord(BigInteger value) {
                this.numberRecord = value;
            }

        }

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
     *         &lt;element name="TransformationEntryParcel" type="{}tCadastralNumberInp" maxOccurs="unbounded"/&gt;
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
        "transformationEntryParcel"
    })
    public static class TransformationEntryParcels {

        @XmlElement(name = "TransformationEntryParcel", required = true)
        protected List<TCadastralNumberInp> transformationEntryParcel;

        /**
         * Gets the value of the transformationEntryParcel property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the transformationEntryParcel property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTransformationEntryParcel().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TCadastralNumberInp }
         * 
         * 
         */
        public List<TCadastralNumberInp> getTransformationEntryParcel() {
            if (transformationEntryParcel == null) {
                transformationEntryParcel = new ArrayList<TCadastralNumberInp>();
            }
            return this.transformationEntryParcel;
        }

    }

}
