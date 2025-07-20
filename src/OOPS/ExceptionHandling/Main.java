package OOPS.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 1;

        try {
            // try block contains code that might throw an exception
            divide(a, b);

            // calling custom validation logic that throws a user-defined exception
            validate(a, 0);
        }
        catch (ArithmeticException ae) {
            // This block catches arithmetic-specific exceptions like divide by zero
            // It MUST come before 'catch (Exception)' because it's more specific
            // If placed after, compiler will throw an error: "unreachable catch block"
            System.out.println("Arithmetic Exception caught: " + ae.getMessage());
        }
        catch (MyException me) {
            // This block catches custom checked exceptions defined by the user
            System.out.println("Custom Exception caught: " + me.getMessage());
        }
        catch (Exception e) {
            // This is a general exception handler (catches all types of exceptions)
            // If written before specific exceptions like ArithmeticException,
            // it would catch them too, making the specific catch unreachable
            System.out.println("General Exception caught: " + e.getMessage());
        }
        finally {
            // finally block is always executed whether exception occurs or not
            System.out.println("This will always run");
        }
    }

    static int divide(int a, int b) throws ArithmeticException {
        // throws declares that this method might throw an ArithmeticException
        if (b == 0) {
            // Explicitly throwing an exception with a custom message
            throw new ArithmeticException("Please do not divide by zero");
        }
        return a / b;
    }

    static void validate(int a, int b) throws MyException {
        // this method demonstrates throwing a user-defined exception
        if (b == 0) {
            // throwing your custom exception with a descriptive message
            throw new MyException("Custom Error: Division by zero is not allowed!");
        }
        System.out.println("Validation passed: " + a + " / " + b);
    }
}
