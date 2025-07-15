package OOPS;

public class SingletonCall {
    public static void main(String[] args) {
        // Get Singleton instance
        Singleton obj = Singleton.getInstance();    // Creates instance
        Singleton obj1 = Singleton.getInstance();   // Reuses the same instance

        // ✅ Both references should point to the same object
        System.out.println(obj);   // Will use overridden toString()
        System.out.println(obj1);  // Should be identical to above

        // ✅ Check if both objects are actually the same
        if (obj == obj1) {
            System.out.println("Both references point to the same Singleton instance ✅");
        } else {
            System.out.println("Different instances ❌");
        }
    }
}
