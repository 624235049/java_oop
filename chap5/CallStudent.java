
package chap5;

    
public class CallStudent {
    public static void main(String[] args) {
        Student Suban = new Student();
        Suban.setStudentId("624235049");
        Suban.setStudentName("Suban"); 
        Suban.setCon(new Counsellor("185","Nalinee","0889551234")); 
        Suban.setParent(new Parent("Somchai","66/2 Hatyai Songkhla 90110","0611675623")); 
        Suban.printDetail();
    }
}//end class
