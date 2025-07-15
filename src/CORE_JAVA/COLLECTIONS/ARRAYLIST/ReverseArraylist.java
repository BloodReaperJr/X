package CORE_JAVA.COLLECTIONS.ARRAYLIST;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArraylist {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Samsung");
        list.add("Nokia");
        list.add("Motorola");

        System.out.println(list);

        Collections.reverse(list);

        System.out.println(list);
    }
}
