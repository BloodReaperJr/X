package InterviewQuestions;

public class XPattern {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        for(int i = 0; i<5;i++) {
            for(int j =0; j<5;j++) {
                if(i<=j && (i+j)<=4)  {
                    System.out.print("*");
                    System.out.print("\t");
                }else if(i>2 && (i+j)<=2*i && (i+j)>=4){
                    System.out.print("*");
                    System.out.print("\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println("");

        }
    }

}
