package OOPS.Interfaces;

// Class representing a power engine that implements the Engine interface
public class PowerEngine implements Engine {

    // Implementation of the start method from Engine interface
    @Override
    public void start() {
        System.out.println("Power Engine start");
    }

    // Implementation of the stop method from Engine interface
    @Override
    public void stop() {
        System.out.println("Power Engine stop");
    }

    // Implementation of the acc (accelerate) method from Engine interface
    @Override
    public void acc() {
        System.out.println("Power Engine accelerate");
    }
}