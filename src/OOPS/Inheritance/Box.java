package OOPS.Inheritance;

// This is the parent class which represents a basic box with dimensions.
public class Box {
    double l;
    double w;
    double h;

    // Default constructor initializes dimensions to -1
    Box() {
        this.h = -1;
        this.w = -1;
        this.l = -1;
    }

    // Cube constructor: initializes all dimensions to the same value
    Box(double side) {
        this.h = side;
        this.w = side;
        this.l = side;
    }

    // Constructor with all dimensions
    Box(double l, double h, double w) {
        this.h = h;
        this.l = l;
        this.w = w;
    }

    // Copy constructor: creates a new Box from another Box object
    Box(Box box) {
        this.h = box.h;
        this.l = box.l;
        this.w = box.w;
    }


    // Method to print a simple message
    public void information() {
        System.out.println("Running the box");
    }
}
