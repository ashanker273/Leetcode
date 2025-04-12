package org.apple.must.interview;

import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

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
//        FileReader fr = new FileReader("text.txt");


        //unchecked exception
        int a = 5;
        int b = 1; //needs to be zero

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

        /**
         *
         * 9. Question: What is the difference between public, protected, and private access modifiers in Java? Write an example code snippet that uses all three access modifiers.
         *
         * Answer: public means that the method or variable is accessible from any other class, protected means that the method or variable is accessible from within the same package and from subclasses, and private means that the method or variable is only accessible from within the same class. Here’s an example code snippet that uses all three access modifiers:
         */

        /**
         * 10. Question: What is polymorphism in Java? Write an example code snippet that demonstrates polymorphism.
         *
         * Answer: Polymorphism in Java refers to the ability of objects of different classes to be used interchangeably, as long as they share a common interface or superclass. Here’s an example code snippet that demonstrates polymorphism:
         */

        interface Animal {
            void makeSound();
        }

        class Dog implements Animal {
            @Override
            public void makeSound() {
                System.out.println("Dog Bark");
            }
        }

        class Cat implements Animal {
            @Override
            public void makeSound() {
                System.out.println("Cat Meow");
            }
        }

        Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        animals[1] = new Cat();

        for (Animal animal : animals) {
            animal.makeSound();
        }

    }

    /**
     * 11. Fix the following code to properly implement a binary search algorithm:
     */

    int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    /**
     * 12. Question: What is the difference between an interface and an abstract class in Java?
     *
     * Answer:
     * Both interfaces and abstract classes are used to define common behavior and functionality, but they differ in several ways. An interface is a collection of abstract methods and constants that can be implemented by any class that implements the interface. An abstract class is a class that cannot be instantiated and can contain both abstract and non-abstract methods.
     *
     * One key difference is that a class can implement multiple interfaces, but can only extend one abstract class. Another difference is that an abstract class can have instance variables and non-abstract methods, while an interface cannot.
     */

    /**
     * 13. Question: Fix the following code to correctly sort an array of strings in alphabetical order:
     */

    void sortString(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        System.out.println(new String(chars));
    }

    /**
     * 14. Question: What is the difference between a HashMap and a TreeMap in Java?
     *
     * Answer:
     * Both HashMap and TreeMap are implementations of the Map interface in Java, but they differ in several ways. HashMap is an unordered collection of key-value pairs, while TreeMap is a sorted collection of key-value pairs based on the natural ordering of the keys or a specified Comparator.
     *
     * HashMap allows null keys and values, and has constant-time average case performance for key-value operations. TreeMap does not allow null keys and has logarithmic-time performance for key-value operations. HashMap is generally faster for most operations, but TreeMap can be useful when the keys need to be sorted or when iterating over the keys in a specific order.
     */

    /**
     * 15. Question: What is the difference between a stack and a queue in Java?
     * Answer:
     * Both stacks and queues are data structures used to store and retrieve elements, but they differ in several ways. A stack is a Last-In-First-Out (LIFO) data structure, where elements are added and removed from the same end. A queue is a First-In-First-Out (FIFO) data structure, where elements are added to the back and removed from the front.
     * In Java, you can implement a stack using the Stack class or the Deque interface with the push() and pop() methods. You can implement a queue using the LinkedList class or the Queue interface with the offer() and poll() methods.
     */

    void collectionMethod() {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        map.put(1, 0);
        map.put(0, 0);

        map.keySet().forEach(System.out::print);

        //Linkedlist implementation is not bounded
        Queue queue = new LinkedList();
        queue.offer(1);
        queue.poll();

        //Bounded Queue
        ArrayBlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<>(2);
        arrayBlockingQueue.offer(1);
        arrayBlockingQueue.poll();

        //Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.pop();




    }


}
