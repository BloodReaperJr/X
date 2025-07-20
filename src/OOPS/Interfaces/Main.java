package OOPS.Interfaces;

// Main class to demonstrate the functionality of NiceCar and its components
public class Main {
    public static void main(String[] args) {
        // Create a NiceCar instance with a default PowerEngine
        NiceCar car = new NiceCar();

        // Start the car's engine
        car.start();

        // Start the car's media player
        car.startMusic();

        // Upgrade the car's engine to an ElectricEngine
        car.upgradeEngine();

        // Start the car's upgraded engine
        car.start();
    }
}