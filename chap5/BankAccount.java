
package chap5;

public class BankAccount {
    
    private int accountNo;
    private String accountName;
    private double balance;

    public BankAccount(int accountNo, String accountName, double balance) {
        this.accountNo = accountNo;
        this.accountName = accountName;
        this.balance = balance;
    }

    
    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    
    public void printDetails(){
        System.out.println("------------");
        System.out.println("No :"+accountNo);
        System.out.println("Name :"+accountName);
        System.out.println("Balance :"+balance);
        System.out.println("-----------");
    }
    
    public void deposit(double amount){
        System.out.println("ฝากเงิน"+amount);
        balance = getBalance() + amount;
        
    }
    
     public void withdraw(double amount){
        System.out.println("ถอนเงิน"+amount);
        balance = getBalance() - amount;
        
    }
    
}//end class
