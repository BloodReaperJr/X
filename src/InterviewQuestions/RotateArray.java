package InterviewQuestions;

public class RotateArray {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int k = 3;
        k=k%nums.length;
        rotate(nums,0,nums.length-1);
        rotate(nums,0,k-1);
        rotate(nums,k,nums.length-1);
        for(int x = 0; x < nums.length; x++) {
            System.out.print(nums[x]+" ");
        }

    }

    public static void rotate(int[] nums,int i, int j) {
        while(i<j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

}
