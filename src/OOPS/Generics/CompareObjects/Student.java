package OOPS.Generics.CompareObjects;

public class Student implements Comparable<Student> {
    int marks;
    int rollno;

    public Student(int rollno, int marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        System.out.println("Comparing: RollNo " + this.rollno + " (Marks: " + this.marks +
                ") with RollNo " + o.rollno + " (Marks: " + o.marks + ")");
        return this.marks - o.marks; // ascending order
    }
}
