package com.force.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeetCode15ThreeSumTest {

    @Test
    public void testSolution() {
        var nums = new int[] { -1, 0, 1, 2, -1, -4 };
        var result = LeetCode15ThreeSum.threeSum(nums);

        Assertions.assertEquals(2, result.size());
    }

    @Test
    public void testSolution2() {
        var nums = new int[] { -2, 0, 0, 2, 2 };
        var result = LeetCode15ThreeSum.threeSum(nums);

        Assertions.assertEquals(1, result.size());
    }
}
