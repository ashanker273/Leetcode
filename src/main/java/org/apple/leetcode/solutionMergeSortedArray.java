package org.apple.leetcode;

import java.util.Arrays;

public class solutionMergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0;
        while (i < m + n && j < n + 2) {
            if (nums1[i] <= nums2[j] && nums1[i] != 0) {
                i++;
            } else if (nums1[i] > nums2[j] || nums1[i] == 0) {
                int temp = nums1[i];
                nums1[i] = nums2[j];
                nums2[j] = temp;
                i++;
                j++;
            }
        }

    }
}
