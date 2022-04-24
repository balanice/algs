package com.force.leetcode2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeetCode53Test {
    @Test
    public void testSolution() {
        var nums = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        var r = new LeetCode53MaxSubArray().maxSubArray(nums);
        Assertions.assertEquals(6, r);
    }
}
