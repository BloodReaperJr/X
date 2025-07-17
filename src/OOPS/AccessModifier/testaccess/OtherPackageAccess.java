package OOPS.AccessModifier.testaccess;

import OOPS.AccessModifier.accessmodifiers.AccessDemo;
import OOPS.AccessModifier.accessmodifiers.ProtectedChild;

// This class tests access from a different package
public class OtherPackageAccess {
    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();

        System.out.println("Accessing from different package:");
        System.out.println("publicVar: " + obj.publicVar); // ✅ Allowed
        obj.publicMethod();                                // ✅ Allowed

        // The below are not allowed from a different package
        // System.out.println(obj.protectedVar);          // ❌ Not accessible
        // obj.protectedMethod();                         // ❌ Not accessible
        // System.out.println(obj.defaultVar);            // ❌ Not accessible
        // obj.defaultMethod();                           // ❌ Not accessible
        // System.out.println(obj.privateVar);            // ❌ Not accessible
        // obj.privateMethod();                           // ❌ Not accessible

        System.out.println("\nAccessing protected member via child class reference:");
        ProtectedChild child = new ProtectedChild();
        child.accessProtected(); // ✅ Allowed through child reference
    }
}
