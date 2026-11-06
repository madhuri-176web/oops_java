
package javapracticals;

class ComplexNumber {

    int real;
    int imaginary;

    // Constructor
    ComplexNumber(int r, int i) {
        real = r;
        imaginary = i;
    }

    // Addition of two complex numbers
    ComplexNumber add(ComplexNumber c) {

        int newReal = real + c.real;
        int newImaginary = imaginary + c.imaginary;

        return new ComplexNumber(newReal, newImaginary);
    }

    // Display complex number
    void display() {

        if (imaginary >= 0) {
            System.out.println(real + " + " + imaginary + "i");
        } else {
            System.out.println(real + " - " + (-imaginary) + "i");
        }
    }
}

public class Practical5 {
    public static void main(String[] args) {

        ComplexNumber c1 = new ComplexNumber(5, 3);
        ComplexNumber c2 = new ComplexNumber(2, 4);

        System.out.print("First Complex Number: ");
        c1.display();

        System.out.print("Second Complex Number: ");
        c2.display();

        ComplexNumber result = c1.add(c2);

        System.out.print("Sum of Complex Numbers: ");
        result.display();
    }
}
