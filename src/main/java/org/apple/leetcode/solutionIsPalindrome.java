package org.apple.leetcode;

public class solutionIsPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c))
                sb.append(Character.toLowerCase(c));
        }

        String str = sb.toString();
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end))
                return false;
            start++;
            end--;
        }

        return true;
    }
}
