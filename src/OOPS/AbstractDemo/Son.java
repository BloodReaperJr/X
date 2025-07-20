package OOPS.AbstractDemo;

// 'Son' is a subclass of abstract class 'Parent'
// It must implement all abstract methods of the parent class.
public class Son extends Parent {

    // Constructor: calls Parent class constructor using 'super'
    Son(int age){
        super(age);
    }

    // Overriding abstract method 'career'
    @Override
    void career() {
        System.out.println("Son -> I'm going to be an Engineer");
    }

    // Overriding abstract method 'partner'
    @Override
    void partner() {
        System.out.println("Son -> I love a Girl");
    }
}
