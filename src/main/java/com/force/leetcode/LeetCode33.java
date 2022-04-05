package com.force.leetcode;

public class LeetCode33 {
    /**
     * 解题思路： 如 {0, 1, 2, 3, 4, 5, 6}, 不管从哪个点旋转，mid 左边或者右边一定有一边是有序的，
     * 利用这个特性每次可以筛掉 1/2 的无关数据
     * 
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target)
                return mid;
            // left is sorted.
            if (nums[left] <= nums[mid]) {
                if (nums[mid] > target) {
                    if (nums[left] <= target) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                } else {
                    left = mid + 1;
                }
            } else { // right is sorted
                if (nums[mid] < target) {
                    if (nums[right] >= target) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
