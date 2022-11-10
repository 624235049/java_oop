package chap5;


public class Counsellor {
    private String counsellorId;
    private String counsellorName;
    private String telephoneNo;

    public Counsellor(String counsellorId, String counsellorName, String telephoneNo) {
        this.counsellorId = counsellorId;
        this.counsellorName = counsellorName;
        this.telephoneNo = telephoneNo;
    }

    public Counsellor() {
    }
    
    
    public String getCounsellorId() {
        return counsellorId;
    }

    public void setCounsellorId(String counsellorId) {
        this.counsellorId = counsellorId;
    }

    public String getCounsellorName() {
        return counsellorName;
    }

    public void setCounsellorName(String counsellorName) {
        this.counsellorName = counsellorName;
    }

    public String getTelephoneNo() {
        return telephoneNo;
    }

    public void setTelephoneNo(String telephoneNo) {
        this.telephoneNo = telephoneNo;
    }
    
    
}//end class
