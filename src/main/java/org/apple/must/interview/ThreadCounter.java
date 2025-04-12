package org.apple.must.interview;

import javax.sound.midi.Soundbank;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

class Counter{
     AtomicInteger x = new AtomicInteger(0);
}

class Counter2 {
    private int x;

    public synchronized int getX() {
        return x;
    }

    public synchronized void setX() {
         this.x++;
    }

}

public class ThreadCounter {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Counter2 c2 = new Counter2();

        ArrayList<Integer> map = new ArrayList<>();
        LinkedList<String> list = new LinkedList<>();
        HashSet<Integer> set = new HashSet<>();
        Deque<Integer> deque = new ArrayDeque<>();
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new PriorityQueue<>();


        Runnable t1 = () -> {
            for (int i = 0; i < 100; i++) {
                c.x.incrementAndGet();
                c2.setX();
            }
        };

        Runnable t2 = () -> {
            for (int i = 0; i < 100; i++) {
                c.x.incrementAndGet();
                c2.setX();
            }
        };
        int x = c.hashCode();
        System.out.println(x);

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);

        thread1.start();
        thread2.start();

        //if you dont use join, main thread will complete before thread1 and thread2 complete. It like main thread, t1 and t2 will join wait.
        thread1.join();
        thread2.join();

        System.out.println(c.x.intValue());
        System.out.println(c2.getX());
    }
}
