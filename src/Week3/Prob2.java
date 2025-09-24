package Week3;

import java.util.*;
class Student{
    Scanner sc=new Scanner(System.in);
    String name;
    int rollno;
    int marks;
    void display(){
        name=sc.nextLine();
        rollno=sc.nextInt();
        marks=sc.nextInt();
        System.out.println("Name: "+ name +"\nRoll No: " + rollno + "\nMarks: "+marks);
    }
}
public class Prob2{
    public static void main(String[] args){
        //Scanner sc= new Scanner(System.in);
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        s1.display();
        s2.display();
        s3.display();


    }
}