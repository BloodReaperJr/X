package OOPS.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        // Using setter methods to assign values
        student.setName("Shubham");
        student.setAge(25);

        // Using getter methods to retrieve values
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());

        // Attempt to set invalid age (e.g., -5) will be ignored
        student.setAge(-5);
        System.out.println("After invalid age attempt: " + student.getAge()); // Still 25
    }
}
