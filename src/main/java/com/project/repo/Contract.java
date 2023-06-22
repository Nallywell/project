package com.project.repo;

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
        @Column(name = "IDENTITYVALUE")
        private int identityValue;

        @Column(name = "ACTION")
        private String action;
        @Column(name = "OFFER_PROMO_TYPE")
        private String OfferPromotype;
        @Column(name = "CUSTOMERID")
        private int customerId;
        @Column(name = "NETWORKTYPE")
        private String networkType;
        @Column(name = "MSISDN")
        private int MSISDN;


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
        public int getcustomerId() {
            return customerId;
        }

        public void setcustomerId(int customerId) {
            this.customerId = customerId;
        }
        public String getnetworkType() {
            return networkType;
        }

        public void setnetworkType(String networkType) {
            this.networkType = networkType;
        }
        public int getMSISDN() {
            return MSISDN;
        }

        public void setMSISDN(int MSISDN) {
            this.MSISDN = MSISDN;
        }



        @Override
        public String toString() {
            return "Customer{" +
                    "contractId=" + contractId +
                    ", identityValue='" + identityValue + '\'' +
                    ", ICCID='" + ICCID + '\'' +
                    ", OfferPromotype='" + OfferPromotype + '\'' +
                    ", customerId='" + customerId + '\'' +
                    ", networkType='" + networkType + '\'' +


                    '}';
        }


    }
