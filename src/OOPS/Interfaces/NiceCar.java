package OOPS.Interfaces;

// Class representing a "NiceCar" with customizable engine and media player
public class NiceCar {
    // Engine instance to represent the car's engine
    private Engine engine;

    // Media instance to represent the car's media player
    private Media player = new CDPlayer();

    // Default constructor initializing the car with a PowerEngine
    public NiceCar() {
        engine = new PowerEngine();
    }

    // Constructor allowing the car to be initialized with a custom engine
    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    // Method to start the car's engine
    public void start() {
        engine.start();
    }

    // Method to stop the car's engine
    public void stop() {
        engine.stop();
    }

    // Method to start the car's media player
    public void startMusic() {
        player.start();
    }

    // Method to stop the car's media player
    public void stopMusic() {
        player.stop();
    }

    // Method to upgrade the car's engine to an ElectricEngine
    public void upgradeEngine() {
        this.engine = new ElectricEngine();
    }
}