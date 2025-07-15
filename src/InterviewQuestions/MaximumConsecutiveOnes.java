package InterviewQuestions;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int count = 0;
        int max  = 0;

        int[] arr = {1,1,1,0,0,1,1,0,0,1,1,1,1,0};
        for (int j : arr) {
            if (j == 1) {
                count++;
                max = Math.max(max, count);
            }else{
                count = 0;
            }
        }
        System.out.println(max);
    }
}
