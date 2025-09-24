package Week3;

import java.util.*;
class Books{
    String title;
    String author;
    double price;
    public Books(){
        title="Untitled";
        author="Unknown";
        price=0.0;
    }
    public Books(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public void display(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }
}
public class Prob3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Books defaulter= new Books();
        defaulter.display();

        System.out.println(" ");

        Books parameter = new Books("Ikigai","Hector Gracia",259.90);
        parameter.display();


    }
}