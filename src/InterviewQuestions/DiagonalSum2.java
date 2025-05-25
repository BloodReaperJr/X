package InterviewQuestions;

public class DiagonalSum2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int sum = 0;
        int[][] matrix = {
                { 6, 7, 3, 4},
                { 8, 9, 2, 1},
                { 1, 2, 9, 6},
                { 6, 5, 7, 2}
        };
        for(int g=0;g<4;g++) {
            for(int j=g,i=0;j<4;i++,j++) {
                sum = sum + matrix[i][j];
            }
            System.out.println(sum);
            sum = 0;
        }
        for(int g = 1;g<4;g++) {
            for(int i =g,j=0;i<4;i++,j++) {
                sum = sum + matrix[i][j];
            }
            System.out.println(sum);
            sum = 0;
        }

    }
}
