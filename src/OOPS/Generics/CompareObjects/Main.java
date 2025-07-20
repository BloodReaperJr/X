package OOPS.Generics.CompareObjects;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create multiple Student objects with different marks
        Student yash = new Student(3, 67);
        Student aman = new Student(7, 45);
        Student sneha = new Student(2, 89);
        Student rohit = new Student(5, 30);
        Student priya = new Student(8, 67);
        Student varun = new Student(6, 55);

        // Create an array of Student objects
        Student[] students = {yash, aman, sneha, rohit, priya, varun};

        // Print original array (unsorted)
        System.out.println("Before sorting:");
        for (Student s : students) {
            System.out.println("Roll No: " + s.rollno + ", Marks: " + s.marks);
        }

        // Sort the array using Arrays.sort()
        // This uses the compareTo() method defined in Student class
        Arrays.sort(students);

        // Print sorted array (by marks in ascending order)
        System.out.println("\nAfter sorting (by marks):");
        for (Student s : students) {
            System.out.println("Roll No: " + s.rollno + ", Marks: " + s.marks);
        }
    }
}
