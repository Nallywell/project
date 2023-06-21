package com.project.config;

import com.project.classes.*;
import com.project.repo.*;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.xml.bind.JAXBElement;
import java.util.ArrayList;
import java.util.List;

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
  /*  @PayloadRoot(namespace = "http://project.com/classes", localPart = "NotifyLogRequest")
    @ResponsePayload
    public JAXBElement<NotifyLogResponse> notifyLogResponse(@RequestPayload NotifyLogRequest request) {
        NotifyLogResponse response = new NotifyLogResponse();
        employeeService.NotifyESB(request.getId(),request.getServiceName());
        response.setStatus(true);
        return new ObjectFactory().createNotifyLogResponse(response);
    }*/
  @PayloadRoot(namespace = "http://project.com/classes", localPart = "NotifyESBRequest")
  @ResponsePayload
  public JAXBElement<NotifyESBResponse> notifyESBResponse(@RequestPayload NotifyESBRequest request) {
      NotifyESBResponse response = new NotifyESBResponse();
      employeeService.notifyESB(request.getId(),request.getServiceName());
      response.setStatus(true);
      return new ObjectFactory().createNotifyESBResponse(response);
  }


 @PayloadRoot(namespace = "http://project.com/classes", localPart = "InsertCustomerCrmRequest")
    @ResponsePayload
    public JAXBElement<InsertCustomerCrmResponse> InsertCustomerCrmResponse(@RequestPayload InsertCustomerCrmRequest request) {
     InsertCustomerCrmResponse response = new InsertCustomerCrmResponse();
     boolean result = employeeService.insertCustomerCrm(request.getId(), request.getIdentityvalue(), request.getFirstName(), request.getLastName(), request.getBirthDate());
     response.setStatus(result);
        return new ObjectFactory().createInsertCustomerCrmResponse(response);
    }


    @PayloadRoot(namespace = "http://project.com/classes", localPart = "InsertContractCrmRequest")
    @ResponsePayload
    public JAXBElement<InsertContractCrmResponse> InsertContractCrmResponse(@RequestPayload InsertContractCrmRequest request) {
        InsertContractCrmResponse response = new InsertContractCrmResponse();
        boolean result = employeeService.insertContractCrm(request.getId(), request.getIdentityValue(), request.getIccid());
        response.setStatus(result);
        return new ObjectFactory().createInsertContractCrmResponse(response);
    }
    @PayloadRoot(namespace = "http://project.com/classes", localPart = "InsertInfoRequest")
    @ResponsePayload
    public JAXBElement<InsertInfoResponse> InsertInfoResponse(@RequestPayload InsertInfoRequest request) {
        InsertInfoResponse response = new InsertInfoResponse();
        boolean result = employeeService.insertInfo(request.getIdentityValue(), request.getFirstName(),
                request.getLastName(), request.getBirthDate(), request.getIccid());
        response.setStatus(result);
        return new ObjectFactory().createInsertInfoResponse(response);

    }

    @PayloadRoot(namespace = "http://project.com/classes", localPart = "GetAllCustomerRequest")
    @ResponsePayload
    public JAXBElement<GetAllCustomerResponse> getAllCustomerResponse(@RequestPayload GetAllCustomerRequest request) {
        GetAllCustomerResponse response = new GetAllCustomerResponse();
        List<CustomerDetails> customerDetailsList = new ArrayList<>();
        List<Customer> customerList = employeeService.getAllCustomers();
        for (Customer customer : customerList) {
            CustomerDetails customerDetails = new CustomerDetails();
            BeanUtils.copyProperties(customer, customerDetails);
            customerDetailsList.add(customerDetails);
        }
        response.getCustomerDetails().addAll(customerDetailsList);
        return new ObjectFactory().createGetAllCustomerResponse(response);
    }




    @PayloadRoot(namespace = "http://project.com/classes", localPart = "GetAllContractsRequest")
    @ResponsePayload
    public JAXBElement<GetAllContractsResponse> GetAllContractsResponse(@RequestPayload GetAllContractsRequest request) {
        GetAllContractsResponse response = new GetAllContractsResponse();
        List<ContractDetails> contractDetailsList = new ArrayList<>();
        List<Contract>contractList = employeeService.getAllContracts();
        for (Contract contract : contractList) {
            ContractDetails contractDetails = new ContractDetails();
            BeanUtils.copyProperties(contract, contractDetails);
            contractDetailsList.add(contractDetails);
        }
        response.getContractDetails().addAll(contractDetailsList);
        return new ObjectFactory().createGetAllContractsResponse(response);
    }

    @PayloadRoot(namespace = "http://project.com/classes", localPart = "GetAllContractCRMsRequest")
    @ResponsePayload
    public JAXBElement<GetAllContractCRMsResponse> GetAllContractCRMsResponse(@RequestPayload GetAllContractCRMsRequest request) {
        GetAllContractCRMsResponse response = new GetAllContractCRMsResponse();
        List<ContractCRMDetails> contractDetailsList = new ArrayList<>();
        List<ContractCRM>contractList = employeeService.getAllContractCRM();
        for (ContractCRM contract : contractList) {
            ContractCRMDetails contractDetails = new ContractCRMDetails();
            BeanUtils.copyProperties(contract, contractDetails);
            contractDetailsList.add(contractDetails);
        }
        response.getContractCRMDetails().addAll(contractDetailsList);
        return new ObjectFactory().createGetAllContractCRMsResponse(response);
    }
    @PayloadRoot(namespace = "http://project.com/classes", localPart = "GetAllCustomerCRMRequest")
    @ResponsePayload
    public JAXBElement<GetAllCustomerCRMResponse> GetAllCustomerCRMResponse(@RequestPayload GetAllCustomerCRMRequest request) {
        GetAllCustomerCRMResponse response = new GetAllCustomerCRMResponse();
        List<CustomerCRMDetails> customerDetailsList = new ArrayList<>();
        List<CustomerCRM>customerList = employeeService.getAllCustomerCRM();
        for (CustomerCRM customer : customerList) {
            CustomerCRMDetails customerDetails = new CustomerCRMDetails();
            BeanUtils.copyProperties(customer, customerDetails);
            customerDetailsList.add(customerDetails);
        }
        response.getCustomerCRMDetails().addAll(customerDetailsList);
        return new ObjectFactory().createGetAllCustomerCRMResponse(response);
    }
    @PayloadRoot(namespace = "http://project.com/classes", localPart = "GetAllEntityLogRequest")
    @ResponsePayload
    public JAXBElement<GetAllEntityLogResponse> GetAllEntityLogResponse(@RequestPayload GetAllEntityLogRequest request) {
        GetAllEntityLogResponse response = new GetAllEntityLogResponse();
        List<LogDetails> logDetailsList = new ArrayList<>();
        List<Log>logList = employeeService.getAllEntityLog();
        for (Log log : logList) {
            LogDetails logDetails = new LogDetails();
            BeanUtils.copyProperties(log, logDetails);
            logDetailsList.add(logDetails);
        }
        response.getLogDetails().addAll(logDetailsList);
        return new ObjectFactory().createGetAllEntityLogResponse(response);
    }

    @PayloadRoot(namespace = "http://project.com/classes", localPart = "GetAllMemosRequest")
    @ResponsePayload
    public JAXBElement<GetAllMemosResponse> GetAllMemosResponse(@RequestPayload GetAllMemosRequest request) {
        GetAllMemosResponse response = new GetAllMemosResponse();
        List<MemoDetails> memoDetailsList = new ArrayList<>();
        List<Memo>memoList = employeeService.getAllMemo();
        for (Memo memo : memoList) {
            MemoDetails memoDetails = new MemoDetails();
            BeanUtils.copyProperties(memo, memoDetails);
            memoDetailsList.add(memoDetails);
        }
        response.getMemoDetails().addAll(memoDetailsList);
        return new ObjectFactory().createGetAllMemosResponse(response);
    }
}