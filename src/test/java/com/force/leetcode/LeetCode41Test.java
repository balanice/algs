package com.force.leetcode;

import org.junit.jupiter.api.Test;

public class LeetCode41Test {
    @Test
    public void testSolution() {
        var nums = new int[] { 2, 1 };
        var r = new LeetCode41FirstMissingPositive().firstMissingPositive(nums);
        System.out.println(r);
    }
}
