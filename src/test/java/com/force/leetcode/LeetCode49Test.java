package com.force.leetcode;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class LeetCode49Test {
    @Test
    public void testSolution() {
        String[] s = { "eat", "tea", "tan", "ate", "nat", "bat" };
        var r = new LeetCode49GroupAnagrams().groupAnagrams(s);
        for (List<String> l : r) {
            System.out.println(l);
        }
    }
}
