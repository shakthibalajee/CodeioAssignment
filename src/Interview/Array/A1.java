import java.util.*;
public class A1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=1;j<n;j++){
            if(arr[j+1] != arr[j]+1){
                System.out.println(arr[j]+1);
                return;
            }
        }
    }
}