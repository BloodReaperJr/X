package OOPS.Abstraction;

/**
 * ElectricScooter is another type of vehicle.
 * It provides a different implementation for 'start'.
 */
public class ElectricScooter extends Vehicle {

    @Override
    public void start() {
        System.out.println("Electric Scooter starts with a power button.");
    }
}
