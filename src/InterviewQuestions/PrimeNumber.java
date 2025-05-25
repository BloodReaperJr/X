package InterviewQuestions;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number");
        n = scn.nextInt();
        System.out.println(isPrime(n));
    }

    public static boolean isPrime(int n) {

        if(n<=-1) {
            return false;
        }

        for(int i = 2; i<n; i++) {
            if(n%i==0) {
                return false;
            }
        }

        return true;
    }
}
