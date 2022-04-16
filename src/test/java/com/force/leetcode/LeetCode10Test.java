package com.force.leetcode;

import org.junit.jupiter.api.Test;

public class LeetCode10Test {

    @Test
    public void testSolution() {
        boolean b = new LeetCode10Regex().isMatch("aa", "b*aa");
        System.out.println(b);
    }
}
