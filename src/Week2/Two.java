package Week2;

import java.util.*;
public class Two{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int max=-1,smax=-1;
        int arr[]=new int[6];
        for(int i=0;i<6;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>max){
                smax=max;
                max=arr[i];
            }
            else if(arr[i]>smax && arr[i]!=max){
                smax=arr[i];
            }
        }
        System.out.println(" Second Max " +smax);
    }
}