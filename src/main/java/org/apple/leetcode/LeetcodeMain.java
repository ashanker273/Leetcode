package org.apple.leetcode;

public class LeetcodeMain {
    public static void main(String[] args) {
        solutionTwoSum solutionTwoSum = new solutionTwoSum();
        System.out.println(solutionTwoSum.twoSum(new int[]{2, 7, 11, 15}, 9));

        solutionIsPalindrome solutionisPalindromes = new solutionIsPalindrome();
        System.out.println(solutionisPalindromes.isPalindrome("A man, a plan, a canal: Panama"));

        solutionIsValid solutionIsValid = new solutionIsValid();
        System.out.println(solutionIsValid.isValid("()[]{}"));

        solutionMyHashMap.MyHashMap obj = new solutionMyHashMap.MyHashMap();
        obj.put(15, 109);
        System.out.println(obj.get(15));
        obj.remove(1);
        System.out.println(obj.get(1));

        solutionMergeSortedArray mergeArray = new solutionMergeSortedArray();
        mergeArray.merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);

        solutionGroupAnagrams solutionGroupAnagrams = new solutionGroupAnagrams();
        solutionGroupAnagrams.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});

    }
}
