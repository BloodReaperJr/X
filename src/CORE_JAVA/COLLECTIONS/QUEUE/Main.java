package CORE_JAVA.COLLECTIONS.QUEUE;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//        Queue<Integer> q = new LinkedList<>();
//        q.offer(1);
//        q.offer(2);
//
//        System.out.println(q.peek());
//        System.out.println(q.poll());
//        System.out.println(q.peek());
//        System.out.println(q.isEmpty());

        Stack<Integer> x = new Stack<>();

        x.push(1);
        x.push(2);
        x.push(3);

        while(!x.isEmpty()){
            System.out.println(x.peek());
            x.pop();
        }

    }


}
