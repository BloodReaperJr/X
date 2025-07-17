package OOPS.AccessModifier.accessmodifiers;

public class SamePackageAccess {
    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();

        System.out.println("Accessing from Same Package:");

        // ✅ Public members are accessible
        System.out.println("publicVar: " + obj.publicVar);
        obj.publicMethod();

        // ✅ Protected members are accessible within same package
        System.out.println("protectedVar: " + obj.protectedVar);
        obj.protectedMethod();

        // ✅ Default (no modifier) members are accessible within same package
        System.out.println("defaultVar: " + obj.defaultVar);
        obj.defaultMethod();

        // ❌ Private members are NOT accessible outside the class
        // System.out.println("privateVar: " + obj.privateVar);     // Compilation error
        // obj.privateMethod();                                    // Compilation error

        System.out.println("Note: Private members are NOT accessible even within the same package.");
    }
}
