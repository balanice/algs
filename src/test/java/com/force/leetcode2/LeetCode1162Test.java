package com.force.leetcode2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeetCode1162Test {
    @Test
    public void testSolution() {
        int[][] grid = { { 1, 0, 1 }, { 0, 0, 0 }, { 1, 0, 1 } };
        int d = new LeetCode1162MapAnalysize().maxDistance(grid);
        Assertions.assertEquals(2, d);
    }
}
