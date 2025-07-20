package OOPS.ObjectCloning;

// Class for Address
class Address {
    String city;

    public Address(String city) {
        this.city = city;
    }

    // For deep copy
    public Address(Address other) {
        this.city = other.city;
    }
}

// Person class
class Person implements Cloneable {
    String name;
    Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // SHALLOW COPY: default clone implementation
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Only top-level object is copied, not nested objects
    }

    // DEEP COPY: manually clone nested object as well
    protected Person deepClone() {
        return new Person(this.name, new Address(this.address)); // new Address is a deep copy
    }
}

// Main class
public class DeepShallowCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address addr = new Address("Mumbai");
        Person p1 = new Person("Shubham", addr);

        // Shallow copy
        Person shallowCopy = (Person) p1.clone();

        // Deep copy
        Person deepCopy = p1.deepClone();

        System.out.println("Before change:");
        System.out.println("Original: " + p1.address.city);
        System.out.println("Shallow: " + shallowCopy.address.city);
        System.out.println("Deep: " + deepCopy.address.city);

        // Modify address of original
        p1.address.city = "Pune";

        System.out.println("\nAfter changing original address:");
        System.out.println("Original: " + p1.address.city);
        System.out.println("Shallow: " + shallowCopy.address.city); // Affected
        System.out.println("Deep: " + deepCopy.address.city);       // Not affected
    }
}
