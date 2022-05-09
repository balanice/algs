package com.force.leetcode2;

import org.junit.jupiter.api.Test;

public class LeetCode54Test {
    @Test
    public void testSolution() {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        var l = new LeetCode54SpiralOrder().spiralOrder(matrix);
        System.out.println(l);
    }

    @Test
    public void testSolution1() {
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        var l = new LeetCode54SpiralOrder().spiralOrder(matrix);
        System.out.println(l);
    }
}
