package com.project.repo;
import javax.persistence.*;


@SuppressWarnings("JpaObjectClassSignatureInspection")
@Entity
@Table(name ="Customer")
public class Customer {


    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDENTITYVALUE")


    private int identityValue;


    private String action;
    private String name;


    //  private String xml;
    public Customer() {
    }

    public int getidentityValue() {
        return identityValue;
    }

    public void setidentityValue(int serviceName) {
        this.identityValue = serviceName;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "serviceName=" + identityValue +
                ", action='" + action + '\'' +
                ", name=" + name +
                '}';
    }
}




