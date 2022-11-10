package chap3;

public class GraduateStudent extends Student{
    private String studyLevel;
    private String thesisAdviser;
    
    public void oralExam(){
        System.out.println("oralExam()");
    }
    
    public void thesisExam(){
        System.out.println("thesisExam");
    }

    @Override
    public void paymet() {
        super.paymet(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("ตามหน่วยกิต");
    }
    
    
    
    public static void main(String[] args) {
        GraduateStudent suban = new GraduateStudent();
        suban.oralExam();
        suban.thesisExam();
        suban.enrollment();
        suban.addCourse();
    }
    
}//end class
