package InterviewQuestions;

public class TransposeMatrix {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] ans = new int[3][3];
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                ans[j][i]=matrix[i][j];
            }
        }

        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }

    }

}
