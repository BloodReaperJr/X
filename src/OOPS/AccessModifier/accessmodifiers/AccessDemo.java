package OOPS.AccessModifier.accessmodifiers;

// This class demonstrates all access modifiers.
public class AccessDemo {
    public int publicVar = 1;
    protected int protectedVar = 2;
    int defaultVar = 3;            // package-private (no modifier)
    private int privateVar = 4;

    public void publicMethod() {
        System.out.println("Public Method");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

    void defaultMethod() {
        System.out.println("Default (Package-Private) Method");
    }

    private void privateMethod() {
        System.out.println("Private Method");
    }

    // A method to access all members within the same class
    public void accessWithinClass() {
        System.out.println("Inside AccessDemo:");
        System.out.println("publicVar: " + publicVar);
        System.out.println("protectedVar: " + protectedVar);
        System.out.println("defaultVar: " + defaultVar);
        System.out.println("privateVar: " + privateVar);
        publicMethod();
        protectedMethod();
        defaultMethod();
        privateMethod();
    }
}
