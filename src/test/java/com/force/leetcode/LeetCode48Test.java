package com.force.leetcode;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class LeetCode48Test {
    @Test
    public void testSolution() {
        int[][] matrix = new int[][] {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        new LeetCode48RotateImage().rotate(matrix);
        for (int[] a : matrix) {
            System.out.println(Arrays.toString(a));
        }
    }
}
