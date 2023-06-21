package com.project.repo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "logtrigger")
public class LogTrigger {
    @Id
    @Column(name = "number_update")
    private int numberUpdate;

    @Column(name = "id")
    private int id;

    @Column(name = "serviceName")
    private String wsName;

    @Column(name = "result")
    private String result;

    public LogTrigger() {
    }

    public LogTrigger(int numberUpdate, int id, String wsName, String result) {
        this.numberUpdate = numberUpdate;
        this.id = id;
        this.wsName = wsName;
        this.result = result;
    }

    public int getNumberUpdate() {
        return numberUpdate;
    }

    public void setNumberUpdate(int numberUpdate) {
        this.numberUpdate = numberUpdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWsName() {
        return wsName;
    }

    public void setWsName(String wsName) {
        this.wsName = wsName;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "LogTrigger{" +
                "numberUpdate=" + numberUpdate +
                ", id=" + id +
                ", wsName='" + wsName + '\'' +
                ", result='" + result + '\'' +
                '}';
    }
}