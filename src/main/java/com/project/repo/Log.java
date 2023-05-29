package com.project.repo;
import javax.persistence.*;


@SuppressWarnings("JpaObjectClassSignatureInspection")
@Entity

@Table(name ="Log")

public class Log {
    @Id
    @Column(name = "MAININPUT")
private int mainInput ;

    @Column(name = "SERVICENAME")
    private String serviceName;

    @Column(name = "XML")
    @Lob
    private String xml;
    @Column(name = "STATUS")
    private String status;
    public Log() {
    }

    public int getMainInput() {
        return mainInput;
    }

    public void setMainInput(int mainInput) {
        this.mainInput = mainInput;
    }



    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus( String status) {
        this.status = status;
    }
      public String get() {
        return xml;
    }

    public void setXml( String xml) {
        this.xml = xml;
    }

    @Override
    public String toString() {
        return "Log{" +
                "mainInput=" + mainInput +

                ", serviceName='" + serviceName + '\'' +
                "status=" + status +
                "xml=" + xml +

                '}';
    }
}
