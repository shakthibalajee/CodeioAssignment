package Week2;

import java.util.*;
public class Three{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Integer> map=new HashMap<>();
        int arr[]={2,4,2,6,2,9,6};
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:map.keySet()){
            System.out.println(i + " appears " + map.get(i) +" Times " );
        }
    }
}