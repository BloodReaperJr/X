package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class StreamsPractice {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<String> list = new ArrayList();
        list.add("Anay");
        list.add("Shubham");
        list.add("Balaji");
        list.add("Yash");
        list.add("Abhi");
        list.add("Bhim");

        List<String> list1 = new ArrayList();
        list1.add("Google");
        list1.add("Microsoft");
        list1.add("Netflix");
        list1.add("Shubham");
//      int count = 0;
//		for(String a: list) {
//			if(a.startsWith("A")) count++;
//		}
//		System.out.println(count);

        //System.out.println(list.stream().filter(x->x.startsWith("A")).count());
        //list.stream().filter(x->x.length()>4).forEach(x->System.out.println(x));
        //list.stream().filter(x->x.length()>4).limit(1).forEach(x->System.out.println(x));
        //list.stream().filter(x->x.endsWith("i")).map(x->x.toUpperCase()).forEach(x->System.out.println(x));
        //list.stream().filter(x->x.startsWith("A")).map(x->x.toUpperCase()).sorted().forEach(x->System.out.println(x));
        //Stream.concat(list.stream(), list1.stream()).sorted().forEach(x->System.out.println(x));
        boolean flag = Stream.concat(list.stream(), list1.stream()).anyMatch(x->x.equalsIgnoreCase("google"));
        System.out.println(flag);
        List<String> output = Stream.concat(list.stream(), list1.stream()).map(x->x.toUpperCase()).sorted().collect(Collectors.toList());

    }

}
