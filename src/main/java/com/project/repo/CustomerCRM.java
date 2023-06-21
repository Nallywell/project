package com.project.repo;

import javax.persistence.*;

@SuppressWarnings("JpaObjectClassSignatureInspection")
@Entity
@Table(name = "CUSTOMERCRM")
public class CustomerCRM {

    @Id

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
    @Column(name = "IDENTITYID")
    private int identityId;
    @Column(name = "DELIVERYD")
    private String deliveryD;

    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "COMMUNE")
    private String commune;
    @Column(name = "WILAYA")
    private String wilaya;
    @Column(name = "TITLE")
    private String title;
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
    public int getidentityId() {
        return identityId;
    }

    public void setidentityId(int identityId) {
        this.identityId = identityId;
    }
    public String getdeliveryD() {
        return deliveryD;
    }

    public void setdeliveryD(String deliveryD) {
        this.deliveryD = deliveryD;
    }
    public String getaddress() {
        return address;
    }

    public void setaddress(String address) {
        this.address = address;
    }
    public String getcommune() {
        return commune;
    }

    public void setcommune(String commune) {
        this.commune = commune;
    }
    public String getwilaya() {
        return wilaya;
    }

    public void setwilaya(String wilaya) {
        this.wilaya = wilaya;
    }
    public String gettitle() {
        return title;
    }

    public void settitle(String title) {
        this.title = title;
    }



    @Override
    public String toString() {
        return "Customer{" +
                "identityValue=" + identityValue +
                ", title='" + title + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", customerId='" + customerId + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", identityTypeCode='" + identityTypeCode + '\'' +
                ", deliveryD='" + deliveryD + '\'' +
                ", address='" + address + '\'' +
                ", commune='" + commune + '\'' +
                ", wilaya='" + wilaya + '\'' +


                '}';
    }


}
