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
 * �������� � ��������� ��������, ������� � ���������� ��� ���������� ��������� �������� � �� ����������������
 * 
 * <p>Java class for tRelatedParcels complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tRelatedParcels"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ParcelNeighbours" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Definition" type="{}sNe50"/&gt;
 *                   &lt;element name="ParcelNeighbour" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CadastralNumber" type="{}CadastralNumberType"/&gt;
 *                             &lt;element name="OwnerNeighbours"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="NameRight" type="{}sNe255"/&gt;
 *                                       &lt;element name="OwnerNeighbour" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="NameOwner" type="{}sNe4000"/&gt;
 *                                                 &lt;element name="ContactAddress" type="{}sNe4000"/&gt;
 *                                                 &lt;element name="Documents" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="Document" type="{}tDocumentWithoutAppliedFile" maxOccurs="unbounded"/&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
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
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tRelatedParcels", propOrder = {
    "parcelNeighbours"
})
public class TRelatedParcels {

    @XmlElement(name = "ParcelNeighbours", required = true)
    protected List<TRelatedParcels.ParcelNeighbours> parcelNeighbours;

    /**
     * Gets the value of the parcelNeighbours property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parcelNeighbours property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParcelNeighbours().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRelatedParcels.ParcelNeighbours }
     * 
     * 
     */
    public List<TRelatedParcels.ParcelNeighbours> getParcelNeighbours() {
        if (parcelNeighbours == null) {
            parcelNeighbours = new ArrayList<TRelatedParcels.ParcelNeighbours>();
        }
        return this.parcelNeighbours;
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
     *         &lt;element name="Definition" type="{}sNe50"/&gt;
     *         &lt;element name="ParcelNeighbour" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CadastralNumber" type="{}CadastralNumberType"/&gt;
     *                   &lt;element name="OwnerNeighbours"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="NameRight" type="{}sNe255"/&gt;
     *                             &lt;element name="OwnerNeighbour" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="NameOwner" type="{}sNe4000"/&gt;
     *                                       &lt;element name="ContactAddress" type="{}sNe4000"/&gt;
     *                                       &lt;element name="Documents" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="Document" type="{}tDocumentWithoutAppliedFile" maxOccurs="unbounded"/&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
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
        "parcelNeighbour"
    })
    public static class ParcelNeighbours {

        @XmlElement(name = "Definition", required = true)
        protected String definition;
        @XmlElement(name = "ParcelNeighbour", required = true)
        protected List<TRelatedParcels.ParcelNeighbours.ParcelNeighbour> parcelNeighbour;

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
         * Gets the value of the parcelNeighbour property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the parcelNeighbour property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParcelNeighbour().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TRelatedParcels.ParcelNeighbours.ParcelNeighbour }
         * 
         * 
         */
        public List<TRelatedParcels.ParcelNeighbours.ParcelNeighbour> getParcelNeighbour() {
            if (parcelNeighbour == null) {
                parcelNeighbour = new ArrayList<TRelatedParcels.ParcelNeighbours.ParcelNeighbour>();
            }
            return this.parcelNeighbour;
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
         *         &lt;element name="CadastralNumber" type="{}CadastralNumberType"/&gt;
         *         &lt;element name="OwnerNeighbours"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="NameRight" type="{}sNe255"/&gt;
         *                   &lt;element name="OwnerNeighbour" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="NameOwner" type="{}sNe4000"/&gt;
         *                             &lt;element name="ContactAddress" type="{}sNe4000"/&gt;
         *                             &lt;element name="Documents" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="Document" type="{}tDocumentWithoutAppliedFile" maxOccurs="unbounded"/&gt;
         *                                     &lt;/sequence&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
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
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "cadastralNumber",
            "ownerNeighbours"
        })
        public static class ParcelNeighbour {

            @XmlElement(name = "CadastralNumber", required = true)
            protected String cadastralNumber;
            @XmlElement(name = "OwnerNeighbours", required = true)
            protected TRelatedParcels.ParcelNeighbours.ParcelNeighbour.OwnerNeighbours ownerNeighbours;

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
             * Gets the value of the ownerNeighbours property.
             * 
             * @return
             *     possible object is
             *     {@link TRelatedParcels.ParcelNeighbours.ParcelNeighbour.OwnerNeighbours }
             *     
             */
            public TRelatedParcels.ParcelNeighbours.ParcelNeighbour.OwnerNeighbours getOwnerNeighbours() {
                return ownerNeighbours;
            }

            /**
             * Sets the value of the ownerNeighbours property.
             * 
             * @param value
             *     allowed object is
             *     {@link TRelatedParcels.ParcelNeighbours.ParcelNeighbour.OwnerNeighbours }
             *     
             */
            public void setOwnerNeighbours(TRelatedParcels.ParcelNeighbours.ParcelNeighbour.OwnerNeighbours value) {
                this.ownerNeighbours = value;
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
             *         &lt;element name="NameRight" type="{}sNe255"/&gt;
             *         &lt;element name="OwnerNeighbour" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="NameOwner" type="{}sNe4000"/&gt;
             *                   &lt;element name="ContactAddress" type="{}sNe4000"/&gt;
             *                   &lt;element name="Documents" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="Document" type="{}tDocumentWithoutAppliedFile" maxOccurs="unbounded"/&gt;
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
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "nameRight",
                "ownerNeighbour"
            })
            public static class OwnerNeighbours {

                @XmlElement(name = "NameRight", required = true)
                protected String nameRight;
                @XmlElement(name = "OwnerNeighbour", required = true)
                protected List<TRelatedParcels.ParcelNeighbours.ParcelNeighbour.OwnerNeighbours.OwnerNeighbour> ownerNeighbour;

                /**
                 * Gets the value of the nameRight property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNameRight() {
                    return nameRight;
                }

                /**
                 * Sets the value of the nameRight property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNameRight(String value) {
                    this.nameRight = value;
                }

                /**
                 * Gets the value of the ownerNeighbour property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the ownerNeighbour property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getOwnerNeighbour().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TRelatedParcels.ParcelNeighbours.ParcelNeighbour.OwnerNeighbours.OwnerNeighbour }
                 * 
                 * 
                 */
                public List<TRelatedParcels.ParcelNeighbours.ParcelNeighbour.OwnerNeighbours.OwnerNeighbour> getOwnerNeighbour() {
                    if (ownerNeighbour == null) {
                        ownerNeighbour = new ArrayList<TRelatedParcels.ParcelNeighbours.ParcelNeighbour.OwnerNeighbours.OwnerNeighbour>();
                    }
                    return this.ownerNeighbour;
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
                 *         &lt;element name="NameOwner" type="{}sNe4000"/&gt;
                 *         &lt;element name="ContactAddress" type="{}sNe4000"/&gt;
                 *         &lt;element name="Documents" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="Document" type="{}tDocumentWithoutAppliedFile" maxOccurs="unbounded"/&gt;
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
                    "nameOwner",
                    "contactAddress",
                    "documents"
                })
                public static class OwnerNeighbour {

                    @XmlElement(name = "NameOwner", required = true)
                    protected String nameOwner;
                    @XmlElement(name = "ContactAddress", required = true)
                    protected String contactAddress;
                    @XmlElement(name = "Documents")
                    protected TRelatedParcels.ParcelNeighbours.ParcelNeighbour.OwnerNeighbours.OwnerNeighbour.Documents documents;

                    /**
                     * Gets the value of the nameOwner property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNameOwner() {
                        return nameOwner;
                    }

                    /**
                     * Sets the value of the nameOwner property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNameOwner(String value) {
                        this.nameOwner = value;
                    }

                    /**
                     * Gets the value of the contactAddress property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getContactAddress() {
                        return contactAddress;
                    }

                    /**
                     * Sets the value of the contactAddress property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setContactAddress(String value) {
                        this.contactAddress = value;
                    }

                    /**
                     * Gets the value of the documents property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TRelatedParcels.ParcelNeighbours.ParcelNeighbour.OwnerNeighbours.OwnerNeighbour.Documents }
                     *     
                     */
                    public TRelatedParcels.ParcelNeighbours.ParcelNeighbour.OwnerNeighbours.OwnerNeighbour.Documents getDocuments() {
                        return documents;
                    }

                    /**
                     * Sets the value of the documents property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TRelatedParcels.ParcelNeighbours.ParcelNeighbour.OwnerNeighbours.OwnerNeighbour.Documents }
                     *     
                     */
                    public void setDocuments(TRelatedParcels.ParcelNeighbours.ParcelNeighbour.OwnerNeighbours.OwnerNeighbour.Documents value) {
                        this.documents = value;
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
                     *         &lt;element name="Document" type="{}tDocumentWithoutAppliedFile" maxOccurs="unbounded"/&gt;
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
                        "document"
                    })
                    public static class Documents {

                        @XmlElement(name = "Document", required = true)
                        protected List<TDocumentWithoutAppliedFile> document;

                        /**
                         * Gets the value of the document property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the document property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getDocument().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link TDocumentWithoutAppliedFile }
                         * 
                         * 
                         */
                        public List<TDocumentWithoutAppliedFile> getDocument() {
                            if (document == null) {
                                document = new ArrayList<TDocumentWithoutAppliedFile>();
                            }
                            return this.document;
                        }

                    }

                }

            }

        }

    }

}