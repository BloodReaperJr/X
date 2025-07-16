package OOPS.Abstraction;

public class Main {
    public static void main(String[] args) {

        // Vehicle reference pointing to a Car object
        Vehicle car = new Car();
        car.start();  // Calls Car's implementation
        car.fuel();   // Common method from base class

        System.out.println("----------------------");

        // Vehicle reference pointing to an ElectricScooter object
        Vehicle scooter = new ElectricScooter();
        scooter.start();  // Calls ElectricScooter's implementation
        scooter.fuel();   // Shared method again
    }
}
