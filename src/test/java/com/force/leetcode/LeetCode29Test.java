package com.force.leetcode;

import org.junit.jupiter.api.Test;

public class LeetCode29Test {

    @Test
    public void testSolution() {
        System.out.println(3 ^ -3);
        System.out.println(113 ^ 3);
    }

    @Test
    public void testSolution2() {
        int r = new LeetCode29Divide().divide(-2147483648, -1);
        System.out.println(r);
    }
}
