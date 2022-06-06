package com.force.leetcode2;

public class LeetCode62UniquePaths {
    public int uniquePaths(int m, int n) {
        int[] dp = new int[n];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[j] = dp[j] + dp[j - 1];
            }
        }
        return dp[n - 1];
    }

    private int helper(int m, int n) {
        if (m == 0 || n == 0) {
            return 1;
        }
        return helper(m - 1, n) + helper(m, n - 1);
    }
}
