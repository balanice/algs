package com.force.leetcode;

/**
 * 4. 寻找两个正序数组的中位数
 * 给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
 * 算法的时间复杂度应该为 O(log (m+n)) 。
 * 示例 1：
 * 输入：nums1 = [1,3], nums2 = [2]
 * 输出：2.00000
 * 解释：合并数组 = [1,2,3] ，中位数 2
 */
public class LeetCode4 {

    public static double findMedianSortedArrays(int[] a1, int[] a2) {
        int total = a1.length + a2.length;
        return (findNthNumber(a1, 0, a2, 0, (total + 1) / 2) +
                findNthNumber(a1, 0, a2, 0, (total + 2) / 2)) / 2.0;
    }

    private static int findNthNumber(int[] a1, int i, int[] a2, int j, int interval) {
        if (i >= a1.length) {
            return a2[j + interval - 1];
        }
        if (j >= a2.length) {
            return a1[i + interval - 1];
        }
        if (interval == 1) {
            return Math.min(a1[i], a2[j]);
        }
        int midValue1 = i + interval / 2 - 1 < a1.length ? a1[i + interval / 2 - 1] : Integer.MAX_VALUE;
        int midValue2 = j + interval / 2 - 1 < a2.length ? a2[j + interval / 2 - 1] : Integer.MAX_VALUE;
        if (midValue1 < midValue2) {
            return findNthNumber(a1, i + interval / 2, a2, j, interval - interval / 2);
        } else {
            return findNthNumber(a1, i, a2, j + interval / 2, interval - interval / 2);
        }
    }
}
