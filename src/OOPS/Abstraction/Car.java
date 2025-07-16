package OOPS.Abstraction;

/**
 * Car is a specific type of vehicle.
 * It provides implementation for the abstract 'start' method.
 */
public class Car extends Vehicle {

    @Override
    public void start() {
        System.out.println("Car starts with key ignition.");
    }
}
