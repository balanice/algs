package com.force.leetcode;

public class LeetCode50Pow {
    public double pow(double x, int n) {
        double result = 1.0;
        for (int i = n; i != 0; i /= 2) {
            if (i % 2 != 0) {
                result = result * x;
            }
            x *= x;
        }
        if (n < 0) {
            return 1 / result;
        }
        return result;
    }
}
