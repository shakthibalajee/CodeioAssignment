package Week1;

import java.util.*;
public class Q9{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int mark=sc.nextInt();
        if(mark>100) System.out.println("Invalid Input");
        else System.out.println(mark>=50 ? "Pass" : "Fail");
    }
}