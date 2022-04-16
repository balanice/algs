package com.force.leetcode;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeetCode31Test {

    @Test
    public void testSolution() {
        var nums = new int[] { 3, 2, 1 };
        Arrays.sort(nums, 1, 3);
        // new LeetCode31NextPermutation().nextPermutation(nums);
        // Assertions.assertEquals(1, nums[0]);
        // Assertions.assertEquals(3, nums[2]);
        System.out.println(Arrays.toString(nums));
    }

    @Test
    public void testSolution1() {
        var nums = new int[] { 1, 3, 2 };
        new LeetCode31NextPermutation().nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
        Assertions.assertEquals(2, nums[0]);
        Assertions.assertEquals(1, nums[1]);
    }

    @Test
    public void testSolution2() {
        var nums = new int[] { 4, 2, 0, 2, 3, 2, 0 };
        new LeetCode31NextPermutation().nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
        Assertions.assertEquals(3, nums[3]);
        Assertions.assertEquals(2, nums[6]);
    }
}
