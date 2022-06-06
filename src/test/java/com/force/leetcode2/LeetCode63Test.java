package com.force.leetcode2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeetCode63Test {
    @Test
    public void testSolution() {
        int[][] ob = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
        var r = new LeetCode63UniquePathsWithObstacles().uniquePathsWithObstacles(ob);
        Assertions.assertEquals(2, r);
    }

    @Test
    public void testSolution1() {
        int[][] ob = { { 0, 1 }, { 0, 0 } };
        var r = new LeetCode63UniquePathsWithObstacles().uniquePathsWithObstacles(ob);
        Assertions.assertEquals(1, r);
    }

    @Test
    public void testSolution2() {
        int[][] ob = { { 1 } };
        var r = new LeetCode63UniquePathsWithObstacles().uniquePathsWithObstacles(ob);
        Assertions.assertEquals(0, r);
    }
}
