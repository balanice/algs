package com.force.leetcode;

import java.util.Stack;

/**
 * 给你一个只包含 '(' 和 ')' 的字符串，找出最长有效（格式正确且连续）括号子串的长度
 */
public class LeetCode32LongestParenthese {
    public static int longestValidParentheses(String s) {
        int result = 0;
        int left = 0, right = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                left++;
            } else {
                right++;
            }
            if (right == left) {
                result = result > right * 2 ? result : right * 2;
            } else if (right > left) {
                left = right = 0;
            }
        }
        left = right = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == '(') {
                left++;
            } else {
                right++;
            }
            if (right == left) {
                result = result > right * 2 ? result : right * 2;
            } else if (left > right) {
                left = right = 0;
            }
        }
        return result;
    }

    public static int longestValidParentheses2(String s) {
        int result = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else {
                if (!stack.empty() && stack.pop() == '(') {

                }
            }
        }
        return result;
    }
}
