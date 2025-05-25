package InterviewQuestions;

import java.util.Scanner;

public class Swap2Numbers {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1 = scn.nextInt();
        System.out.println("Enter Second Number");
        int num2 = scn.nextInt();

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }

}
