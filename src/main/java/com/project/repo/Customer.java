package com.project.repo;

import javax.persistence.*;

@SuppressWarnings("JpaObjectClassSignatureInspection")
@Entity
@Table(name = "Customer")
public class Customer {

    @Id

    @Column(name = "IDENTITYVALUE")
    private int identityValue;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "BIRTH_DATE")
    private String birthDate;

    public Customer() {
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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "identityValue=" + identityValue +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }
}
