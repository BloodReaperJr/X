package InterviewQuestions;
import java.util.HashMap;
import java.util.Set;

public class DuplicatesString {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        duplicate("AACBBGGTTAANJ");

    }

    public static void duplicate(String inputString) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] arr = inputString.toCharArray();

        for(char c:arr) {
            if(map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            }else {
                map.put(c, 1);
            }
        }

        Set<Character> keys = map.keySet();
        for(char c:keys) {
            if(map.get(c)>1) {
                System.out.println(c+" --> "+map.get(c));
            }
        }
    }

}
