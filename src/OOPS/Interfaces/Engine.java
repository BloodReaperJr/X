package OOPS.Interfaces;

// Interface representing the engine functionality
public interface Engine {
    // Static final variable representing the price of the engine
    static final int price = 70000;

    // Method to start the engine
    void start();

    // Method to stop the engine
    void stop();

    // Method to accelerate the engine
    void acc();
}