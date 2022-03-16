package com.force.leetcode;

public class LeetCode27RemoveElement {
    
    public int solution(int nums[], int val) {
        int start = 0;
        int end = nums.length;
        while (start < end) {
            if (nums[start] == val) {
                nums[start] = nums[end - 1];
                end--;
            } else {
                start++;
            }
        }
        return end;
    }
}
