package InterviewQuestions;

public class Separate0s1s {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int nums[] = {1,1,0,1,0,0,0,1,1,0};
        seperate(nums);
        for (int num : nums) {
            System.out.print(num+" ");
        }


    }

    public static void seperate(int[] nums) {
        int l = 0;
        int r = nums.length-1;

        while(l<r) {
            while(nums[l]==0 && l<r) {
                l++;
            }
            while(nums[r]==1 && l<r) {
                r--;
            }

            if(l<r) {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
                r--;
            }
        }
    }

}
