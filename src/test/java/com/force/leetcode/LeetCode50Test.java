package com.force.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeetCode50Test {
    @Test
    public void testSolution() {
        var x = new LeetCode50Pow().pow(2, 10);
        Assertions.assertEquals(1024.0, x);
    }

    @Test
    public void testSolution1() {
        var x = new LeetCode50Pow().pow(2, -2);
        Assertions.assertEquals(0.25, x);
    }
}
