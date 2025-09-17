import java.util.*;
public class Q8{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int speed=sc.nextInt();
        System.out.println(" Your Speed is " + speed + " km/h ");
        if(speed<=0){
            System.out.println(" Invalid Input ");
        }
        else if(speed<=60){
            System.out.println(" You are within the speed limit ");
        }
        else{
            System.out.println(" Overspeeding! Pay Fine ");
        }
    }
}