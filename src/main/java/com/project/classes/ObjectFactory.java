//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2023.05.19 à 02:48:56 PM CEST 
//


package com.project.classes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.project.classes package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _InsertLogResponse_QNAME = new QName("http://project.com/classes", "InsertLogResponse");
    private final static QName _InsertCustomerRespone_QNAME = new QName("http://project.com/classes", "InsertCustomerRespone");
    private final static QName _InsertCustomerRequest_QNAME = new QName("http://project.com/classes", "InsertCustomerRequest");
    private final static QName _InsertMemoResponse_QNAME = new QName("http://project.com/classes", "InsertMemoResponse");
    private final static QName _InsertMemoRequest_QNAME = new QName("http://project.com/classes", "InsertMemoRequest");
    private final static QName _InsertLogRequest_QNAME = new QName("http://project.com/classes", "InsertLogRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.project.classes
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsertLogResponse }
     * 
     */
    public InsertLogResponse createInsertLogResponse() {
        return new InsertLogResponse();
    }

    /**
     * Create an instance of {@link InsertCustomerRequest }
     * 
     */
    public InsertCustomerRequest createInsertCustomerRequest() {
        return new InsertCustomerRequest();
    }

    /**
     * Create an instance of {@link InsertCustomerResponse }
     *
     */
    public InsertCustomerResponse createInsertCustomerResponse(InsertCustomerResponse response) {
        return new InsertCustomerResponse();
    }

    /**
     * Create an instance of {@link InsertMemoResponse }
     * 
     */
    public InsertMemoResponse createInsertMemoResponse() {
        return new InsertMemoResponse();
    }

    /**
     * Create an instance of {@link InsertMemoRequest }
     * 
     */
    public InsertMemoRequest createInsertMemoRequest() {
        return new InsertMemoRequest();
    }

    /**
     * Create an instance of {@link InsertLogRequest }
     * 
     */
    public InsertLogRequest createInsertLogRequest() {
        return new InsertLogRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertLogResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://project.com/classes", name = "InsertLogResponse")
    public JAXBElement<InsertLogResponse> createInsertLogResponse(InsertLogResponse value) {
        return new JAXBElement<InsertLogResponse>(_InsertLogResponse_QNAME, InsertLogResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://project.com/classes", name = "InsertCustomerRespone")
    public JAXBElement<InsertCustomerResponse> createInsertCustomerRespone(InsertCustomerResponse value) {
        return new JAXBElement<InsertCustomerResponse>(_InsertCustomerRespone_QNAME, InsertCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertCustomerRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://project.com/classes", name = "InsertCustomerRequest")
    public JAXBElement<InsertCustomerRequest> createInsertCustomerRequest(InsertCustomerRequest value) {
        return new JAXBElement<InsertCustomerRequest>(_InsertCustomerRequest_QNAME, InsertCustomerRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertMemoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://project.com/classes", name = "InsertMemoResponse")
    public JAXBElement<InsertMemoResponse> createInsertMemoResponse(InsertMemoResponse value) {
        return new JAXBElement<InsertMemoResponse>(_InsertMemoResponse_QNAME, InsertMemoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertMemoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://project.com/classes", name = "InsertMemoRequest")
    public JAXBElement<InsertMemoRequest> createInsertMemoRequest(InsertMemoRequest value) {
        return new JAXBElement<InsertMemoRequest>(_InsertMemoRequest_QNAME, InsertMemoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertLogRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://project.com/classes", name = "InsertLogRequest")
    public JAXBElement<InsertLogRequest> createInsertLogRequest(InsertLogRequest value) {
        return new JAXBElement<InsertLogRequest>(_InsertLogRequest_QNAME, InsertLogRequest.class, null, value);
    }

}
