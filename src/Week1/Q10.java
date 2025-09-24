package Week1;

import java.util.*;
public class Q10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bill=sc.nextInt();
        if(bill>1000) bill-=(0.1*bill);
        else if(bill>=500 && bill<=1000) bill-=(0.05*bill);
        System.out.println(" Your Electricity bill is Rs. " + bill);
    }
}