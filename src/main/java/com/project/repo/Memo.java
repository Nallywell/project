package com.project.repo;
import javax.persistence.*;

import java.sql.Timestamp;


@SuppressWarnings("JpaObjectClassSignatureInspection")
@Entity

@Table(name ="Memo")

public class Memo {
        @Id
        @Column(name = "MEMO_NUMBER")
        private int MemoNumber;

        @Column(name = "CC_ID")
        private Integer ccId;

        @Column(name = "CO_ID")
        private Integer coId;

        @Column(name = "SHORT_DESCRIPTION", length = 50)
        private String shortDescription;

        @Column(name = "LONG_DESCRIPTION", length = 100)
        private String longDescription;

     @Column(name = "CREATDBY")
    private String createBy;
        public Memo() {
        }

        public int getMemoNumber() {
            return MemoNumber;
        }

        public void setMemoNumber(int ticklerNumber) {
            this.MemoNumber = ticklerNumber;
        }

        public Integer getCcId() {
            return ccId;
        }

        public void setCcId(Integer ccId) {
            this.ccId = ccId;
        }

        public Integer getCoId() {
            return coId;
        }

        public void setCoId(Integer coId) {
            this.coId = coId;
        }

        public String getShortDescription() {
            return shortDescription;
        }

        public void setShortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
        }

        public String getLongDescription() {
            return longDescription;
        }

        public void setLongDescription(String longDescription) {
            this.longDescription = longDescription;
        }
    public String getcreateBy() {
        return createBy;
    }

    public void setScreateBy(String createBy) {
        this.createBy = createBy;
    }


        @Override
        public String toString() {
            return "Log{" +
                    "MemoNumber=" + MemoNumber +
                    ", ccId=" + ccId +
                    ", coId=" + coId +
                    ", shortDescription='" + shortDescription + '\'' +
                    ", longDescription='" + longDescription + '\'' +
                   ", createBy=" + createBy +
                    '}';
        }
    }

