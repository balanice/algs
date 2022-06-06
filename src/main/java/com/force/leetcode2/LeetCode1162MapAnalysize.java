package com.force.leetcode2;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode1162MapAnalysize {
    public int maxDistance(int[][] grid) {
        int step = 0;
        int m = grid.length;
        int n = grid[0].length;
        int[][] neibours = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    int[] arr = { i, j };
                    queue.add(arr);
                }
            }
        }
        if (queue.size() == 0 || queue.size() == m * n) {
            return -1;
        }
        while (!queue.isEmpty()) {
            ++step;
            for (int i = queue.size(); i > 0; i--) {
                int[] point = queue.poll();
                for (int[] neibour : neibours) {
                    int x = point[0] + neibour[0];
                    int y = point[1] + neibour[1];
                    if (x < 0 || y < 0 || x >= m || y >= n || grid[x][y] != 0) {
                        continue;
                    }
                    grid[x][y] = step;
                    int[] p = { x, y };
                    queue.add(p);
                }
            }
        }
        return step - 1;
    }
}
