package com.force.leetcode2;

public class LeetCode55JumpGame {
    public boolean canJump(int[] nums) {
        int index = 0;
        while (index + nums[index] < nums.length - 1) {
            int max = index + nums[index];
            int nextIndex = index;
            for (int i = index; i <= index + nums[index]; i++) {
                if ((i + nums[i] > max)) {
                    max = i + nums[i];
                    nextIndex = i;
                }
            }
            if (nextIndex == index) {
                break;
            } else {
                index = nextIndex;
            }
        }
        return index + nums[index] >= nums.length - 1;
    }
}
