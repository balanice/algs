package com.force.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeetCode33Test {

    @Test
    public void testSolution() {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int i = new LeetCode33().search(nums, 3);
        System.out.println(i);
    }

    @Test
    public void testSolution1() {
        int[] nums = { 1 };
        Assertions.assertEquals(-1, new LeetCode33().search(nums, 0));
    }
}
