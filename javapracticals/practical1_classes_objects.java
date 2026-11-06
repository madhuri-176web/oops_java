
package javapracticals;

class Student {

    int rollNo;
    String name;
    int m1, m2, m3;

    Student(int r, String n, int a, int b, int c) {
        rollNo = r;
        name = n;
        m1 = a;
        m2 = b;
        m3 = c;
    }

    int totalMarks() {
        return m1 + m2 + m3;
    }

    double percentage() {
        return totalMarks() / 3.0;
    }

    void display() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + totalMarks());
        System.out.println("Percentage: " + percentage() + "%");
        System.out.println("----------------------");
    }
}

public class practical1_classes_objects {

    public static void main(String[] args) {

        Student s1 = new Student(1, "Kamini", 80, 85, 90);
        Student s2 = new Student(2, "Riya", 75, 80, 85);
        Student s3 = new Student(3, "Nancy", 90, 85, 95);

        s1.display();
        s2.display();
        s3.display();
    }
}

