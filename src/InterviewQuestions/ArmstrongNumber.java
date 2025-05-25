package InterviewQuestions;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int num;
        System.out.println("Enter the number to check");
        num = scn.nextInt();
        int actualnum = num;
        double result = 0;

        while(actualnum!=0) {
            int n = actualnum%10;
            result = result + Math.pow(n,3);
            actualnum = actualnum/10;
        }

        if(result==num) {
            System.out.println(num + " is an armstrong number");
        }else {
            System.out.println(num + " is not an armstrong number");
        }

    }

}
