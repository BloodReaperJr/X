package OOPS.AbstractDemo;

// 'Daughter' is another subclass of abstract class 'Parent'
// Also must implement all abstract methods.
public class Daughter extends Parent {

    // Constructor: calls the superclass constructor using 'super'
    Daughter(int age){
        super(age);
    }

    // Overriding 'career' method
    @Override
    void career() {
        System.out.println("Daughter -> I'm going to be a Scientist");
    }

    // Overriding 'partner' method
    @Override
    void partner() {
        System.out.println("Daughter -> I love a Boy");
    }
}
