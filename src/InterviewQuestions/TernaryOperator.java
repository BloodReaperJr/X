package InterviewQuestions;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();

        boolean ans = (x%2==0) ? true:false;
        System.out.println(ans);
    }
}
