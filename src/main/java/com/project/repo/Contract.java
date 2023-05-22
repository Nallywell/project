package com.project.repo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;

    @SuppressWarnings("JpaObjectClassSignatureInspection")
    @Entity
    @Table(name = "Contract")
    public class Contract {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "CONTRACTID")
        private int contractId;
        @Column(name = "ICCID")
        private int ICCID;
        @Column(name = "ACTION")
        private String action;
        @Column(name = "OFFER_PROMO_TYPE")
        private String OfferPromotype;
        public Contract() {
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
                    ", ICCID='" + ICCID + '\'' +

                    '}';
        }
}
