package com.force.leetcode;

public class LeetCode10Regex {

    public boolean isMatch(String s, String p) {
        int i = s.length() - 1, j = p.length() - 1;
        while (i < s.length() && j < p.length()) {
            if (s.charAt(i) == p.charAt(j)) {
                i--;
                j--;
                continue;
            } else {
                if (p.charAt(j) == '.') {
                    i--;
                    j--;
                    continue;
                }

                if (p.charAt(j) == '*') {
                    if (p.charAt(j - 1) == '.') {
                        j++;
                        i = s.length();
                        continue;
                    }
                    while (i < s.length() && p.charAt(j - 1) == s.charAt(i)) {
                        i++;
                    }
                    j++;
                    continue;
                }
                if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
                    j += 2;
                    continue;
                }
                return false;
            }
        }
        return (i >= s.length() && j >= p.length());
    }
}
