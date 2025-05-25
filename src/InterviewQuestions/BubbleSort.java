package InterviewQuestions;

public class BubbleSort {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] nums = {1,4,8,2,9,5};
        for(int i=0; i<nums.length-1;i++) {
            for(int j =0; j<nums.length-1-i;j++) {
                if(nums[j]>nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }


        for (int num : nums) {
            System.out.print(num + " ");
        }


    }
}
