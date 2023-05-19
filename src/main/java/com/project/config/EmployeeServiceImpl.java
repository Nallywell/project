package com.project.config;
//import com.project.repo.Log;
//import com.project.repo.LogRepo;
//import com.project.repo.Ticklers;
//import com.project.repo.TicklersRepo;
import com.project.repo.Customer;
import com.project.repo.CustomerRepo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
@Component
@ComponentScan

public class EmployeeServiceImpl {



    //private LogRepo repo;
    //private TicklersRepo ticklersRepo;
    private CustomerRepo customerRepo;

   /* public EmployeeServiceImpl(LogRepo repo, TicklersRepo ticklersRepo) {
        this.repo = repo;
        this.ticklersRepo = ticklersRepo;
    }*/

    public EmployeeServiceImpl(CustomerRepo customerRepo) {
        this.customerRepo=customerRepo;
    }

    public boolean insertCustomer(int identityValue, String action, String name) {
        Customer customer = new Customer();
        customer.setidentityValue(identityValue);
        customer.setAction(action);
        customer.setName(name);

        try {
            customerRepo.save(customer);
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
