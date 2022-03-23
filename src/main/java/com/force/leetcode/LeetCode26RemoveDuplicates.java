package com.force.leetcode;

public class LeetCode26RemoveDuplicates {

    public static int solution(int[] nums) {
        if (nums.length <= 1)
            return nums.length;
        int slow = 1, fast = 1;
        while (fast < nums.length) {
            if (nums[fast] == nums[fast - 1]) {
                fast++;
            } else {
                nums[slow++] = nums[fast++];
            }
        }
        return slow;
    }
}
