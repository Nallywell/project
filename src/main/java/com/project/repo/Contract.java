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
        @Column(name = "ICCID")
        private int ICCID;

        public Contract() {
        }

        public int getICCID() {
            return ICCID;
        }

        public void setICCID(int ICCID) {
            this.ICCID = ICCID;
        }
}
