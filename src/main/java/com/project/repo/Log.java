package com.project.repo;
import javax.persistence.*;


@SuppressWarnings("JpaObjectClassSignatureInspection")
@Entity

@Table(name ="Log")

public class Log {
    @Id
    @Column(name = "TRANSACTION_ID")
    private int TransactionId;
    @Column(name = "MAININPUT")
private int mainInput ;

    @Column(name = "SERVICENAME")
    private String serviceName;

    @Column(name = "XML")
    @Lob
    private String xml;
    @Column(name = "STATUS")
    private String status;

    @Column(name = "SOURCE")
    private String Source;

    @Column(name = "DESTINATION")
    private String Destination;
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
      public String getXML() {
        return xml;
    }

    public void setXml( String xml) {
        this.xml = xml;
    }
    public int getTransactionId() {
        return TransactionId;
    }

    public void setTransactionId( int TransactionId) {
        this.TransactionId = TransactionId;
    }
    public String getSource() {
        return Source;
    }

    public void setSource( String Source) {
        this.Source = Source;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination( String Destination) {
        this.Destination = Destination;
    }

    @Override
    public String toString() {
        return "Log{" +
                "TransactionId=" + TransactionId +
                "mainInput=" + mainInput +
                ", serviceName='" + serviceName + '\'' +
                "status=" + status +
                "xml=" + xml +
                "Source=" + Source +
                "Destination=" + Destination +


                '}';
    }
}
