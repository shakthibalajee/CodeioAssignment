import java.util.*;
public class Q6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        if(marks>=90 && marks<=100) {
            System.out.println("A");
        }
        else if(marks>=75 && marks<=90){
            System.out.println("B");
        }
        else if(marks>=50 && marks<=75){
            System.out.println("C");
        }
        else{
            System.out.println("Fail");
        }
    }
}