package InterviewQuestions;

import java.util.HashMap;

public class CountChar {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String inputString = "ShubhamKotgire";
        countChar(inputString);

    }

    public static void countChar(String inputString) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] arr = inputString.toCharArray();
        for(char c:arr) {
            if(map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }
        System.out.println(map);
    }

}
