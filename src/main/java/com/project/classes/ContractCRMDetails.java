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
 * <p>Classe Java pour ContractCRMDetails complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ContractCRMDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contractId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MSISDN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OfferPromotype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ICCID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractCRMDetails", propOrder = {
    "contractId",
    "msisdn",
    "offerPromotype",
    "iccid",
    "customerId"
})
public class ContractCRMDetails {

    protected int contractId;
    @XmlElement(name = "MSISDN")
    protected int msisdn;
    @XmlElement(name = "OfferPromotype", required = true)
    protected String offerPromotype;
    @XmlElement(name = "ICCID")
    protected int iccid;
    protected int customerId;

    /**
     * Obtient la valeur de la propriété contractId.
     * 
     */
    public int getContractId() {
        return contractId;
    }

    /**
     * Définit la valeur de la propriété contractId.
     * 
     */
    public void setContractId(int value) {
        this.contractId = value;
    }

    /**
     * Obtient la valeur de la propriété msisdn.
     * 
     */
    public int getMSISDN() {
        return msisdn;
    }

    /**
     * Définit la valeur de la propriété msisdn.
     * 
     */
    public void setMSISDN(int value) {
        this.msisdn = value;
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
     * Obtient la valeur de la propriété iccid.
     * 
     */
    public int getICCID() {
        return iccid;
    }

    /**
     * Définit la valeur de la propriété iccid.
     * 
     */
    public void setICCID(int value) {
        this.iccid = value;
    }

    /**
     * Obtient la valeur de la propriété customerId.
     * 
     */
    public int getCustomerId() {
        return customerId;
    }

    /**
     * Définit la valeur de la propriété customerId.
     * 
     */
    public void setCustomerId(int value) {
        this.customerId = value;
    }

}
