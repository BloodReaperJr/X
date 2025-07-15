package CORE_JAVA.COLLECTIONS.ARRAYLIST;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CollectionsContains {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Shubham");
        list.add("Yash");
        list.add("Anay");

//        System.out.println(list.contains("Anay"));
//        System.out.println(list.contains("yash"));

        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Arsenal");
        map.put(2,"Madrid");
        map.put(3,"Barcelona");

        System.out.println(map.containsKey(2));
        System.out.println(map.containsKey(4));
        System.out.println(map.containsValue("Arsenal"));
        System.out.println(map.containsValue("Mancity"));
    }
}
