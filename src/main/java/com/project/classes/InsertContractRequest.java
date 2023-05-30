//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2023.05.30 à 05:47:07 PM CEST 
//


package com.project.classes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour InsertContractRequest complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="InsertContractRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identityvalue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ICCID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertContractRequest", propOrder = {
    "identityvalue",
    "iccid"
})
public class InsertContractRequest {

    protected int identityvalue;
    @XmlElement(name = "ICCID")
    protected int iccid;

    /**
     * Obtient la valeur de la propriété identityvalue.
     * 
     */
    public int getIdentityvalue() {
        return identityvalue;
    }

    /**
     * Définit la valeur de la propriété identityvalue.
     * 
     */
    public void setIdentityvalue(int value) {
        this.identityvalue = value;
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

}
