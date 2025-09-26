import java.util.*;
public class A2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum[]=new int[n];
        for(int i=0;i<n;i++){
            sum[i]=sc.nextInt();
        }
        int currentSum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int temp=sum[i]+currentSum;
            if(temp>sum[i]){
                currentSum=temp;
            }
            else{
                currentSum=sum[i];
            }
            if(max<currentSum){
                max=currentSum;
            }
        }
        System.out.println(max);
    }
}
// -2,1,-3,4,-1,2,1,-5,4