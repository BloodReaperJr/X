package OOPS.Interfaces;

// Class representing a CD player that implements the Media interface
public class CDPlayer implements Media {

    // Implementation of the start method from Media interface
    @Override
    public void start() {
        System.out.println("Media start");
    }

    // Implementation of the stop method from Media interface
    @Override
    public void stop() {
        System.out.println("Media stop");
    }
}