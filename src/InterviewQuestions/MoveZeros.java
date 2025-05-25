package InterviewQuestions;

public class MoveZeros {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] nums = {1,1,1,0,0,0,1,1,0,0,01,1,1,0,1};
        int x = 0;
        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i]!=0) {
                nums[x] = nums[i];
                x++;
            }
        }
        while(x<nums.length) {
            nums[x]=0;
            x++;
        }

        for(int i = 0 ; i < nums.length ; i++) {
            System.out.print(nums[i]+"  ");
        }

    }

}
