package InterviewQuestions;

public class SecondSmallest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SecondSmallest.diddy();

    }

    public static void diddy() {
        int [] nums = {1,1,4,1,2,8,9,4};
        int s = Integer.MAX_VALUE;
        int ss = Integer.MAX_VALUE;
        for(int i = 0; i<nums.length;i++) {
            if(nums[i]<s) {
                s=ss;
                s=nums[i];
            }else if(nums[i]<ss && nums[i]!=s) {
                ss = nums[i];
            }
        }
        System.out.println(ss);
    }
}
