package com.project.repo;

import javax.persistence.*;

@SuppressWarnings("JpaObjectClassSignatureInspection")
@Entity
@Table(name = "LOG_TRIGGER", schema = "C##NALLY")
public class LogTrigger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "WS_NAME")
    private String serviceName;

    public LogTrigger() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

}
