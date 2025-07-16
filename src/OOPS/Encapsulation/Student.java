package OOPS.Encapsulation;

/**
 * This class demonstrates Encapsulation in Java.
 * We hide the internal state (variables) of the class and provide
 * public methods to access and modify that state.
 */
public class Student {

    // Private fields — cannot be accessed directly from outside this class
    private String name;
    private int age;

    // Public getter method for 'name'
    public String getName() {
        return name;
    }

    // Public setter method for 'name'
    public void setName(String name) {
        // Adding basic validation
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    // Public getter method for 'age'
    public int getAge() {
        return age;
    }

    // Public setter method for 'age'
    public void setAge(int age) {
        // Validate that age is positive
        if (age > 0) {
            this.age = age;
        }
    }
}
