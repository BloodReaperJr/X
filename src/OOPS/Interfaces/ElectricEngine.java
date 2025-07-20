package OOPS.Interfaces;

// Class representing an electric engine that implements the Engine interface
public class ElectricEngine implements Engine {

    // Implementation of the start method from Engine interface
    @Override
    public void start() {
        System.out.println("Electric Engine start");
    }

    // Implementation of the stop method from Engine interface
    @Override
    public void stop() {
        System.out.println("Electric Engine stop");
    }

    // Implementation of the acc (accelerate) method from Engine interface
    @Override
    public void acc() {
        System.out.println("Electric Engine accelerate");
    }
}