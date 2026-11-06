
package javapracticals;

// First interface
interface Printable {
    void print();
}

// Second interface
interface Scannable {
    void scan();
}

// Multiple Inheritance using interfaces
class AllInOnePrinter implements Printable, Scannable {

    public void print() {
        System.out.println("Printing document...");
    }

    public void scan() {
        System.out.println("Scanning document...");
    }
}

// Base class
class Machine {
    void powerOn() {
        System.out.println("Machine is switched ON");
    }
}

// Hybrid Inheritance
class SmartPrinter extends Machine
        implements Printable, Scannable {

    public void print() {
        System.out.println("Smart Printer is printing");
    }

    public void scan() {
        System.out.println("Smart Printer is scanning");
    }
}

public class Practical3 {
    public static void main(String[] args) {

        System.out.println("MULTIPLE INHERITANCE");

        AllInOnePrinter p = new AllInOnePrinter();
        p.print();
        p.scan();

        System.out.println("\nHYBRID INHERITANCE");

        SmartPrinter s = new SmartPrinter();
        s.powerOn();
        s.print();
        s.scan();
    }
}


