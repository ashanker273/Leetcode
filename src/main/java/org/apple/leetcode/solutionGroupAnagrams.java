package org.apple.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class solutionGroupAnagrams {
//    public List<List<String>> groupAnagrams(String[] strs) {
//        HashMap<String, List<String>> map = new HashMap<>();
//
//        for (String str : strs) {
//            String sortedStr = sortString(str);
//            map.putIfAbsent(sortedStr, new ArrayList<>());
//            map.get(sortedStr).add(str);
//        }
//
//        return new ArrayList<>(map.values());
//    }
//    //better way
//    private String sortString(String str) {
//        char[] arr = str.toCharArray();
//        Arrays.sort(arr);
//        return new String(arr);
//    }


        public List<List<String>> groupAnagrams(String[] strs) {
            HashMap<String, List<String>> map = new HashMap<>();

            for(String str : strs){
                String sortedStr = Arrays.toString(Arrays.sort(str.toCharArray()));

                map.putIfAbsent(sortedStr, new ArrayList<String>());
                map.get(sortedStr).add(str);
            }

            return new ArrayList<>(map.values());
        }
        

}
