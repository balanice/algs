package com.force.leetcode;

// 通配符匹配
public class LeetCode44WildcardMatching {

    public boolean isMatch(String s, String p) {
        int iStar = -1, jStar = -1, i = 0, j = 0, m = s.length(), n = p.length();
        while (i < m) {
            if (j < n && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '?')) {
                i++;
                j++;
            } else if (j < n && p.charAt(j) == '*') {
                iStar = i;
                jStar = j++;
            } else if (iStar >= 0) {
                i = ++iStar;
                j = jStar + 1;
            } else {
                return false;
            }
        }
        while (j < n && p.charAt(j) == '*')
            j++;
        return j == n;
    }

    public boolean isMatch_old(String s, String p) {
        if (p.isEmpty())
            return s.isEmpty();
        if (p.charAt(0) == '*') {
            if (p.length() == 1) {
                return true;
            } else {
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == p.charAt(1) || p.charAt(1) == '?') {
                        return isMatch(s.substring(i + 1), p.substring(2)) || isMatch(s.substring(i + 1), p);
                    }
                }
                return isMatch(s, p.substring(1));
            }
        } else {
            return !s.isEmpty() && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '?')
                    && isMatch(s.substring(1), p.substring(1));
        }
    }
}
