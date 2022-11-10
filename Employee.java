
public class Employee {

    static int id = 1001;
    String name = "Suban";
    int age = 21;

    static void work() {
        System.out.println("work()");
    }

    void getSalary() {
        System.out.println("getSalary()");
    }

    public static void main(String[] args) {
        //call non ststic
        Employee Suban = new Employee();
        Suban.name = "Suban";
        Suban.getSalary();
        //call static
        Employee.id = 624235049;
        Employee.work();

    }
}//endclass
