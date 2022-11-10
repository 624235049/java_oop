package chap5;


public class SavingAccount extends BankAccount {

    public SavingAccount(int accountNo, String accountName, double balance) {
        super(accountNo, accountName, balance);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("ถอนเงิน"+amount);
        double bal = getBalance() - amount;
        if (bal < 50) {
            System.out.println("ถอนไม่ได้ครับ ยอดเงินคงเหลือ < 50:");
        } else {
            setBalance(bal); 
        }
    }
    
    
}//end class
