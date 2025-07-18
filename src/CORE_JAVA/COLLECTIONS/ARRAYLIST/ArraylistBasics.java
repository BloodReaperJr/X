package CORE_JAVA.COLLECTIONS.ARRAYLIST;

import java.util.ArrayList;
import java.util.List;

public class ArraylistBasics {
    public static void main(String[] args) {
        List<Integer> alist = new ArrayList<>();
        alist.add(1);
        alist.add(100);
        alist.add(1000);

        Integer [] arr = alist.toArray(new Integer[0]);

        System.out.println("Element that got replaced = " + alist.set(1,200));

        List<Integer> alist2 = new ArrayList<>(alist);
        //List<Integer> alist2 = new ArrayList<>();
        alist2.add(101);
        alist2.add(444);


        //alist2.addAll(alist);

        System.out.println(alist);
        System.out.println(alist2);
    }
}
