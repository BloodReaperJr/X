package InterviewQuestions;

public class SeperateEvenOdd {
    public static void main(String[] args) {
        int nums[] = {2,1,3,4,5,2,1,4,1,3,2};
        seperate(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void seperate(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            while (nums[l] % 2 == 0 && l < r) {
                l++;
            }
            while (nums[r] % 2 == 1 && l < r) {
                r--;
            }

            if (l < r) {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
                r--;
            }
        }
    }
}
