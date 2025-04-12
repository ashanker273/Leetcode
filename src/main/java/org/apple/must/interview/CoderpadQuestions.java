package org.apple.must.interview;

public class CoderpadQuestions {
    public static void main(String[] args) {

        /**
         * Question: What is a NullPointerException in Java, and how do you prevent it? Write an example code snippet that could result in a NullPointerException and modify it to prevent the exception from occurring.
         *
         * Answer: A NullPointerException occurs when a variable that is expected to contain an object reference is null, and an operation is performed on that variable as if it contained a valid object reference. To prevent it, you can add a null check before performing any operations on the variable. Here’s an example code snippet:
         */
        String name = null;
        try {
            if (name != null) {
                System.out.println(name.length());
            }

        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("finally block");
        }



    }
}
