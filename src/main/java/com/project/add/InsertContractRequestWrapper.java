package com.project.add;

import com.project.classes.InsertContractRequest;
import com.project.classes.InsertCustomerRequest;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class InsertContractRequestWrapper {
    private InsertContractRequest request;

    public InsertContractRequest getRequest() {
        return request;
    }

    public void setRequest(InsertContractRequest request) {
        this.request = request;
    }

    // Add any other necessary methods

    // ...
}
