package org.apple.must.interview;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {



        public static void main(String[] args) throws InterruptedException {

            class Counter {
                private int count = 0;

                int getCount() {
                    return this.count;
                }

                void increment() {
                    this.count++;
                }

            }

            class Student {
                String name;
                int age;
                int score;
            }


            Student s1 = new Student();
            Student s2 = new Student();
            Student s3 = new Student();

            s1.name = "Xohn";
            s1.age = 18;
            s1.score = 43;
            s2.name = "Aane";
            s2.age = 21;
            s2.score = 80;
            s3.name = "Jack";
            s3.age = 22;
            s3.score = 90;

            Counter counter = new Counter();

            Runnable t1 = new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 100; i++) {
                        counter.increment();
                    }
                }
            };


            Thread th1 = new Thread(t1);

            th1.start();
            th1.join();

            System.out.println(counter.getCount());

            ArrayList<Student> list = new ArrayList<>(Arrays.asList(s1, s2, s3));

            Collections.sort(list, Comparator.comparing((Student s) -> s.name).reversed().thenComparing(s -> s.age));

            list.forEach(x -> System.out.println(x.name));

//longest string
            List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "grapefruit");
            System.out.println("Longest string: " + strings.stream().max((x, y) -> x.length() - y.length()).orElse(""));


            class Person {
                private String name;
                private int age;

                // Constructor, getters, and setters
                public Person(String name, int age) {
                    this.name = name;
                    this.age = age;
                }

                public int getAge() {
                    return age;
                }
            }

            List<Person> persons = Arrays.asList(
                    new Person("Alice", 25),
                    new Person("Bob", 30),
                    new Person("Charlie", 35)
            );


            List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 5);

            List<Integer> uniqueNumbers = numbersWithDuplicates.stream()
                    .distinct()
                    .toList();

            System.out.println("Unique Numbers: " + uniqueNumbers);





            List<Integer> list1 = Arrays.asList(1, 2, 3);
            List<Integer> list2 = Arrays.asList(3, 4, 5);

            List<Integer> mergeUnique = Stream.concat(list1.stream(), list2.stream()).distinct().toList();

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


