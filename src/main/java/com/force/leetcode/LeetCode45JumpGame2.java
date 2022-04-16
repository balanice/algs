package com.force.leetcode;

public class LeetCode45JumpGame2 {
    public int jump(int[] nums) {
        if (nums.length <= 1)
            return 0;
        int result = 1;
        int index = 0;
        while ((index + nums[index]) < nums.length - 1) {
            result++;
            int max = 0;
            int nextIndex = index;
            for (int i = index; i <= index + nums[index]; i++) {
                if ((i + nums[i] > max)) {
                    max = i + nums[i];
                    nextIndex = i;
                }
            }
            index = nextIndex;
        }
        return result;
    }
}
