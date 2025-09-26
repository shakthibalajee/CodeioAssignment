import java.util.*;
public class S2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        HashMap<Character,Integer> freq = new HashMap<>();
//        HashMap<Character,Integer> freq1 = new HashMap<>();
        for(Character i:s1.toCharArray()){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        for(Character j:s2.toCharArray()){
//            freq1.put(j,freq1.getOrDefault(j,0)+1);
            if(freq.containsKey(j)){
                freq.remove(j);
            }
        }
//        if(freq.equals(freq1)){
//            System.out.println("True");
//        }
//        else{
//            System.out.println("False");
//        }
        if(freq.isEmpty()){
            System.out.println("an Anagram");
        }
        else{
            System.out.println("Not an Anagram");
        }
    }
}