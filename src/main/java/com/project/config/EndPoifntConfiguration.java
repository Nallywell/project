package com.project.config;

import com.project.classes.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.xml.bind.JAXBElement;

@ComponentScan
@Endpoint


public class EndPoifntConfiguration {


    EmployeeServiceImpl services;

    private final EmployeeServiceImpl employeeService;


    public EndPoifntConfiguration(EmployeeServiceImpl employeeService) {
        this.employeeService = employeeService;
    }
    @PayloadRoot(namespace = "http://project.com/classes", localPart = "InsertCustomerRequest")
    @ResponsePayload
    public JAXBElement<InsertCustomerResponse> insertCustomerResponse(@RequestPayload InsertCustomerRequest request) {
        InsertCustomerResponse response = new InsertCustomerResponse();
        employeeService.insertCustomer(request.getIdentityvalue(), request.getFirstName(), request.getLastName(), request.getBirthDate());
        response.setStatus(true);
        return new ObjectFactory().createInsertCustomerResponse(response);
    }

    @PayloadRoot(namespace = "http://project.com/classes", localPart = "InsertContractRequest")
    @ResponsePayload
    public JAXBElement<InsertContractResponse> insertContractResponse(@RequestPayload InsertContractRequest request) {
        InsertContractResponse response = new InsertContractResponse();
        employeeService.insertContract(request.getICCID(), request.getIdentityvalue());
        response.setStatus(true);
        return new ObjectFactory().createInsertContractResponse(response);
    }
    @PayloadRoot(namespace = "http://project.com/classes", localPart = "NotifyLogRequest")
    @ResponsePayload
    public JAXBElement<NotifyLogResponse> notifyLogResponse(@RequestPayload NotifyLogRequest request) {
        NotifyLogResponse response = new NotifyLogResponse();
        employeeService.notifyESB(request.getId(),request.getServiceName());
        response.setStatus(true);
        return new ObjectFactory().createNotifyLogResponse(response);
    }
 }