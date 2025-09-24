package Week2;

import java.util.*;
public class One {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[7];
        int pos=0,neg=0,zero=0;
        for(int i=0;i<7;i++){
            arr[i]=sc.nextInt();
            if(arr[i]<0) neg++;
            else if(arr[i]>0) pos++;
            else zero++;
        }
        System.out.println("Positive: "+pos + " Negative: "+neg  + " Zero: " + zero);
    }
}