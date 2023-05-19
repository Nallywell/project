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




 /*   @PayloadRoot(namespace = "http://soap.com/hrms", localPart = "InsertEmployeeRequest")
    @ResponsePayload
    public JAXBElement<InsertEmployeeResponse> insertEmployeeResponse(@RequestPayload InsertEmployeeRequest request) {
        InsertEmployeeResponse response = new InsertEmployeeResponse();
        employeeService.insertEmployee( request.getIdentityvalue() , request.getServiceName());
        response.setStatus(true);
        return new ObjectFactory().createInsertEmployeeResponse(response);

    }
    @PayloadRoot(namespace = "http://soap.com/hrms", localPart = "InsertMemoRequest")
    @ResponsePayload
    public JAXBElement<InsertMemoResponse> insertMemoResponse(@RequestPayload InsertMemoRequest request) {
        InsertMemoResponse response = new InsertMemoResponse();
        employeeService.insertMemo(request.getTicklerNumber(), request.getCcId(), request.getCoId(), request.getShortDescription(), request.getLongDescription());
        response.setStatus(true);
        return new ObjectFactory().createInsertMemoResponse(response);
    }*/}