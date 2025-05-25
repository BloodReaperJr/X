package InterviewQuestions;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int length;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the series length");
        length = scn.nextInt();

        int nums[] =  new int[length];
        System.out.println("Enter the first element");
        nums[0] = scn.nextInt();
        System.out.println("Enter the second element");
        nums[1] = scn.nextInt();

        for(int i = 2; i<nums.length; i++) {
            nums[i] = nums[i-1] + nums[i-2];
        }

        System.out.print("Fibonacci Series: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }

    }
}
