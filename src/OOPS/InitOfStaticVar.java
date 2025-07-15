package OOPS;

public class InitOfStaticVar {

    // Static variable 'a' is initialized directly
    static int a = 4;

    // Static variable 'b' will be initialized inside the static block
    static int b;

    // ✅ Static block: runs only once when the class is loaded
    static {
        System.out.println("I am in static block");  // Executes first time class is used
        b = a * 5;  // Initializes b = 4 * 5 = 20
    }

    public static void main(String[] args) {
        // First object creation — but has no effect on static variables
        InitOfStaticVar init1 = new InitOfStaticVar();

        // Print initial values of static variables
        System.out.println(InitOfStaticVar.a + "    " + InitOfStaticVar.b); // Output: 4    20

        // Modify static variable 'b'
        InitOfStaticVar.b += 3;  // b = 20 + 3 = 23

        // Print after modification
        System.out.println(InitOfStaticVar.a + "    " + InitOfStaticVar.b); // Output: 4    23

        // Second object creation — again, doesn't re-trigger static block
        InitOfStaticVar init2 = new InitOfStaticVar();

        // Print static variables again to show they remain shared and updated
        System.out.println(InitOfStaticVar.a + "    " + InitOfStaticVar.b); // Output: 4    23
    }
}
