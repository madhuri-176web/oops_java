package javapracticals;

// METHOD OVERLOADING
class Calculator {

    // Adding two integers
    int add(int a, int b) {
        return a + b;
    }

    // Adding three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Adding two decimal numbers
    double add(double a, double b) {
        return a + b;
    }
}

// METHOD OVERRIDING
class Payment {

    void calculatePay() {
        System.out.println("Calculating employee salary");
    }
}

class FullTimeEmployee extends Payment {

    @Override
    void calculatePay() {
        System.out.println("Full Time Salary: 50000");
    }
}

class PartTimeEmployee extends Payment {

    @Override
    void calculatePay() {
        System.out.println("Part Time Salary: 20000");
    }
}

public class Practical4 {
    public static void main(String[] args) {

        // Method Overloading
        System.out.println("METHOD OVERLOADING");

        Calculator c = new Calculator();

        System.out.println("Sum of two numbers: " +
                c.add(10, 20));

        System.out.println("Sum of three numbers: " +
                c.add(10, 20, 30));

        System.out.println("Sum of decimal numbers: " +
                c.add(5.5, 4.5));

        // Method Overriding
        System.out.println("\nMETHOD OVERRIDING");

        Payment p;

        p = new FullTimeEmployee();
        p.calculatePay();

        p = new PartTimeEmployee();
        p.calculatePay();
    }
}
