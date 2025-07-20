package OOPS.AbstractDemo;

public class Main {
    public static void main(String[] args) {

        // Creating object of Son (calls Parent's constructor internally)
        Son son = new Son(20);
        son.career();       // Calls overridden method from Son
        son.normal();       // Calls inherited concrete method from Parent

        // Creating object of Daughter (calls Parent's constructor internally)
        Daughter daughter = new Daughter(30);
        daughter.career();  // Calls overridden method from Daughter

        // Static method call using abstract class name
        // Can be called without creating an object
        Parent.hello();
    }
}
