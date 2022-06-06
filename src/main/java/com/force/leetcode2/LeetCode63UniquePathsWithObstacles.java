package com.force.leetcode2;

public class LeetCode63UniquePathsWithObstacles {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] grid = new int[obstacleGrid.length][obstacleGrid[0].length];
        for (int i = 0; i < grid.length; i++) {
            if (obstacleGrid[i][0] != 1) {
                if (i == 0) {
                    grid[i][0] = 1;
                } else {
                    grid[i][0] = grid[i - 1][0];
                }
            }
        }
        for (int i = 1; i < grid[0].length; i++) {
            if (obstacleGrid[0][i] != 1) {
                grid[0][i] = grid[0][i - 1];
            }
        }

        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[0].length; j++) {
                if (obstacleGrid[i][j] == 1) {
                    grid[i][j] = 0;
                } else {
                    grid[i][j] = grid[i - 1][j] + grid[i][j - 1];
                }
            }
        }

        return grid[grid.length - 1][grid[0].length - 1];
    }
}
