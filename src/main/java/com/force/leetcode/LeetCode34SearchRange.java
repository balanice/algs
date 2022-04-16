package com.force.leetcode;

/**
 * 在排序数组中查找元素的第一个和最后一个位置
 * 
 * 解题思路：
 * 1. 使用二分查找
 * 2. 查找大于等于目标数的最小数
 * 3. 查找小于等于目标数的最大数
 */
public class LeetCode34SearchRange {
    public int[] searchRange(int[] nums, int target) {
        int[] result = { -1, -1 };
        if (nums.length == 0)
            return result;
        int left = searchLeft(nums, target);
        if (nums[left] != target) {
            return result;
        }
        result[0] = left;
        int right = searchRight(nums, target);
        if (nums[right] == target) {
            result[1] = right;
        } else {
            result[1] = right - 1;
        }
        return result;
    }

    private int searchLeft(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return right;
    }

    private int searchRight(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return right;
    }
}
