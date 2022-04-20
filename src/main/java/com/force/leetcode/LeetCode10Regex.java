package com.force.leetcode;

public class LeetCode10Regex {

    // 参考： https://www.cnblogs.com/grandyang/p/4461713.html
    public boolean isMatch(String s, String p) {
        if (p.isEmpty())
            return s.isEmpty();
        if (p.length() > 1 && p.charAt(1) == '*') {
            System.out.println(p + " " + s);
            return isMatch(s, p.substring(2))
                    || (!s.isEmpty() && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.')
                            && isMatch(s.substring(1), p));
        } else {
            return !s.isEmpty() && (s.charAt(0) == p.charAt(0)
                    || p.charAt(0) == '.') && isMatch(s.substring(1), p.substring(1));
        }
    }
}
