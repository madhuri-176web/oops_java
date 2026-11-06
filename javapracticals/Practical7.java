
package javapracticals;

class Demo {

    Demo() {
        System.out.println("Object is created");
    }

    void show() {
        System.out.println("Object is being used");
    }
}

public class Practical7 {

    public static void main(String[] args) {

        // Creating object
        Demo d = new Demo();

        // Using object
        d.show();

        // Removing reference
        d = null;

        System.out.println("Object reference removed");

        // Requesting garbage collection
        System.gc();

        System.out.println("Garbage collection requested");
    }
}
