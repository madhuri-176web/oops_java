
package javapracticals;

class Product {

    String name;
    double price;
    int quantity;

    // Constructor 1: No arguments
    Product() {
        name = "Unknown";
        price = 0;
        quantity = 0;
    }

    // Constructor 2: Product name only
    Product(String n) {
        name = n;
        price = 0;
        quantity = 0;
    }

    // Constructor 3: Product name and price
    Product(String n, double p) {
        name = n;
        price = p;
        quantity = 1;
    }

    // Constructor 4: All three fields
    Product(String n, double p, int q) {
        name = n;
        price = p;
        quantity = q;
    }

    // Calculate total cost
    double totalCost() {
        return price * quantity;
    }

    // Display product details
    void display() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost());
        System.out.println("-------------------");
    }
}

public class Practical8 {

    public static void main(String[] args) {

        Product p1 = new Product();

        Product p2 = new Product("Laptop");

        Product p3 = new Product("Mouse", 500);

        Product p4 = new Product("Keyboard", 1000, 2);

        System.out.println("No Argument Constructor:");
        p1.display();

        System.out.println("Name Constructor:");
        p2.display();

        System.out.println("Name and Price Constructor:");
        p3.display();

        System.out.println("All Arguments Constructor:");
        p4.display();
    }
}
