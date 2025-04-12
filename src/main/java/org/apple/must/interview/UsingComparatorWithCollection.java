package org.apple.must.interview;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Student {
    public String name;
    public int age;
    public int score;
}

public class UsingComparatorWithCollection {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();



        s1.name = "John";
        s1.age = 18;
        s1.score = 43;
        s2.name = "Jane";
        s2.age = 21;
        s2.score = 80;
        s3.name = "Jack";
        s3.age = 22;
        s3.score = 90;
        s4.name = "Jill";
        s4.age = 123;
        s4.score = 30;
        s5.name = "James";
        s5.age = 24;
        s5.score = 100;

        ArrayList<Student> list = new ArrayList<>(Arrays.asList(s1, s2, s3, s4, s5));
        Collections.sort(list, Comparator.comparing((Student student) -> student.score)
                .thenComparing(student -> student.name));

        list.forEach(x -> System.out.println(x.name + " " + x.age + " " + x.score));



    }
}
