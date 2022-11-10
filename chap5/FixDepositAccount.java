
package chap5;


public class FixDepositAccount extends BankAccount {
    public FixDepositAccount(int accountNo, String accountName, double balance){
        super(accountNo, accountName, balance);
    }

    @Override
    public void deposit(double amount) {
        System.out.println("ฝากเงิน"+amount);
        double balance = getBalance() + amount;
        if(amount <500){
            System.out.println("ฝากไม่ได้ ฝากเงินขั้นต่ำ : 500บาทครับ");
        }else{
            setBalance(balance);
        }
    }
    
    
    
}
