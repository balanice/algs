package com.force.leetcode2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeetCode55Test {
    @Test
    public void testSolution() {
        int[] nums = { 2, 3, 1, 1, 4 };
        boolean b = new LeetCode55JumpGame().canJump(nums);
        Assertions.assertTrue(b);
    }

    @Test
    public void testSolution1() {
        int[] nums = { 3, 2, 1, 0, 4 };
        boolean b = new LeetCode55JumpGame().canJump(nums);
        Assertions.assertFalse(b);
    }
}
