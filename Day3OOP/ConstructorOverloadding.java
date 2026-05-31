package Day3OOP;

class Book{
    String title;
    String author;
    int price;
    Book(String title,String author,int price){
        this.title=title;
        this.author=author;
        this.price=price;

    }
    Book(String title,String author){
        this.title=title;
        this.author=author;

    }
    Book(String title){
        this.title=title;
    }
    void display(){
        System.out.println("The title of the book is: " +title);
        System.out.println("The author of the book is: " +author);
        System.out.println("The price of the book is: " +price);
    }
}
public class ConstructorOverloadding {
    public static void main(String[] args) {
        Book B=new Book("Bob","Karl",50);
        B.display();
        Book B1=new Book("Bob","Karl");
        B1.display();
        Book B2=new Book("Bob");
        B2.display();
    }
}
