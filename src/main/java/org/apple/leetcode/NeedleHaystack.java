package org.apple.leetcode;

public class NeedleHaystack {
    public int strStr(String haystack, String needle) {
        int result = -1;
        int i = 0;
        int temp = 0;
        while (i < haystack.length()) {
            int j = 0;
            while (j < needle.length()) {
                if (needle.charAt(j) == haystack.charAt(i)) {
                    j++;
                    i++;
                    if(j == needle.length()){return i - j;}
                } else {
                    result = -1;
                    i++;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        NeedleHaystack needleHaystack = new NeedleHaystack();
        System.out.println(needleHaystack.strStr("aaa", "leeto"));
    }
}
