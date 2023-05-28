package com.project.config;

import com.project.classes.InsertCustomerRequest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class InsertCustomerRequestWrapper {
    private InsertCustomerRequest request;

    public InsertCustomerRequest getRequest() {
        return request;
    }

    public void setRequest(InsertCustomerRequest request) {
        this.request = request;
    }

    // Add any other necessary methods

    // ...
}
