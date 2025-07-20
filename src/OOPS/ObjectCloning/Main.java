package OOPS.ObjectCloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Creating a new Human object
        Human boy = new Human("Shubham", 24);

        // Creating a copy using copy constructor (manual method)
        // Not scalable when object has many fields or nested objects
        // Human twin = new Human(boy);

        // Creating a copy using clone() method (efficient and cleaner)
        Human twin = (Human) boy.clone();

        // Output: prints the values copied to the twin object
        System.out.println(twin.age + " " + twin.name);
    }
}
