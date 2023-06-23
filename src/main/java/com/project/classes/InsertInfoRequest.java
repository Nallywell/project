//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2023.06.23 à 02:02:54 PM CEST 
//


package com.project.classes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour InsertInfoRequest complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="InsertInfoRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Iccid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OfferPromotype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="networkType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="identityTypeCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IdentityValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="deliveryD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="commune" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="wilaya" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertInfoRequest", propOrder = {
    "iccid",
    "offerPromotype",
    "networkType",
    "title",
    "firstName",
    "lastName",
    "birthDate",
    "identityTypeCode",
    "identityValue",
    "deliveryD",
    "address",
    "commune",
    "wilaya"
})
public class InsertInfoRequest {

    @XmlElement(name = "Iccid")
    protected int iccid;
    @XmlElement(name = "OfferPromotype", required = true)
    protected String offerPromotype;
    @XmlElement(required = true)
    protected String networkType;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(name = "FirstName", required = true)
    protected String firstName;
    @XmlElement(name = "LastName", required = true)
    protected String lastName;
    @XmlElement(name = "BirthDate", required = true)
    protected String birthDate;
    protected int identityTypeCode;
    @XmlElement(name = "IdentityValue")
    protected int identityValue;
    @XmlElement(required = true)
    protected String deliveryD;
    @XmlElement(required = true)
    protected String address;
    @XmlElement(required = true)
    protected String commune;
    @XmlElement(required = true)
    protected String wilaya;

    /**
     * Obtient la valeur de la propriété iccid.
     * 
     */
    public int getIccid() {
        return iccid;
    }

    /**
     * Définit la valeur de la propriété iccid.
     * 
     */
    public void setIccid(int value) {
        this.iccid = value;
    }

    /**
     * Obtient la valeur de la propriété offerPromotype.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferPromotype() {
        return offerPromotype;
    }

    /**
     * Définit la valeur de la propriété offerPromotype.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferPromotype(String value) {
        this.offerPromotype = value;
    }

    /**
     * Obtient la valeur de la propriété networkType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkType() {
        return networkType;
    }

    /**
     * Définit la valeur de la propriété networkType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkType(String value) {
        this.networkType = value;
    }

    /**
     * Obtient la valeur de la propriété title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Définit la valeur de la propriété title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Obtient la valeur de la propriété firstName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Définit la valeur de la propriété firstName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Obtient la valeur de la propriété lastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Définit la valeur de la propriété lastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Obtient la valeur de la propriété birthDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Définit la valeur de la propriété birthDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDate(String value) {
        this.birthDate = value;
    }

    /**
     * Obtient la valeur de la propriété identityTypeCode.
     * 
     */
    public int getIdentityTypeCode() {
        return identityTypeCode;
    }

    /**
     * Définit la valeur de la propriété identityTypeCode.
     * 
     */
    public void setIdentityTypeCode(int value) {
        this.identityTypeCode = value;
    }

    /**
     * Obtient la valeur de la propriété identityValue.
     * 
     */
    public int getIdentityValue() {
        return identityValue;
    }

    /**
     * Définit la valeur de la propriété identityValue.
     * 
     */
    public void setIdentityValue(int value) {
        this.identityValue = value;
    }

    /**
     * Obtient la valeur de la propriété deliveryD.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryD() {
        return deliveryD;
    }

    /**
     * Définit la valeur de la propriété deliveryD.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryD(String value) {
        this.deliveryD = value;
    }

    /**
     * Obtient la valeur de la propriété address.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Définit la valeur de la propriété address.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Obtient la valeur de la propriété commune.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommune() {
        return commune;
    }

    /**
     * Définit la valeur de la propriété commune.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommune(String value) {
        this.commune = value;
    }

    /**
     * Obtient la valeur de la propriété wilaya.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWilaya() {
        return wilaya;
    }

    /**
     * Définit la valeur de la propriété wilaya.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWilaya(String value) {
        this.wilaya = value;
    }

}
