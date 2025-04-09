package org.apple.must;

public class ThreadsExamples {

    class Printer{
        private boolean isOdd = true;

        public synchronized void printOdd() throws InterruptedException {
            while(isOdd) {
                wait();
            }

        }

    }
}
