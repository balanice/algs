package com.force.leetcode;

import java.util.Stack;

public class LeetCode42TrapWater {
    public int trap(int[] height) {
        int r = 0;
        int i = 0;
        var stack = new Stack<Integer>();
        while (i < height.length) {
            if (stack.empty() || height[i] <= height[stack.peek()]) {
                stack.push(i++);
            } else {
                int t = stack.pop();
                System.out.println("t: " + t);
                if (stack.empty()) {
                    continue;
                }
                int left = stack.peek();
                System.out.println("left: " + left + "\ti: " + i + "\tt: " + t);
                r += (Math.min(height[i], height[left]) - height[t]) * (i - left - 1);
            }
        }
        return r;
    }
}
