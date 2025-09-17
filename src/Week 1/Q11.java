import java.util.*;
public class Q11{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int mark=sc.nextInt();
        if(mark>=90) System.out.println("Grade A");
        else if(mark<=89 && mark>=75)  System.out.println("Grade B");
        else if(mark<=74 && mark>=50)  System.out.println("Grade C");
        else if(mark<=67 && mark>=40)  System.out.println("Fail");
    }
}