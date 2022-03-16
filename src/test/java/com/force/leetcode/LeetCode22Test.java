package com.force.leetcode;

import org.junit.jupiter.api.Test;

public class LeetCode22Test {
    
    @Test
    public void testSolution() {
        var result = new LeetCode22GenerateParenthesis().generateParenthesis(3);
        for (String s : result) {
            System.out.println(s);
        }
    }
}
