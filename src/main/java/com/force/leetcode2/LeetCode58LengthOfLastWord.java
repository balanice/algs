package com.force.leetcode2;

public class LeetCode58LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int index = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                if (index != -1) {
                    length = i - index;
                    index = -1;
                }
            } else {
                if (index == -1) {
                    index = i;
                }
            }
        }
        if (index != -1) {
            length = s.length() - index;
        }
        return length;
    }
}
