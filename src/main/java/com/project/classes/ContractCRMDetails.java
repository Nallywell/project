//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2023.06.21 à 11:22:37 PM CEST 
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
 *         &lt;element name="ICCID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="identityValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OfferPromotype" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "iccid",
    "identityValue",
    "action",
    "offerPromotype"
})
public class ContractCRMDetails {

    protected int contractId;
    @XmlElement(name = "ICCID")
    protected int iccid;
    protected int identityValue;
    @XmlElement(required = true)
    protected String action;
    @XmlElement(name = "OfferPromotype", required = true)
    protected String offerPromotype;

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
     * Obtient la valeur de la propriété action.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Définit la valeur de la propriété action.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
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

}
