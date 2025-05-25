package InterviewQuestions;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int ans = 0;
        int num;
        System.out.println("Enter the number");
        Scanner scn = new Scanner(System.in);
        num = scn.nextInt();

        while(num!=0) {
            int rem = num%10;
            ans = ans + rem;
            num = num/10;
        }

        System.out.println("Sum of digits = "+ ans);
    }

}
