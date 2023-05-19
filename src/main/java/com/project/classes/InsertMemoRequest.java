//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2023.05.19 à 02:48:56 PM CEST 
//


package com.project.classes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour InsertMemoRequest complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="InsertMemoRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ticklerNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ccId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="coId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="shortDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="longDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertMemoRequest", propOrder = {
    "ticklerNumber",
    "ccId",
    "coId",
    "shortDescription",
    "longDescription"
})
public class InsertMemoRequest {

    protected int ticklerNumber;
    protected int ccId;
    protected int coId;
    @XmlElement(required = true)
    protected String shortDescription;
    @XmlElement(required = true)
    protected String longDescription;

    /**
     * Obtient la valeur de la propriété ticklerNumber.
     * 
     */
    public int getTicklerNumber() {
        return ticklerNumber;
    }

    /**
     * Définit la valeur de la propriété ticklerNumber.
     * 
     */
    public void setTicklerNumber(int value) {
        this.ticklerNumber = value;
    }

    /**
     * Obtient la valeur de la propriété ccId.
     * 
     */
    public int getCcId() {
        return ccId;
    }

    /**
     * Définit la valeur de la propriété ccId.
     * 
     */
    public void setCcId(int value) {
        this.ccId = value;
    }

    /**
     * Obtient la valeur de la propriété coId.
     * 
     */
    public int getCoId() {
        return coId;
    }

    /**
     * Définit la valeur de la propriété coId.
     * 
     */
    public void setCoId(int value) {
        this.coId = value;
    }

    /**
     * Obtient la valeur de la propriété shortDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * Définit la valeur de la propriété shortDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortDescription(String value) {
        this.shortDescription = value;
    }

    /**
     * Obtient la valeur de la propriété longDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongDescription() {
        return longDescription;
    }

    /**
     * Définit la valeur de la propriété longDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongDescription(String value) {
        this.longDescription = value;
    }

}
