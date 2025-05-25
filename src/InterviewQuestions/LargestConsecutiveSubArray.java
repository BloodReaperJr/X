package InterviewQuestions;

import java.util.Scanner;

public class LargestConsecutiveSubArray {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int count  = 0;
        int max = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter length of array");
        int length = scn.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter the array elements");
        for(int i = 0; i<arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        for(int i = 0; i<arr.length-1; i++) {
            if(arr[i]+1 == arr[i+1]) {
                count++;
            }else {
                count=0;
            }

            max = Math.max(max,count+1);
        }

        System.out.println("Maximum consecutive integers are: " + max);

    }

}
