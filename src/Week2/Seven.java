package Week2;

import java.util.*;
public class Seven{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=n;
        int sum=0;
        while(x>0){
            int rem=x%10;
            sum+=(rem*rem*rem);
            x/=10;
        }
        if(sum==n) System.out.println("Armstrong Number");
        else System.out.println("Not Armstrong Number");
    }
}