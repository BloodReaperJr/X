package InterviewQuestions;

public class Practice {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, -5, 6},
            {7, 8, 9}
        };
        int mincolumn = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i< arr.length;i++ ){
            for (int j = 0; j<arr[i].length; j++){
                if(arr[i][j]<min) {
                    min = arr[i][j];
                    mincolumn = j;
                }
            }
        }
        int k = 0;
        while (k < arr.length){
            if(arr[k][mincolumn]>max){
                max = arr[k][mincolumn];
            }
            k++;
        }
        System.out.println(min);
        System.out.println(max);
    }
}
