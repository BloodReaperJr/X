package InterviewQuestions;

public class SecondLargest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int l = -1;
        int sl = -1;

        int[] nums = {1,2,4,2,1,7,8,11,9,5,4,10,15};

        for(int  i = 0; i<nums.length; i++) {
            if(nums[i]>l) {
                sl=l;
                l=nums[i];
            }else if(nums[i]>sl && nums[i]!=l){
                sl = nums[i];
            }
        }

        System.out.println("Second largest in array is: "+sl);
    }

}
