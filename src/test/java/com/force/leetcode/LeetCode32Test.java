package com.force.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeetCode32Test {

    @Test
    public void testSolution1() {
        String s = ")";
        Assertions.assertEquals(0, LeetCode32LongestParenthese.longestValidParentheses(s));
    }

    @Test
    public void testSolution2() {
        String s = "(()";
        Assertions.assertEquals(2, LeetCode32LongestParenthese.longestValidParentheses(s));
    }

    @Test
    public void testSolution3() {
        String s = "(()(()";
        Assertions.assertEquals(2, LeetCode32LongestParenthese.longestValidParentheses(s));
    }
}
