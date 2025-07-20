package OOPS.Generics;

import java.util.ArrayList;
import java.util.function.Consumer; // Java's built-in functional interface for consuming values

public class LambdaFunctions {
    public static void main(String[] args) {
        // Creating a list of integers from 1 to 5
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i + 1); // adds 1, 2, 3, 4, 5
        }

        // ✅ Lambda Function: item -> System.out.println(item*2)
        // This defines how each element should be processed
        // It implements the Consumer<T> interface's accept() method
        Consumer<Integer> consumer = item -> System.out.println(item * 2);

        // Applies the lambda function to each item in the list
        // forEach takes a Consumer and applies it to each element
        list.forEach(consumer); // Prints 2, 4, 6, 8, 10

        // ✅ Lambda expressions for arithmetic operations using custom functional interface Operation
        Operation sum = (a, b) -> a + b;    // Lambda for addition
        Operation diff = (a, b) -> a - b;   // Lambda for subtraction
        Operation prod = (a, b) -> a * b;   // Lambda for multiplication

        // Creating an instance of LambdaFunctions to call the non-static 'operate' method
        LambdaFunctions myCalculator = new LambdaFunctions();

        // Calling operate method with different operations
        System.out.println(myCalculator.operate(5, 5, sum));   // Output: 10
        System.out.println(myCalculator.operate(6, 3, diff));  // Output: 3
        System.out.println(myCalculator.operate(5, 3, prod));  // Output: 15
    }

    /**
     * Takes two integers and an implementation of the Operation interface (like sum, diff, prod)
     * Returns the result of applying the given operation on the two integers
     */
    private int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }
}
// Functional interface for operations on two integers
// A functional interface has only one abstract method, making it usable with lambda expressions
interface Operation {
    int operation(int a, int b);
}
