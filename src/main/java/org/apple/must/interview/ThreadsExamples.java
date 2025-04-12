package org.apple.must.interview;

/**
 * Thread Class vs Runnable Interface
 *
 */

class A extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread A: " + i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread B: " + i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadsExamples {
    public static void main(String[] args) {
        A a = new A();               // Thread via extends
        B b = new B();               // Runnable
        /**
         *Dont Do: If you do b.run() directly — it runs in the main thread, not a separate one.
         * */
        Thread threadB = new Thread(b); // Create a thread for B

        a.start();        // Start thread A
        threadB.start();  // Start thread B properly


    }
}