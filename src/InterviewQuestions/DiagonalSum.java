package InterviewQuestions;

public class DiagonalSum {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int pSum = 0;
        int sSum = 0;
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(i==j) {
                    pSum = pSum + matrix[i][j];
                }
                if(i+j==2) {
                    sSum = sSum + matrix[i][j];
                }
            }
        }
        System.out.println(pSum);
        System.out.println(sSum);

    }
}
