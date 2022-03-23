package com.force.leetcode;

public class LeetCode28StrStr {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int j = 0;
                int tail = needle.length() - 1;
                while (j < tail) {
                    if (haystack.charAt(i + j) != needle.charAt(j) || 
                        haystack.charAt(i + tail) != needle.charAt(tail)) {
                            break;
                    }
                    j++;
                    tail--;
                }
                if (j > tail) {
                    return i;
                }
            }
        }
        return -1;
    }
}
