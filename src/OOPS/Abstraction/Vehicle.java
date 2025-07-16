package OOPS.Abstraction;

/**
 * This abstract class defines the template for all types of vehicles.
 * It hides implementation details of how vehicles start.
 */
public abstract class Vehicle {

    // Abstract method: No implementation here, must be implemented by subclasses
    public abstract void start();

    // Concrete method: Same for all vehicles
    public void fuel() {
        System.out.println("Filling up fuel...");
    }
}
