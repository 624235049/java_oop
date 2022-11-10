
package chap5;


public class Student {
    private String studentId;
    private String studentName;
    private Counsellor con;
    private Parent parent;

    public Student(String studentId, String studentName, Counsellor con, Parent parent) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.con = con;
        this.parent = parent;
    }

    public Student() {
    }
    
    
    
    
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Counsellor getCon() {
        return con;
    }

    public void setCon(Counsellor con) {
        this.con = con;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }
    
    void printDetail (){
        System.out.println("Student Id: "+studentId);
        System.out.println("Student Name: "+studentName);
        System.out.println("Counseller Id: :"+con.getCounsellorId());
        System.out.println("Counseller Name: :"+con.getCounsellorName());
        System.out.println("Telephone: "+con.getTelephoneNo());
        System.out.println("Parent Name: "+parent.getParentName());
        System.out.println("Address: "+parent.getAdress());
        System.out.println("Telephone: "+parent.getTelephoneNo());
        
        
    
    }
    
}
