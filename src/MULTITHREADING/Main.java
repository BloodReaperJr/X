package MULTITHREADING;


import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        Print task = new Print();
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
    }
}

class Print implements Runnable{
    private AtomicInteger x = new AtomicInteger(0);

    @Override
    public void run() {
        for(int i =0; i<100; i++){
            x.incrementAndGet();
            System.out.println(this);
            System.out.println(Thread.currentThread().getName() + "counter" + x);
        }


    }
}