package Week4.Inheritance;

import org.w3c.dom.Text;

class Book{
    String title;
    String author;
    double price;

    Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price=price;
    }
    void displayBooks(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

class TextBook extends Book{
    String Subjects;
    int edition;
    TextBook(String title, String author, double price,String Subjcts,int edition){
        super(title,author,price);
        this.Subjects = Subjcts;
        this.edition=edition;
    }
    void displayBooks(){
        super.displayBooks();
        System.out.println("Subjects: " + Subjects);
        System.out.println("Edition: " + edition);
    }

}

class Magazine extends Book{
    String Edition;
    int year;
    Magazine(String title,String author,double price,String Edition,int year){
        super(title,author,price);
        this.Edition = Edition;
        this.year=year;
    }
    void displayBooks(){
        super.displayBooks();
        System.out.println("Edition "+Edition);
        System.out.println("Year: "+ year);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {

        Book book = new Book("Science","CV Raman",520.14);
        TextBook textBook = new TextBook("AI","Charles",230.57,"CS",2024);
        Magazine magazine = new Magazine("Hindu","Sandy",6.25,"November",2025);

        System.out.println("Text Book Details: ");
        textBook.displayBooks();

        System.out.println(" ");

        System.out.println("Magazine Details: ");
        magazine.displayBooks();


    }
}
