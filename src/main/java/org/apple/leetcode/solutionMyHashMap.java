package org.apple.leetcode;

import java.util.Arrays;
//Very bad slow solution
public class solutionMyHashMap {
    static class MyHashMap {

        int size = Integer.MAX_VALUE / 100;
        int[] myHashMap;

        public MyHashMap() {
            System.out.println(size);
            myHashMap = new int[size];

            Arrays.fill(myHashMap, -1);
        }

        public void put(int key, int value) {
            myHashMap[key] = value;

        }

        public int get(int key) {
            return myHashMap[key];
        }

        public void remove(int key) {
            myHashMap[key] = -1;
        }
    }
}
