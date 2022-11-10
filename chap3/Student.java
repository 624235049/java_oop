package chap3;

public class Student {
    protected int id;
    protected String name;
    protected String surname;
    protected String sex;
    protected int age;
    protected String major;

    public Student() {
        System.out.println("Dafault Constructor");
    }

    public Student(int id, String name, String surname, String sex, int age, String major) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.age = age;
        this.major = major;
    }
    
    
    public void enrollment(){
        System.out.println("enroll 1/2564");
    } 
    public void paymet(){
        System.out.println("payment 7000");
    }
    public void addCourse(){
        System.out.println("oop");
    }
    public void dropCourse(){
        System.out.println("Math");
    }
    public static void main(String[] args) {
        //Student s1 = new Student();
        Student s1 = new Student(032, "Suban", "Noksang", "Male", 20, "IT");
        System.out.println("Object = "+s1);
//        suban.id =624235049;
//        suban.name = "Suban";
//        suban.surname = "Noksang";
//        suban.age = 20;
//        suban.sex = "Male";
//        suban.major = "IT";
//        
        System.out.println("ID = "+s1.id);
        System.out.println("Name ="+s1.name);
        System.out.println("Surame ="+s1.surname);
        System.out.println("Age ="+s1.age);
        System.out.println("Sex ="+s1.sex);
        System.out.println("Major ="+s1.major);
//        
//        suban.dropCourse();
//        
        
    }
}//end class