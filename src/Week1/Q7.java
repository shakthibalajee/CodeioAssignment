package Week1;

import java.util.*;
public class Q7{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int op=sc.nextInt();
        if(op==1){
            System.out.println(a+b);
        }
        else if(op==2){
            System.out.println(a-b);
        }
        else if(op==3){
            System.out.println(a*b);
        }
        else if(op==4){
            System.out.println(a/b);
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}