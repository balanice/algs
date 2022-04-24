package com.force.leetcode2;

public class LeetCode53MaxSubArray {
    public int maxSubArray(int[] nums) {
        int currentMax = nums[0];
        int max = currentMax;
        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], nums[i] + currentMax);
            max = Math.max(currentMax, max);
        }
        return max;
    }
}
