package chap5;

public class Parent {

    private String parentName;
    private String adress;
    private String telephoneNo;

    public Parent(String parentName, String adress, String telephoneNo) {
        this.parentName = parentName;
        this.adress = adress;
        this.telephoneNo = telephoneNo;
    }

    
    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getTelephoneNo() {
        return telephoneNo;
    }

    public void setTelephoneNo(String telephoneNo) {
        this.telephoneNo = telephoneNo;
    }
    
    

}// end class
