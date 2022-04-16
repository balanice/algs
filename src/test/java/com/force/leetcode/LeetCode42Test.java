package com.force.leetcode;

import org.junit.jupiter.api.Test;

public class LeetCode42Test {
    @Test
    public void testSolution() {
        int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int r = new LeetCode42TrapWater().trap(height);
        System.out.println(r);
    }
}
