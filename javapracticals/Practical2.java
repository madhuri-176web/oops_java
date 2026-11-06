
package javapracticals;

// SINGLE INHERITANCE
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is moving");
    }
}

// MULTILEVEL INHERITANCE
class Person {
    void showPerson() {
        System.out.println("I am a Person");
    }
}

class Employee extends Person {
    void showEmployee() {
        System.out.println("I am an Employee");
    }
}

class Manager extends Employee {
    void showManager() {
        System.out.println("I am a Manager");
    }
}

// HIERARCHICAL INHERITANCE
class Shape {
    void display() {
        System.out.println("This is a Shape");
    }
}

class Circle extends Shape {
    double radius = 5;

    void area() {
        System.out.println("Circle Area: " +
                (3.14 * radius * radius));
    }
}

class Rectangle extends Shape {
    int length = 10;
    int breadth = 5;

    void area() {
        System.out.println("Rectangle Area: " +
                (length * breadth));
    }
}

public class Practical2 {
    public static void main(String[] args) {

        // Single Inheritance
        System.out.println("SINGLE INHERITANCE");
        Car c = new Car();
        c.start();
        c.drive();

        // Multilevel Inheritance
        System.out.println("\nMULTILEVEL INHERITANCE");
        Manager m = new Manager();
        m.showPerson();
        m.showEmployee();
        m.showManager();

        // Hierarchical Inheritance
        System.out.println("\nHIERARCHICAL INHERITANCE");

        Circle cir = new Circle();
        cir.display();
        cir.area();

        Rectangle r = new Rectangle();
        r.display();
        r.area();
    }
}

