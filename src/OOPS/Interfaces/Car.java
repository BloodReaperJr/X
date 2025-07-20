package OOPS.Interfaces;

// Class representing a normal car that implements Brake, Engine, and Media interfaces
public class Car implements Brake, Engine, Media {

    // Implementation of the brake method from Brake interface
    @Override
    public void brake() {
        System.out.println("Normal car brake");
    }

    // Implementation of the start method from Engine and Media interfaces
    @Override
    public void start() {
        System.out.println("Normal car start");
    }

    // Implementation of the stop method from Engine and Media interfaces
    @Override
    public void stop() {
        System.out.println("Normal car stop");
    }

    // Implementation of the acc (accelerate) method from Engine interface
    @Override
    public void acc() {
        System.out.println("Normal car accelerate");
    }
}