package InterviewQuestions;

public class SquarePattern {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        for(int i = 0; i<4;i++) {
            for(int j =0; j<4;j++) {
                if(i==0 || i==3 || j==0 || j==3) {
                    System.out.print("*");
                    //		System.out.print("\t");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
