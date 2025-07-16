package OOPS.Polymorphism;

public class DynamicPolymorphism {
    public static void main(String[] args) {
        // ----------- Dynamic Polymorphism Demo -----------

        // Creating a reference of the parent class
        Shapes shape;

        // Assigning a child class object to the parent class reference
        shape = new Circle();

        // This will call the overridden method in Circle
        // Even though the reference is of type Shapes,
        // the actual object is Circle, so Circle's area() is executed.
        shape.area();

        // ----------- Why it's called Dynamic Polymorphism? -----------

        /*
         * Polymorphism means "many forms".
         * Dynamic (or runtime) polymorphism is achieved through method overriding.
         *
         * - The method that gets executed is determined at runtime,
         *   based on the actual object type (not reference type).
         * - This allows us to write flexible and reusable code using parent references.
         *
         * Here:
         *    Shapes shape = new Circle();       // Parent reference → child object
         *    shape.area();                      // Calls Circle's area() at runtime
         *
         * If Circle didn't override area(), the call would go to Shapes.area().
         */

        // ----------- One more example -----------
        shape = new Shapes();   // Reference and object both are of type Shapes
        shape.area();           // Calls Shapes.area()
    }
}
