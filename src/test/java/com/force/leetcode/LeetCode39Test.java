package com.force.leetcode;

import java.util.List;

import org.junit.jupiter.api.Test;

public class LeetCode39Test {

    @Test
    public void testSolution() {
        var nums = new int[] { 2, 3, 6, 7 };
        var result = new LeetCode39().combinationSum(nums, 7);
        for (List<Integer> l : result) {
            System.out.println(l);
        }
    }
}
