package OOPS;

public class StaticNonStaticKeyword {
    public static void main(String[] args) {
        // Creating two Human objects
        Human human1 = new Human(24, "Shubham", 30000, false);
        Human human2 = new Human(30, "Yash", 20000, true);

        // Printing static variable using object references (allowed, but not preferred)
        System.out.println(human1.population); // Output: 2
        System.out.println(human2.population); // Output: 2

        // ✅ Preferred way: access static variable using class name
        System.out.println(Human.population);  // Output: 2 — recommended for clarity

        // ✅ Calling a static method directly (belongs to the class)
        greeting();  // Can be called without creating an object

        // ✅ Calling a non-static method — requires object creation
        StaticNonStaticKeyword obj = new StaticNonStaticKeyword(); // Creating object of current class
        obj.personalGreeting();  // Calling non-static method using object

    }

    // Static method: belongs to the class, can be called without object
    static void greeting() {
        System.out.println("Hi! Welcome");
    }

    // Non-static method: belongs to the object
    // Must be called using an instance of the class
    void personalGreeting() {
        System.out.println("Hello! This is a non-static personal greeting.");
    }
}

class Human {
    // Instance (non-static) variables — unique to each object
    int age;
    String name;
    long salary;
    boolean marital_status;

    // Static variable — shared across all instances
    static long population;

    // Constructor — increments static population count
    Human(int age, String name, long salary, boolean marital_status) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.marital_status = marital_status;

        // Increment shared static field
        Human.population += 1;
    }
}
