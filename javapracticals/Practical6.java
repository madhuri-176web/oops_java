
package javapracticals;

class Book {

    String title;
    String author;
    double price;

    // Default constructor
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0;
    }

    // Parameterized constructor
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    // Copy constructor
    Book(Book b) {
        title = b.title;
        author = b.author;
        price = b.price;
    }

    // Display book details
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("-------------------");
    }
}

public class Practical6 {

    public static void main(String[] args) {

        // Default constructor
        Book b1 = new Book();

        // Parameterized constructor
        Book b2 = new Book("Java Programming",
                "James Gosling", 500);

        // Copy constructor
        Book b3 = new Book(b2);

        System.out.println("Default Constructor:");
        b1.display();

        System.out.println("Parameterized Constructor:");
        b2.display();

        System.out.println("Copy Constructor:");
        b3.display();

        // Modify copied object
        b3.price = 700;

        System.out.println("After modifying copied object:");
        System.out.println("Original Book Price: " + b2.price);
        System.out.println("Copied Book Price: " + b3.price);
    }
}
