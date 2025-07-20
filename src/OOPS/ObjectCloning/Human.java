package OOPS.ObjectCloning;

// 'Cloneable' is a marker interface that allows use of Object.clone() method
public class Human implements Cloneable {
    int age;
    String name;

    // Parameterized constructor to initialize the Human object
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor: creates a new object by copying values from another object
    public Human(Human other) {
        this.name = other.name;
        this.age = other.age;
    }

    // clone() method overridden from Object class
    // This performs a shallow copy of the object
    // Note: Object.clone() is protected, so it must be overridden as public
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // performs member-wise copy of fields
    }
}
