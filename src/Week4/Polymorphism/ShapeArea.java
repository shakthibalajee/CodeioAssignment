package Week4.Polymorphism;
import java.util.*;

abstract class Shape{
    abstract double area();
}

class Circle extends Shape{
    double radius;
    Circle(double r){
        radius=r;
    }
    @Override
    double area() {
        return Math.PI*radius*radius;
    }
}

class Rectangle extends Shape{
    double length,width;
    Rectangle(double l,double w){
        length=l;
        width=w;
    }
    @Override
    double area(){
        return length*width;
    }
}

class Triangle extends Shape{
    double base,height;
    Triangle(double b,double h){
        base=b;
        height=h;
    }
    @Override
    double area(){
        return 0.5*base*height;
    }
}

public class ShapeArea {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        double radius = sc.nextDouble();
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        // Shape Reference array
        Shape[] shapeArray = {new Circle(radius),new Rectangle(length,width),new Triangle(base,height)};
        for(Shape s:shapeArray){
            System.out.println("Area: " + s.area());
        }
    }
}
