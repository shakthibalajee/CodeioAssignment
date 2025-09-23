import java.util.*;
class Bank{
    String accountNumber;
    double balance;

    Bank(){
        accountNumber="Invalid Number";
        balance=0.0;
    }

    Bank(String accountnumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    void deposit(double amount){
        balance+=amount;
        System.out.println("Deposited Balance:  " + balance);
    }
    void withdraw(double amount){
        balance-=amount;
        System.out.println("Withdrawn Balance: " + balance);
    }
}
public class Prob4{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        Bank regular=new Bank();
        regular.deposit(500.50);
        regular.withdraw(300.25);

        System.out.println("");

        Bank special = new Bank("41213156987",5000);
        special.deposit(5000.75);
        special.withdraw(2500.50);
    }
}