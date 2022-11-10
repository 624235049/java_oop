package chap4;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Your name is: "+name);
        
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Your inut age in"+age);
        
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        System.out.println("Your input salary is "+salary);
    }
    
}//end class
