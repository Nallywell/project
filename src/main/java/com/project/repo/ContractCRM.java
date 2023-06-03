package com.project.repo;

import javax.persistence.*;



@SuppressWarnings("JpaObjectClassSignatureInspection")
@Entity
@Table(name = "ContractCRM")
public class ContractCRM {
    @Id

    @Column(name = "CONTRACTID")
    private int contractId;
    @Column(name = "ICCID")
    private int ICCID;
    @Column(name = "IDENTITYVALUE")
    private int identityValue;

    @Column(name = "ACTION")
    private String action;
    @Column(name = "OFFER_PROMO_TYPE")
    private String OfferPromotype;
    public ContractCRM() {
    }

    public int getICCID() {
        return ICCID;
    }

    public void setICCID(int ICCID) {
        this.ICCID = ICCID;
    }
    public int getContractId() {
        return contractId;
    }

    public void setContractId(int contractId) {
        this.contractId = contractId;
    }
    public int getidentityValue() {
        return identityValue;
    }

    public void setidentityValue(int identityValue) {
        this.identityValue = identityValue;
    }



    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
    public String getOfferPromotype() {
        return OfferPromotype;
    }

    public void setOfferPromotype(String OfferPromotype) {
        this.OfferPromotype = OfferPromotype;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "contractId=" + contractId +
                ", identityValue='" + identityValue + '\'' +
                ", ICCID='" + ICCID + '\'' +
                '}';
    }


}
