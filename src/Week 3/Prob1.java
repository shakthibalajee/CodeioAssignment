import java.util.*;
class Rectangle {
    int length;
    int breadth;
    void area() {
        System.out.println("Area: "+ length * breadth);
    }

    void perimeter() {
        System.out.println("Perimeter: "+ 2 * (length + breadth));
    }
    Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
}
public class Prob1{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        Rectangle r1= new Rectangle(l,b);
        r1.area();
        r1.perimeter();
    }
}