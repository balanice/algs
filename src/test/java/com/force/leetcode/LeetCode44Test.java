package com.force.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeetCode44Test {

    @Test
    public void testSolution() {
        boolean b = new LeetCode44WildcardMatching().isMatch("aa", "a");
        Assertions.assertFalse(b);
    }

    @Test
    public void testSolution1() {
        boolean b = new LeetCode44WildcardMatching().isMatch("aa", "*");
        Assertions.assertTrue(b);
    }

    @Test
    public void testSolution2() {
        boolean b = new LeetCode44WildcardMatching().isMatch("cb", "?a");
        Assertions.assertFalse(b);
    }

    @Test
    public void testSolution3() {
        boolean b = new LeetCode44WildcardMatching().isMatch("adceb", "a*b");
        Assertions.assertTrue(b);
    }

    @Test
    public void testSolution4() {
        boolean b = new LeetCode44WildcardMatching().isMatch("acdcb", "a*c?b");
        Assertions.assertFalse(b);
    }

    @Test
    public void testSolution5() {
        boolean b = new LeetCode44WildcardMatching().isMatch("hi", "*?");
        Assertions.assertTrue(b);
    }
}
