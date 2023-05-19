package com.project.config;
//import com.project.repo.Log;
//import com.project.repo.LogRepo;
//import com.project.repo.Ticklers;
//import com.project.repo.TicklersRepo;
import com.project.repo.Customer;
import com.project.repo.CustomerRepo;
import com.project.repo.Log;
import com.project.repo.LogRepo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
@Component
@ComponentScan

public class EmployeeServiceImpl {




    //private TicklersRepo ticklersRepo;
    private CustomerRepo customerRepo;
    private LogRepo LogRepo;


    public EmployeeServiceImpl(CustomerRepo customerRepo, LogRepo LogRepo) {
        this.customerRepo=customerRepo;
        this.LogRepo = LogRepo;
    }

    public boolean insertCustomer(int identityValue, String action, String name ) {
        Customer customer = new Customer();
        Log log =new Log();
        customer.setidentityValue(identityValue);
        customer.setAction(action);
        customer.setName(name);
        log.setMainInput(12);
        log.setIdentityValue(123);
        log.setServiceName("Setlog");



        try {
            customerRepo.save(customer);
            LogRepo.save(log);
            return true; // Return true if the insertion was successful
        } catch (Exception e) {
            e.printStackTrace();
            return false; // Return false if there was an error during the insertion
        }
    }




   /* public boolean insertEmployee(int identityvalue , String service) {
        Log log = new Log();
        //log.setMainInput(id);
        log.setIdentityValue(identityvalue);
        log.setServiceName(service);



        try {
            repo.save(log);
            return true;  // Return true if the insertion was successful
        } catch (Exception e) {
            e.printStackTrace();
            return false;  // Return false if there was an error during the insertion
        }
    }
    public boolean insertMemo(int ticklerNumber, int ccId, int coId, String shortDescription, String longDescription) {
        Ticklers memo = new Ticklers();

        memo.setTicklerNumber(ticklerNumber);
        memo.setCcId(ccId);
        memo.setCoId(coId);
        memo.setShortDescription(shortDescription);
        memo.setLongDescription(longDescription);

        try {
            ticklersRepo.save(memo);
            return true ;  // Return true if the insertion was successful
        } catch (Exception e) {
            e.printStackTrace();
            return false;  // Return false if there was an error during the insertion
        }
    }*/
}
