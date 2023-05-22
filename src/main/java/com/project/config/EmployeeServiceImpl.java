package com.project.config;
//import com.project.repo.Log;
//import com.project.repo.LogRepo;
//import com.project.repo.Ticklers;
//import com.project.repo.TicklersRepo;
import com.project.repo.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
@Component
@ComponentScan

public class EmployeeServiceImpl {

    private CustomerRepo customerRepo;
    private LogRepo LogRepo;
    private MemoRepo memoRepo;
    private ContractRepo contractRepo;



    public EmployeeServiceImpl(CustomerRepo customerRepo, LogRepo LogRepo, MemoRepo memoRepo, ContractRepo contractRepo) {
        this.customerRepo=customerRepo;
        this.LogRepo = LogRepo;
        this.memoRepo=memoRepo;
        this.contractRepo = contractRepo;
    }



  /*  public Integer getCustomerId(int customerId) {
        return customerRepo.findCustomerId(customerId);
    }

    /*public int customerId = employeeServiceImpl.getCustomerId(12345);
 if (customerId != null) {
        System.out.println("Customer ID: " + customerId);
    } else {
        System.out.println("Customer not found");
    }*/




    boolean insertCustomer(int identityValue, String firstName, String lastName, String birthDate) {
        Customer customer = new Customer();
        Log log = new Log();
        Memo memo1 = new Memo();
        Memo memo2 = new Memo();
        Memo memo3 = new Memo();
        customer.setIdentityValue(identityValue);
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customer.setBirthDate(birthDate);
        customer.setAction("CREATE");
        customer.setcustType("C");
        customer.setidentityTypeCode(2);


        // Save the customer to generate the customerId
        customer = customerRepo.saveAndFlush(customer);
        int customerId = customer.getCustomerId();


        log.setMainInput(customerId);
        log.setIdentityValue(123);
        log.setServiceName("SetCustomer");

        memo1.setMemoNumber(1);
        memo1.setCcId(customerId);
        memo1.setCoId(3456);
        memo1.setLongDescription("hello");
        memo1.setShortDescription("cc new");

        memo2.setMemoNumber(2);
        memo2.setCcId(customerId);
        memo2.setCoId(9098);
        memo2.setLongDescription("helloWold");
        memo2.setShortDescription("cc address");

        memo3.setMemoNumber(3);
        memo3.setCcId(customerId);
        memo3.setCoId(9098978);
        memo3.setLongDescription("world");
        memo3.setShortDescription("cc update");


        try {
            LogRepo.save(log); // Save the log entry with customerId as mainInput
            memoRepo.save(memo1);
            memoRepo.save(memo2);
            memoRepo.save(memo3);

            System.out.println("Customer ID: " + customerId);

            return true; // Return true if the insertion was successful
        } catch (Exception e) {
            e.printStackTrace();
            return false; // Return false if there was an error during the insertion
        }
    }

    public boolean insertContract(int ICCID) {
        Contract contract = new Contract();

        Log log = new Log();
        Memo memo1 = new Memo();
        Memo memo2 = new Memo();
        Memo memo3 = new Memo();
        contract.setICCID(ICCID);
        contract.setAction("CREATE");
        contract.setOfferPromotype("D_IBIZA1500");


        contract = contractRepo.saveAndFlush(contract);
        int contractId = contract.getContractId();

        log.setMainInput(contractId);
        log.setIdentityValue(000);
        log.setServiceName("SetContract");

        memo1.setMemoNumber(1);
        memo1.setCcId(444);
        memo1.setCoId(contractId);
        memo1.setLongDescription("hello");
        memo1.setShortDescription("cc new");

        memo2.setMemoNumber(2);
        memo2.setCcId(456);
        memo2.setCoId(contractId);
        memo2.setLongDescription("helloWold");
        memo2.setShortDescription("cc address");

        memo3.setMemoNumber(3);
        memo3.setCcId(567);
        memo3.setCoId(contractId);
        memo3.setLongDescription("world");
        memo3.setShortDescription("cc update");

        try {
            LogRepo.save(log); // Save the log entry with customerId as mainInput
            memoRepo.save(memo1);
            memoRepo.save(memo2);
            memoRepo.save(memo3);

            System.out.println("Contract ID: " + contractId);

            return true; // Return true if the insertion was successful
        } catch (Exception e) {
            e.printStackTrace();
            return false; // Return false if there was an error during the insertion
        }
    }

}





