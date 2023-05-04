package Day2.Exercise1;

public class BankAccount {
    private int accountNumber;
    private double accountBalance;

 public BankAccount(int accountNumber, double accountBalance){
    this.accountNumber = accountNumber;
    this.accountBalance = accountBalance;
 }
 public void deposit(double quantity){
     accountBalance =  accountBalance + quantity;
 }
 public void extract(double quantity){
     if(accountBalance - quantity <0){
         System.out.println("Insufficient funds");
     }else {
         accountBalance = accountBalance -quantity;
     }
 }
 public double getAccountBalance(){
     return accountBalance;
 }

    public int getAccountNumber() {
        return accountNumber;
    }
}
