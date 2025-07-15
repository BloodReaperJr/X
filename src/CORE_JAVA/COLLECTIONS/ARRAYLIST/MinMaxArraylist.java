package CORE_JAVA.COLLECTIONS.ARRAYLIST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMaxArraylist {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(90);
        list.add(20);
        list.add(70);
        list.add(40);
        list.add(50);

//        System.out.println(list);
//        list.sort(null);
//        System.out.println(list);
//        System.out.println(list.get(0));
//        System.out.println(list.get(list.size()-1));

        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));


    }
}
