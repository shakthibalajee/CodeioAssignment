import java.util.*;
class Rectangle {
    void area(int length, int breadth) {
        System.out.println("Area: "+ length * breadth);
    }

    void perimeter(int length, int breadth) {
        System.out.println("Perimeter: "+ 2 * (length + breadth));
    }
}
public class Prob1{
    public static void main(String[] args) {
        Rectangle r1= new Rectangle();
        Scanner sc= new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        r1.area(l,b);
        r1.perimeter(l,b);
    }
}