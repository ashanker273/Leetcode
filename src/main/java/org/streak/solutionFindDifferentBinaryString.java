package org.streak;

public class solutionFindDifferentBinaryString {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < nums.length; i++) {
            result.append(nums[i].charAt(i) == '0' ? '1' : '0'); // Flip the i-th bit
        }

        return result.toString();
    }
}
