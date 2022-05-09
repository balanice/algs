package com.force.leetcode2;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class LeetCode56Test {
    @Test
    public void testSolution() {
        int[][] intervals = { { 1, 3 }, { 15, 18 }, { 8, 10 }, { 2, 6 } };
        int[][] arr = new LeetCode56MergeIntervals().merge(intervals);
        for (int[] ar : arr) {
            System.out.println(Arrays.toString(ar));
        }
    }
}
