package com.project.repo;

import javax.persistence.*;

@SuppressWarnings("JpaObjectClassSignatureInspection")
@Entity
@Table(name = "Customer")
public class CustomerCRM {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CUSTOMERID")
    private int customerId;

    @Column(name = "IDENTITYVALUE")
    private int identityValue;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;


    @Column(name = "BIRTH_DATE")
    private String birthDate;

    @Column(name = "ACTION")
    private String action;
    @Column(name = "CUST_TYPE")
    private String custType;
    @Column(name = "IDENTITY_TYPE_CODE")
    private int identityTypeCode;
    public CustomerCRM() {
    }


    public int getIdentityValue() {
        return identityValue;
    }

    public void setIdentityValue(int identityValue) {
        this.identityValue = identityValue;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
    public String getcustType() {
        return custType;
    }

    public void setcustType(String custType) {
        this.custType = custType;
    }
    public int identityTypeCode() {
        return identityTypeCode;
    }

    public void setidentityTypeCode(int identityTypeCode) {
        this.identityTypeCode = identityTypeCode;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "identityValue=" + identityValue +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", customerId='" + customerId + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }
}
