package org.apple.leetcode;

public class Fibonacci {
    public static void main(String[] args) {
        int first = 0, second = 1;

        // Print the initial terms
        System.out.print(first + ", " + second);

        // Generate and print the next 50 terms
        for (int i = 0; i < 50; i++) {
            int next = first + second;
            System.out.print(", " + next);
            first = second;
            second = next;
        }

        System.out.println(); // Adds a newline at the end for better formatting
    }
}

