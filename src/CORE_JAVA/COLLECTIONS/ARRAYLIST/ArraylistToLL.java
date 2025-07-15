package CORE_JAVA.COLLECTIONS.ARRAYLIST;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArraylistToLL {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Apple");
        ll.add("Banana");
        ll.add("Mango");
        ll.add("Strawberry");

        //LinkedList to Arraylist
        ArrayList<String> arrlist = new ArrayList<>(ll);
        System.out.println(arrlist);

        //Arraylist to LinkedList
        LinkedList<String> list = new LinkedList<>(arrlist);
        System.out.println(list);
    }
}
