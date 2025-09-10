import java.util.*;

public class Q2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int balance=sc.nextInt();
        if(balance==0){
            System.out.println("Zero Balance");
        }
        else if(balance>0){
            System.out.println("Positive Balance");
        }
        else{
            System.out.println("Negative Balance");
        }
    }
}