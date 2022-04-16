package com.force.leetcode;

import java.util.List;

import org.junit.jupiter.api.Test;

public class LeetCode47Test {

    @Test
    public void testSolution() {
        var nums = new int[] { 1, 1, 2 };
        var result = new LeetCode47PermuteUnique().permuteUnique(nums);
        for (List<Integer> l : result) {
            System.out.println(l);
        }
    }
}
