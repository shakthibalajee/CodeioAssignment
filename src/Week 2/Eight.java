import java.util.*;
public class Eight{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=n;
        int rev=0;
        while(x>0){
            int rem=x%10;
            x/=10;
            rev=rev*10+rem;
        }
        System.out.println(rev==n ? "Palindrome":"Not a Palindrome");
    }
}