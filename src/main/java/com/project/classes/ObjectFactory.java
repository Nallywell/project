//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2023.05.30 à 05:47:07 PM CEST 
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

    private final static QName _InsertCrmRequest_QNAME = new QName("http://project.com/classes", "InsertCrmRequest");
    private final static QName _InsertCustomerRequest_QNAME = new QName("http://project.com/classes", "InsertCustomerRequest");
    private final static QName _InsertContractRequest_QNAME = new QName("http://project.com/classes", "InsertContractRequest");
    private final static QName _NotifyLogRequest_QNAME = new QName("http://project.com/classes", "NotifyLogRequest");
    private final static QName _NotifyLogResponse_QNAME = new QName("http://project.com/classes", "NotifyLogResponse");
    private final static QName _InsertContractResponse_QNAME = new QName("http://project.com/classes", "InsertContractResponse");
    private final static QName _InsertCrmResponse_QNAME = new QName("http://project.com/classes", "InsertCrmResponse");
    private final static QName _InsertCustomerResponse_QNAME = new QName("http://project.com/classes", "InsertCustomerResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.project.classes
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsertCrmRequest }
     * 
     */
    public InsertCrmRequest createInsertCrmRequest() {
        return new InsertCrmRequest();
    }

    /**
     * Create an instance of {@link InsertCustomerRequest }
     * 
     */
    public InsertCustomerRequest createInsertCustomerRequest() {
        return new InsertCustomerRequest();
    }

    /**
     * Create an instance of {@link InsertContractRequest }
     * 
     */
    public InsertContractRequest createInsertContractRequest() {
        return new InsertContractRequest();
    }

    /**
     * Create an instance of {@link NotifyLogRequest }
     * 
     */
    public NotifyLogRequest createNotifyLogRequest() {
        return new NotifyLogRequest();
    }

    /**
     * Create an instance of {@link NotifyLogResponse }
     * 
     */
    public NotifyLogResponse createNotifyLogResponse() {
        return new NotifyLogResponse();
    }

    /**
     * Create an instance of {@link InsertContractResponse }
     * 
     */
    public InsertContractResponse createInsertContractResponse() {
        return new InsertContractResponse();
    }

    /**
     * Create an instance of {@link InsertCrmResponse }
     * 
     */
    public InsertCrmResponse createInsertCrmResponse() {
        return new InsertCrmResponse();
    }

    /**
     * Create an instance of {@link InsertCustomerResponse }
     * 
     */
    public InsertCustomerResponse createInsertCustomerResponse() {
        return new InsertCustomerResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertCrmRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://project.com/classes", name = "InsertCrmRequest")
    public JAXBElement<InsertCrmRequest> createInsertCrmRequest(InsertCrmRequest value) {
        return new JAXBElement<InsertCrmRequest>(_InsertCrmRequest_QNAME, InsertCrmRequest.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertContractRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://project.com/classes", name = "InsertContractRequest")
    public JAXBElement<InsertContractRequest> createInsertContractRequest(InsertContractRequest value) {
        return new JAXBElement<InsertContractRequest>(_InsertContractRequest_QNAME, InsertContractRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotifyLogRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://project.com/classes", name = "NotifyLogRequest")
    public JAXBElement<NotifyLogRequest> createNotifyLogRequest(NotifyLogRequest value) {
        return new JAXBElement<NotifyLogRequest>(_NotifyLogRequest_QNAME, NotifyLogRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotifyLogResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://project.com/classes", name = "NotifyLogResponse")
    public JAXBElement<NotifyLogResponse> createNotifyLogResponse(NotifyLogResponse value) {
        return new JAXBElement<NotifyLogResponse>(_NotifyLogResponse_QNAME, NotifyLogResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertContractResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://project.com/classes", name = "InsertContractResponse")
    public JAXBElement<InsertContractResponse> createInsertContractResponse(InsertContractResponse value) {
        return new JAXBElement<InsertContractResponse>(_InsertContractResponse_QNAME, InsertContractResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertCrmResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://project.com/classes", name = "InsertCrmResponse")
    public JAXBElement<InsertCrmResponse> createInsertCrmResponse(InsertCrmResponse value) {
        return new JAXBElement<InsertCrmResponse>(_InsertCrmResponse_QNAME, InsertCrmResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://project.com/classes", name = "InsertCustomerResponse")
    public JAXBElement<InsertCustomerResponse> createInsertCustomerResponse(InsertCustomerResponse value) {
        return new JAXBElement<InsertCustomerResponse>(_InsertCustomerResponse_QNAME, InsertCustomerResponse.class, null, value);
    }

}
