package com.force.leetcode2;

import java.util.List;

import org.junit.jupiter.api.Test;

public class LeetCode51QueenTest {

    @Test
    public void testSolution() {
        var result = new LeetCode51Queen().solveNQueens(4);
        for (List<String> list : result) {
            System.out.println("\n");
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
