package OOPS.AccessModifier.accessmodifiers;

// Demonstrates accessing protected members via inheritance
public class ProtectedChild extends AccessDemo {

    public void accessProtected() {
        System.out.println("Inside ProtectedChild (Same Package):");
        // Accessing protected members using child reference
        System.out.println("protectedVar: " + protectedVar);
        protectedMethod();

        // Accessing protected members using parent class reference - NOT ALLOWED
        AccessDemo parentRef = new AccessDemo();
        // System.out.println(parentRef.protectedVar); // ❌ Compilation error
        // parentRef.protectedMethod();               // ❌ Compilation error

        System.out.println("Note: Protected members can only be accessed through child reference, not parent reference.");
    }
}
