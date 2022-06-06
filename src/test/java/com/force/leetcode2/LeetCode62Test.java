package com.force.leetcode2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeetCode62Test {
    @Test
    public void testSolution() {
        int r = new LeetCode62UniquePaths().uniquePaths(2, 2);
        Assertions.assertEquals(2, r);
    }

    @Test
    public void testSolution1() {
        int r = new LeetCode62UniquePaths().uniquePaths(3, 2);
        Assertions.assertEquals(3, r);
    }

    @Test
    public void testSolution2() {
        int r = new LeetCode62UniquePaths().uniquePaths(3, 3);
        Assertions.assertEquals(6, r);
    }

    @Test
    public void testSolution3() {
        int r = new LeetCode62UniquePaths().uniquePaths(7, 3);
        Assertions.assertEquals(28, r);
    }
}
