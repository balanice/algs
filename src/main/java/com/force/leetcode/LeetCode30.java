package com.force.leetcode;

import java.util.Stack;

public class LeetCode30 {
    public static Stack<Integer> stack = new Stack<Integer>();

    public static void main(String[] args) {
        int shu[] = { 1, 2, 3, 4 };
        boolean[] used = new boolean[shu.length];
        f(shu, 0, used);
    }

    /**
     *
     * @param shu  待选择的数组
     * @param targ 要选择多少个次
     * @param cur  当前选择的是第几次
     */
    private static void f(int[] shu, int cur, boolean[] used) {
        if (cur == shu.length) {
            System.out.println(stack);
            return;
        }

        for (int i = 0; i < shu.length; i++) {
            if (!used[i]) {
                stack.add(shu[i]);
                used[i] = true;
                f(shu, cur + 1, used);
                stack.pop();
                used[i] = false;
            }

        }
    }
}
