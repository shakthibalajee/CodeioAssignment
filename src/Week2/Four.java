package Week2;

import java.util.*;
public class Four{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]={10,20,30,40,50,60};
        for(int i=0;i<6;i++){
            if(i%2==0){
                System.out.print( arr[i] +"\t");
            }
        }
    }
}