
package chap5;


public class MyAccount {
    public static void main(String[] args) {
    //    BankAccount ba = new BankAccount(100, "Suban", 1000);
    //    ba.printDetails();
    //    ba.deposit(500);
    //    ba.printDetails();
        
    //    ba.withdraw(300);
     //   ba.printDetails();
     
     //SavingAccount sv = new SavingAccount(200, "Suban", 2000);
     //sv.printDetails();
     //sv.deposit(1000);
     //sv.printDetails();
     //sv.withdraw(2970);
     //sv.printDetails();
     
     FixDepositAccount fd = new FixDepositAccount(200, "Suban", 2000);
     fd.printDetails();
     fd.deposit(400);
     fd.printDetails();
     fd.withdraw(2500);
     fd.printDetails();
    }
    
    
    
}//end class
