package com.force.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeetCode12Test {
    
    @Test
    public void testIntToRoman() {
        Assertions.assertEquals("III", LeetCode12IntToRoman.intToRoman(3));
        Assertions.assertEquals("LVIII", LeetCode12IntToRoman.intToRoman(58));
        Assertions.assertEquals("MCMXCIV", LeetCode12IntToRoman.intToRoman(1994));
    }
}
