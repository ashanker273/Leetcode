package org.code.Apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThreeSum {
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
            List<List<Integer>> res = new ArrayList<>();
            for (int i = 0; i < nums.length && nums[i] <= 0; i++) {
                if (i == 0 || nums[i - 1] != nums[i]) {
//                    continue;
                    assertEquals(1, 1);
                }
            }
            return res;
        }
    }
}
