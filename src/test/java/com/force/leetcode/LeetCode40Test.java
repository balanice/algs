package com.force.leetcode;

import java.util.List;

import org.junit.jupiter.api.Test;

public class LeetCode40Test {

    @Test
    public void testSolution() {
        int[] nums = { 10, 1, 2, 7, 6, 1, 5 };
        var result = new LeetCode40().combinationSum(nums, 8);
        for (List<Integer> l : result) {
            System.out.println(l);
        }
    }
}
