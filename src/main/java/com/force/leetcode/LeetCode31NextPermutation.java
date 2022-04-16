package com.force.leetcode;

import java.util.Arrays;

public class LeetCode31NextPermutation {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        for (; i >= 0; i--) {
            int min = i + 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[i] && nums[j] < nums[min]) {
                    min = j;
                }
            }
            if (nums[min] > nums[i]) {
                int temp = nums[min];
                nums[min] = nums[i];
                nums[i] = temp;
                System.out.println(i);
                Arrays.sort(nums, i + 1, nums.length);
                return;
            }
        }
        if (i < 0) {
            Arrays.sort(nums);
        }
    }
}
