package com.force.leetcode;

import java.util.List;

import org.junit.jupiter.api.Test;

public class LeetCode17Test {

    @Test
    public void testSolution() {
        List<String> result = LeetCode17.letterCombinations("12");
        for (String s : result) {
            System.out.print(s);
            System.out.print("\t");
        }
    }
}
