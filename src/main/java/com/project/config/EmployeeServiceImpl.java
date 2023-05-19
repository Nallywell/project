package com.project.config;
//import com.project.repo.Log;
//import com.project.repo.LogRepo;
//import com.project.repo.Ticklers;
//import com.project.repo.TicklersRepo;
import com.project.repo.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
@Component
@ComponentScan

public class EmployeeServiceImpl {





    private CustomerRepo customerRepo;
    private LogRepo LogRepo;
    private MemoRepo memoRepo;


    public EmployeeServiceImpl(CustomerRepo customerRepo, LogRepo LogRepo, MemoRepo memoRepo) {
        this.customerRepo=customerRepo;
        this.LogRepo = LogRepo;
        this.memoRepo=memoRepo;
    }

    public boolean insertCustomer(int identityValue, String action, String name ) {
        Customer customer = new Customer();
        Log log =new Log();
        Memo memo1 = new Memo();
        Memo memo2 = new Memo();
        Memo memo3 = new Memo();
        customer.setidentityValue(identityValue);
        customer.setAction(action);
        customer.setName(name);
        log.setMainInput(12);
        log.setIdentityValue(123);
        log.setServiceName("Setlog");
        memo1.setMemoNumber(1);
        memo1.setCcId(12);
        memo1.setCoId(90);
        memo1.setLongDescription("hello");
        memo1.setShortDescription("cc new");
        memo2.setMemoNumber(2);
        memo2.setCcId(987);
        memo2.setCoId(9098);
        memo2.setLongDescription("helloWold");
        memo2.setShortDescription("conew");
        memo3.setMemoNumber(3);
        memo3.setCcId(1567);
        memo3.setCoId(9098978);
        memo3.setLongDescription("world");
        memo3.setShortDescription("add new");





        try {
            customerRepo.save(customer);
            LogRepo.save(log);
            memoRepo.save(memo1);
            memoRepo.save(memo2);
            memoRepo.save(memo3);

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
