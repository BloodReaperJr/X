package OOPS.Inheritance;

// This class extends Box, meaning it inherits all fields and methods from Box
public class BoxVolume extends Box {
    double volume;

    // No-arg constructor: implicitly calls super(), which is Box()
    // So l, w, h get set to -1 in the parent constructor
    BoxVolume() {
        this.volume = volume; // This does nothing useful (volume remains 0.0)
    }

    BoxVolume(BoxVolume other){
        super(other);
        volume = other.volume;
    }

    // Constructor for a cube: passes 'side' to the parent Box constructor using super(side)
    BoxVolume(double side) {
        super(side); // Calls Box(double side)
        this.volume = side * side * side;
    }

    BoxVolume(double side,double volume){
        super(side);
        this.volume = volume;
    }


    // Constructor with all dimensions: uses super(l, h, w) to initialize the inherited fields
    BoxVolume(double l, double h, double w, double volume) {
        super(l, h, w); // Calls Box(double l, double h, double w)
        this.volume = volume;
    }
}
