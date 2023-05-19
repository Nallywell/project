package com.project.repo;
import javax.persistence.*;


@SuppressWarnings("JpaObjectClassSignatureInspection")
@Entity

@Table(name ="Log")

public class Log {
    @Id
    @Column(name = "MAININPUT")
private int mainInput ;
    @Column(name = "IDENTITYVALUE")
private int identityValue;
    @Column(name = "SERVICENAME")
    private String serviceName;
    public Log() {
    }

    public int getMainInput() {
        return mainInput;
    }

    public void setMainInput(int mainInput) {
        this.mainInput = mainInput;
    }

    public int getIdentityValue() {
        return identityValue;
    }

    public void setIdentityValue(int identityValue) {
        this.identityValue = identityValue;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public String toString() {
        return "Log{" +
                "mainInput=" + mainInput +
                ", identityValue=" + identityValue +
                ", serviceName='" + serviceName + '\'' +
                '}';
    }
}
