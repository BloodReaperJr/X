package InterviewQuestions;

public class ReverseArray {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        char[] arr = {'a','n','a','y'};

        int l = 0;
        int h = arr.length - 1;

        while(l<h) {
            char temp = arr[l];
            arr[l] = arr[h];
            arr[h] = temp;
            l++;
            h--;
        }

        for (char c : arr) {
            System.out.print(c + " ");
        }


    }

}
