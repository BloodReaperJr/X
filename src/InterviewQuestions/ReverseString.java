package InterviewQuestions;

public class ReverseString {
    public static void main(String[] args) {
            String string = "Shubham";
            char[] chars = string.toCharArray();
            int i = 0;
            int j = chars.length - 1;

            while(i<j){
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
        }
            chars.toString();
        System.out.println(chars);


    }
}
