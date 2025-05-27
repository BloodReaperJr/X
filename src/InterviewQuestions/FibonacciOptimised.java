package InterviewQuestions;

import java.util.Scanner;

public class FibonacciOptimised {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the series length (minimum 2): ");
        int length = scn.nextInt();

        if (length < 2) {
            System.out.println("Length must be at least 2.");
            return;
        }

        System.out.print("Enter the first element: ");
        int first = scn.nextInt();
        System.out.print("Enter the second element: ");
        int second = scn.nextInt();

        System.out.print("Fibonacci Series: ");
        System.out.print(first + " " + second + " ");

        for (int i = 2; i < length; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }

        scn.close();
    }
    }

