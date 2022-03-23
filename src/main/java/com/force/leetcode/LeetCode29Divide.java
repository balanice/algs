package com.force.leetcode;

public class LeetCode29Divide {
    public int divide(int dividend, int divisor) {
        int sign = (dividend ^ divisor) < 0 ? -1 : 1;
        long s = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);
        long result = 0;
        while (s >= d) {
            long m = d;
            int n = 1;
            while (s >= (m << 1)) {
                m <<= 1;
                n <<= 1;
            }
            result += n;
            s -= m;
        }
        long r = sign * result;
        if (r < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        if (r > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return (int) r;
    }
}
