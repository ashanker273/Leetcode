package org.apple.test;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class Tester {
    public static void main(String[] args) {
        int x = 3;
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();

        int y = (x % 2 == 1 ? 1 : 0);


        switch (x){
            case 0: System.out.println(Integer.MIN_VALUE); break;
            case 1: System.out.println(Integer.MAX_VALUE); break;
            case 2: System.out.println(Float.MIN_VALUE); break;
            case 3: System.out.println(Double.MIN_VALUE); break;
            case 4: System.out.println(Long.MIN_VALUE); break;
        }
    }
}
