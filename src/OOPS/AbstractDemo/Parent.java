package OOPS.AbstractDemo;

// Abstract class: cannot be instantiated directly.
// Meant to provide a base for subclasses with some methods defined and some abstract (to be implemented by children).
public abstract class Parent {
    int age;

    // Constructor for the abstract class.
    // Even though we cannot instantiate abstract classes, constructors are still used during subclass object creation.
    Parent(int age){
        this.age = age;
    }

    // Abstract method: must be implemented by any non-abstract subclass.
    abstract void career();

    // Another abstract method: forcing child classes to define their own version.
    abstract void partner();

    // Static method in abstract class: can be called without object creation.
    // Cannot be overridden in subclasses.
    static void hello(){
        System.out.println("Hey!");
    }

    // Concrete method: can be inherited by subclasses as-is.
    void normal(){
        System.out.println("I am Normal Method");
    }
}
