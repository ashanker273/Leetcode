package org.apple.test;

import java.util.Arrays;

public class test {
    public static void main(String[] args){
        test test = new test();
        System.out.println(test.sortString("afdsnhfj"));
    }
     String sortString(String str){
        char[] sortedStr = str.toCharArray();
        Arrays.sort(sortedStr);
        return new String(sortedStr);
    }
}
