package org.apple.leetcode;

import java.util.HashMap;

public class solutionTwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        //iterate through all the values in nums integer array
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(target - nums[i])) {
                map.put(nums[i], i);
            } else {
                return new int[]{i, map.get(target - nums[i])};
            }
        }
        return new int[]{0, 0};
    }
}
