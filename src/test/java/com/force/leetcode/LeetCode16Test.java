package com.force.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeetCode16Test {
    
    @Test
    public void testSolution() {
        var nums = new int[] {0, 2, 1, -3};
        Assertions.assertEquals(0, LeetCode16.solution(nums, 1));
    }
}
