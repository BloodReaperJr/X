package OOPS;

public class InnerClass {

    // ✅ Static nested (inner) class — associated with Outer class, not with its objects
    static class Test {
        String name;  // Instance variable to store name

        // Constructor to initialize the 'name' variable
        Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {

        // ✅ Creating instances of static inner class directly using OuterClass.Test
        // Since 'Test' is static, no need to create an object of InnerClass
        Test test1 = new Test("Shubham");
        Test test2 = new Test("Yash");

        // Printing the 'name' field of each object
        System.out.println(test1.name);  // Output: Shubham
        System.out.println(test2.name);  // Output: Yash
    }
}
