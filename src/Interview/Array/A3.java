import java.util.*;
public class A3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if (arr[i] > arr[j]){
                    swap(arr, i, j);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int a,int b){
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
    }
}