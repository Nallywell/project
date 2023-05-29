package com.project.config;

import com.project.add.InsertContractRequestWrapper;
import com.project.add.InsertCustomerRequestWrapper;
import com.project.classes.InsertContractRequest;
import com.project.classes.InsertCustomerRequest;
import com.project.repo.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

@Component
@ComponentScan
public class EmployeeServiceImpl {

    private CustomerRepo customerRepo;
    private LogRepo logRepo;
    private MemoRepo memoRepo;
    private ContractRepo contractRepo;

    @Autowired
    public EmployeeServiceImpl(CustomerRepo customerRepo, LogRepo logRepo, MemoRepo memoRepo, ContractRepo contractRepo) {
        this.customerRepo = customerRepo;
        this.logRepo = logRepo;
        this.memoRepo = memoRepo;
        this.contractRepo = contractRepo;
    }
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
        log.setServiceName("SetCustomer");
        log.setXml(generateXmlRequest(identityValue, firstName, lastName, birthDate));
        memo1.setMemoNumber(1);
        memo2.setMemoNumber(2);
        memo3.setMemoNumber(3);

        memo1.setMemoNumber(1);
        memo1.setCcId(customerId);
        memo1.setCoId(null);
        memo1.setLongDescription("hello");
        memo1.setShortDescription("cc new");
        memo1.setScreateBy("DIGIT");

        memo2.setMemoNumber(2);
        memo2.setCcId(customerId);
        memo2.setCoId(null);
        memo2.setLongDescription("helloWold");
        memo2.setShortDescription("cc address");
        memo2.setScreateBy("DIGIT");

        memo3.setMemoNumber(3);
        memo3.setCcId(customerId);
        memo3.setCoId(null);
        memo3.setLongDescription("world");
        memo3.setShortDescription("cc_update");
        memo3.setScreateBy("DIGIT");

        try {
            logRepo.save(log); // Save the log entry with customerId as mainInput
            memoRepo.save(memo1);
            memoRepo.save(memo2);
            memoRepo.save(memo3);





            System.out.println("Customer ID: " + customerId);

            return true; // Return true if the insertion was successful
        } catch (Exception e) {
            e.printStackTrace();
            return false; // Return false if there was an error during the insertion
        }
    }// Generate XML request using JAXB
    private String generateXmlRequest(int identityValue, String firstName, String lastName, String birthDate) {
        try {
            // Create the JAXBContext for the desired class
            JAXBContext context = JAXBContext.newInstance(InsertCustomerRequestWrapper.class);

            // Create the marshaller
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            // Create an instance of your request wrapper class
            InsertCustomerRequestWrapper wrapper = new InsertCustomerRequestWrapper();

            // Create an instance of the original request class and set the values
            InsertCustomerRequest request = new InsertCustomerRequest();
            request.setIdentityvalue(identityValue);
            request.setFirstName(firstName);
            request.setLastName(lastName);
            request.setBirthDate(birthDate);

            // Set the request object in the wrapper
            wrapper.setRequest(request);

            // Marshal the wrapper to a string
            StringWriter writer = new StringWriter();
            marshaller.marshal(wrapper, writer);
            return writer.toString();
        } catch (JAXBException e) {
            e.printStackTrace();
            return null; // Error occurred during XML generation
        }
    }

    public boolean insertContract(int ICCID, int identityValue) {
        Contract contract = new Contract();

        Log log = new Log();
        Memo memo4 = new Memo();
        Memo memo5 = new Memo();
        Memo memo6 = new Memo();
        contract.setICCID(ICCID);
        contract.setidentityValue(identityValue);
        contract.setAction("CREATE");
        contract.setOfferPromotype("D_IBIZA1500");

        contract = contractRepo.saveAndFlush(contract);
        int contractId = contract.getContractId();

        log.setMainInput(contractId);
        log.setServiceName("SetContract");

        // Generate XML request for the contract

        log.setXml(generateXmlRequestContract(ICCID, identityValue));
        // Retrieve customerId based on matching identityValue
        Integer customerId = customerRepo.findCustomerIdByIdentityValue(identityValue);

        if (customerId != null) {
            memo4.setCcId(customerId); // Set the customerId as the ccId for memo1
            memo5.setCcId(customerId); // Set the customerId as the ccId for memo2
            memo6.setCcId(customerId); // Set the customerId as the ccId for memo3
        }

        memo4.setMemoNumber(1);
        memo4.setCoId(contractId);
        memo4.setLongDescription("hello");
        memo4.setShortDescription("cc co new");
        memo4.setScreateBy("digit");

        memo5.setMemoNumber(2);
        memo5.setCoId(contractId);
        memo5.setLongDescription("helloWold");
        memo5.setShortDescription("cc co address");
        memo5.setScreateBy("digit");

        memo6.setMemoNumber(3);
        memo6.setCoId(contractId);
        memo6.setLongDescription("world");
        memo6.setShortDescription("cc co update");
        memo6.setScreateBy("digit");

        try {
            logRepo.save(log);
            memoRepo.save(memo4);
            memoRepo.save(memo5);
            memoRepo.save(memo6);

            System.out.println("Contract ID: " + contractId);

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private String generateXmlRequestContract(int ICCID, int identityValue) {
        try {
            // Create the JAXBContext for the desired class
            JAXBContext context = JAXBContext.newInstance(InsertContractRequestWrapper.class);

            // Create the marshaller
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            // Create an instance of your request wrapper class
            InsertContractRequestWrapper wrapper = new InsertContractRequestWrapper();

            // Create an instance of the original request class and set the values
            InsertContractRequest request = new InsertContractRequest();
            request.setICCID(ICCID);
            request.setIdentityvalue(identityValue);

            // Set the request object in the wrapper
            wrapper.setRequest(request);

            // Marshal the wrapper to a string
            StringWriter writer = new StringWriter();
            marshaller.marshal(wrapper, writer);
            return writer.toString();
        } catch (JAXBException e) {
            e.printStackTrace();
            return null; // Error occurred during XML generation
        }
    }
}

