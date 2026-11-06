
package javapracticals;

class Employee {

    String name;
    double salary;

    // Static variable
    static int count = 0;

    // Default constructor
    Employee() {
        this("Unknown", 0);
    }

    // Parameterized constructor
    Employee(String name, double salary) {

        this.name = name;
        this.salary = salary;

        count++;
    }

    // Display employee details
    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("-------------------");
    }

    // Static method
    static void displayCount() {
        System.out.println("Total Employees: " + count);
    }
}

public class Practical9 {

    public static void main(String[] args) {

        Employee e1 = new Employee();

        Employee e2 = new Employee("Aman", 30000);

        Employee e3 = new Employee("Riya", 40000);

        e1.display();
        e2.display();
        e3.display();

        Employee.displayCount();
    }
}