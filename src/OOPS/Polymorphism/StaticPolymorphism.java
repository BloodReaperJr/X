package OOPS.Polymorphism;

/**
 * This class demonstrates Static Polymorphism in Java,
 * also known as Method Overloading.
 *
 * Static polymorphism is resolved at compile-time.
 * It allows multiple methods with the same name but different:
 *  - number of parameters
 *  - type of parameters
 *  - order of parameters
 */
public class StaticPolymorphism {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method to add one integer and one double
    public double add(int a, double b) {
        return a + b;
    }

    // Method to add one double and one integer (different order)
    public double add(double a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        StaticPolymorphism calculator = new StaticPolymorphism();

        // Compile-time decision based on argument types
        System.out.println("add(int, int): " + calculator.add(10, 20));
        System.out.println("add(int, int, int): " + calculator.add(1, 2, 3));
        System.out.println("add(double, double): " + calculator.add(5.5, 4.5));
        System.out.println("add(int, double): " + calculator.add(3, 2.5));
        System.out.println("add(double, int): " + calculator.add(7.2, 3));
    }
}
