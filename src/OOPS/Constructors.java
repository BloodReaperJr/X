package OOPS;

public class Constructors {
    public static void main(String[] args) {
        // Example where parameterized constructor is called
        student student1 = new student(2, "Shubham", 85);
        System.out.println("Roll No: " + student1.rollno);
        System.out.println("Name: " + student1.name);
        System.out.println("Marks: " + student1.marks);

        // Example where constructor receives another student object (copy constructor)
        student student2 = new student(student1);
        System.out.println("Roll No: " + student2.rollno);
        System.out.println("Name: " + student2.name);
        System.out.println("Marks: " + student2.marks);

        // Example where default constructor internally calls the parameterized constructor
        student student3 = new student();
        System.out.println("Roll No: " + student3.rollno);
        System.out.println("Name: " + student3.name);
        System.out.println("Marks: " + student3.marks);
    }
}

class student {
    int rollno;
    String name;
    float marks;

    // Parameterized constructor
    student(int roll, String naam, float mark) {
        rollno = roll;  // 'this' not required because parameter names are different from fields
        name = naam;
        marks = mark;
    }

    // Default constructor calling another constructor using 'this' (constructor chaining)
    student() {
        this(13, "Another Constructor", 99.9f);  // Calls the parameterized constructor
    }

    // Copy constructor: takes another student object and copies its values
    student(student other) {
        this.rollno = other.rollno;
        this.name = other.name;
        this.marks = other.marks;
    }
}
