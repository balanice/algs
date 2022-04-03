package com.force.leetcode;

import java.util.LinkedList;
import java.util.List;

public class LeetCode17 {

    public static List<String> letterCombinations(String digits) {
        LinkedList<String> result = new LinkedList<>();
        char[][] letters = new char[][] {
                {},
                { 'a', 'b', 'c' },
                { 'd', 'e', 'f' },
                { 'g', 'h', 'i' },
                { 'j', 'k', 'l' },
                { 'm', 'n', 'o' },
                { 'p', 'q', 'r', 's' },
                { 't', 'u', 'v' },
                { 'w', 'x', 'y', 'z' },
        };
        for (int i = 0; i < digits.length(); i++) {
            int index = Character.getNumericValue(digits.charAt(i));
            int l = result.size();
            for (char c : letters[index - 1]) {
                if (l == 0) {
                    result.add("" + c);
                } else {
                    for (int j = 0; j < l; j++) {
                        result.add(result.get(j) + c);
                    }
                }
            }
            for (int j = 0; j < l; j++) {
                result.removeFirst();
            }
        }
        return result;
    }
}
