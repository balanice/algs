package com.force.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeetCode26Test {
    
    @Test
    public void testSolution() {
        var nums = new int[] {0, 1, 2, 2, 2};
        var r = LeetCode26RemoveDuplicates.solution(nums);
        Assertions.assertEquals(3, r);

        var nums2 = new int[] {0, 0};
        Assertions.assertEquals(1, LeetCode26RemoveDuplicates.solution(nums2));
    }
}
