package InterviewQuestions;

import java.util.Scanner;
import java.util.Stack;

public class ReverseNumberUsingStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scn.nextInt();
        while(num!=0){
            st.push(num%10);
            num = num/10;
        }

        int reverse = 0;
        int i = 1;

        while(!st.isEmpty()){
            reverse = reverse + (st.peek()*i);
            st.pop();
            i = i*10;
        }

        System.out.println(reverse);
    }
}
