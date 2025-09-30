package Week4.Abstraction;

abstract class bankAccounts{
    String accountNo;
    double balance;
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
    public bankAccounts(String accountNo,double balance){
        this.accountNo = accountNo;
        this.balance = balance;
    }
    void displayBalance(){
        System.out.println("Your balance is Rs."+balance);
    }
}

class SavingsAccount extends bankAccounts{
    static double MIN_BALANCE = 500;
    SavingsAccount(String accountNo,double balance){
        super(accountNo,balance);
    }
    void deposit(double amount){
        balance += amount;
    }
    void withdraw(double amount){
        if(balance+amount >=  MIN_BALANCE ){
            balance -= amount;
        }
        else{
            System.out.println("Insufficient Minimum balance...");
        }
    }
    void displayBalance(){
        System.out.println("Your Savings Account balance is Rs."+balance);
    }
}

class CurrentAccount extends bankAccounts{
    static double OVERDRAFT_BALANCE=-2000;
    CurrentAccount(String accountNo,double balance){
        super(accountNo,balance);
    }
    void deposit(double amount){
        balance+=amount;
    }
    void withdraw(double amount){
        if(balance-amount >= OVERDRAFT_BALANCE){
            balance-=amount;
        }
        else{
            System.out.println("Overdraft limit exceeded...");
        }
    }
    void  displayBalance(){
        System.out.println("Your Current Account balance is Rs."+balance);
    }
}


public class BankAccount {
    public static void main(String[] args) {
        bankAccounts savings = new SavingsAccount("SA1210",500);
        bankAccounts current = new CurrentAccount("CA1930",400);
        savings.deposit(200);
        current.deposit(100);
        savings.withdraw(201);
        current.withdraw(501);
        savings.displayBalance();
        current.displayBalance();
    }
}
