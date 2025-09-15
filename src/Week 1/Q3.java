import java.util.*;
public class Q3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int siva=sc.nextInt();
        int shakthi=sc.nextInt();
        if(siva==shakthi){
            System.out.println("Tie");
        }
        else if(siva>shakthi){
            System.out.println("Siva");
        }
        else{
            System.out.println("Shakthi");
        }
    }
}