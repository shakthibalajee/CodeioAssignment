import java.util.*;
public class A4{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int sum=0;
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                if(sum==target){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}