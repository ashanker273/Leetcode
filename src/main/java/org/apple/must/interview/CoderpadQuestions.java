package org.apple.must.interview;

import org.jetbrains.annotations.NotNull;

import java.io.*;

/**
 * Coderpad 30 questions
 */
public class CoderpadQuestions {
    public static void main(String[] args) throws FileNotFoundException {

        /**
         * 1. Question: What is a NullPointerException in Java, and how do you prevent it? Write an example code snippet that could result in a NullPointerException and modify it to prevent the exception from occurring.
         * Answer: A NullPointerException occurs when a variable that is expected to contain an object reference is null, and an operation is performed on that variable as if it contained a valid object reference. To prevent it, you can add a null check before performing any operations on the variable. Here’s an example code snippet:
         *
         * 2. Question: What is the purpose of the finally block in a try-catch-finally statement in Java? Write an example code snippet that demonstrates the use of a finally block.
         * Answer: The finally block is used to specify a code block that will be executed regardless of whether an exception was thrown or not. Here’s an example code snippet:
         */
        String name = null;
        try {
            if (name != null) {
                System.out.println(name.length());
            }

        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally block");
        }

        /**
         * 3. Question: What is the difference between an interface and an abstract class in Java? Write an example code snippet that uses both an interface and an abstract class to demonstrate their differences.
         *
         * Answer: An interface defines a contract that a class must implement, while an abstract class provides a partially implemented class that cannot be instantiated directly. Here’s an example code snippet:
         */

        interface Vehicle {
            void drive();
        }

        abstract class Engine {
            abstract void fuel();
        }

        class BMW extends Engine implements Vehicle {
            @Override
            public void drive() {
                System.out.println("Drive BMW");
            }

            @Override
            void fuel() {
                System.out.println("Gas Vehicle");
            }
        }

        BMW x3 = new BMW();
        x3.drive();
        x3.fuel();

        /**
         * 4. Question: Explain the difference between the == operator and the equals() method in Java. Write an example code snippet that demonstrates the use of both.
         * Answer: The == operator tests for object equality, while the equals() method tests for value equality. Here’s an example code snippet:
         */
        String s1 = "Avinash";
        String s2 = "Avinash";
        String s3 = new String("Avinash");
        if (s1 == s2) System.out.println("==");
        if (s1 != s3) System.out.println("!=");
        if (s1.equals(s3)) System.out.println("==");

        /**
         * 5. Question: What is a Java package, and why is it useful? Write an example code snippet that demonstrates the use of a package.
         * Answer: A Java package is a way to group related classes, interfaces, and sub-packages together. It is useful for organizing code and avoiding naming conflicts, as well as making it easier to locate and reuse code. Here’s an example code snippet that demonstrates the use of a package:
         * 6. Question: What is the difference between a checked and an unchecked exception in Java? Write an example code snippet that throws both types of exceptions.
         * Answer: A checked exception is a type of exception that must be either caught or declared in the method signature using the throws keyword, while an unchecked exception is a type of exception that does not have to be caught or declared. Here’s an example code snippet that throws both types of exceptions:
         */

        //Checked exception
        FileReader fr = new FileReader("text.txt");


        //unchecked exception
        int a = 5;
        int b = 0;

        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }

        // This code only executes if b is NOT zero
        int result = a / b;
        System.out.println("Result: " + result);
        // Additional code to use the result


        /**
         *
         * 7. Question: What is the difference between a static method and an instance method in Java? Write an example code snippet that uses both types of methods.
         *
         * Answer: A static method belongs to the class itself, rather than to a specific instance of the class, and can be called using the class name. An instance method, on the other hand, belongs to a specific instance of the class and can only be called using that instance. Here’s an example code snippet that uses both types of methods:
         */

        class TestStatic {
            static void staticMethod() {
                System.out.println("static method");
            }

            void nonStaticMethod() {
                System.out.println("non static method");
            }
        }

        TestStatic testNonStatic = new TestStatic();
        TestStatic.staticMethod();
        testNonStatic.nonStaticMethod();

        /**
         *
         * 8. Question: What is the purpose of the super keyword in Java? Write an example code snippet that uses the super keyword.
         *
         * Answer: The super keyword is used to call a method or constructor in the superclass. Here’s an example code snippet:
         * In this example, the Dog class extends the Animal class and overrides its makeSound() method. The super.makeSound() call in the Dog class calls the makeSound() method of the superclass, and the System.out.println("Bark") statement adds the specific sound of the Dog class.
         */

        class A {

            void method() {
                System.out.println("A method");
            }
        }

        class B extends A {
            void method() {
                super.method();
                System.out.println("B method");
            }
        }


    }


}
