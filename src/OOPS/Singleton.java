package OOPS;

public class Singleton {

    // ✅ Step 1: Private constructor to prevent external instantiation
    private Singleton() {
        // Constructor is private so that no other class can create an object of Singleton directly
    }

    // ✅ Step 2: Static variable to hold the one and only instance of the class
    public static Singleton instance;

    // ✅ Step 3: Public static method to provide access to the instance (Global access point)
    public static Singleton getInstance() {
        // Lazy initialization — object is created only when needed
        if (instance == null) {
            instance = new Singleton();  // Create new instance if it doesn't exist
        }
        return instance;  // Return the existing or newly created instance
    }
}
