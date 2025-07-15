package OOPS.Inheritance;

public class Main {
    public static void main(String[] args) {

        // Creating an object of BoxVolume with dimensions
        BoxVolume boxParent = new BoxVolume(4, 5, 7,6); // Uses constructor with 3 parameters

        // Inherited fields from Box (parent)
        System.out.println("Length: " + boxParent.l); // Inherited from Box
        System.out.println("Height: " + boxParent.h); // Inherited from Box
        System.out.println("Width: " + boxParent.w);  // Inherited from Box

        // Own field in BoxVolume (child)
        System.out.println("Volume: " + boxParent.volume); // Defined in BoxVolume

        // Verifying method inheritance
        boxParent.information(); // Method inherited from Box

        // ----------------------------------------------
        // Creating another object using no-arg constructor
        BoxVolume boxVolume = new BoxVolume(); // Calls BoxVolume(), which calls Box()

        // Default values inherited from Box's no-arg constructor
        System.out.println("Default volume: " + boxVolume.volume); // 0.0 (uninitialized properly)
        System.out.println("Default height (inherited): " + boxVolume.h); // -1

        // ❌ Invalid - cannot assign parent to child
        // BoxVolume invalid = new Box(1, 2, 3); // Compile-time error: incompatible types

        // Uncommenting the above line will result in a compilation error:
        // "incompatible types: Box cannot be converted to BoxVolume"

        BoxPrice boxPrice = new BoxPrice(3,20,200);


    }
}
