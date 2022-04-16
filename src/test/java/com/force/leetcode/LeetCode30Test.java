package com.force.leetcode;

import org.junit.jupiter.api.Test;

public class LeetCode30Test {

    @Test
    public void testSolution() {
        String[] args = new String[] { "foo", "bar" };
        var r = new LeetCode30().findSubstring2("barfoothefoobarman", args);
        System.out.println(r);
    }
}
