package OOPS.Polymorphism;

/**
 * Demonstrates method overriding by overriding the toString() method
 * inherited from the Object class.
 */
public class ToStringOverride {

    int id;
    String name;

    //Constructor
    public ToStringOverride(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Overriding the toString() method from Object class
    @Override
    public String toString() {
        return "ObjectPrint{id=" + id + ", name='" + name + "'}";
    }

    public static void main(String[] args) {
        // Creating an object of ObjectPrint
        ToStringOverride obj = new ToStringOverride(101, "Shubham");

        // Printing the object reference
        // By default, it would print something like: OOPS.Polymorphism.ObjectPrint@1a2b3c
        // But since we overrode toString(), it now prints meaningful data.
        System.out.println(obj);

        // Output:
        // ObjectPrint{id=101, name='Shubham'}
    }
}
