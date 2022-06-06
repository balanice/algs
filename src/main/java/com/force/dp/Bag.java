package com.force.dp;

import java.util.Arrays;

/**
 * 背包问题，《算法图解》第九章
 */
public class Bag {
    private static class Sales {
        private String name;
        private int value;
        private int volume;

        public Sales(String name, int volume, int value) {
            this.name = name;
            this.volume = volume;
            this.value = value;
        }
    }

    public int maxPacked(Sales[] sales, int bagVolume) {
        int m = sales.length;
        int[][] grid = new int[m][bagVolume + 1];
        for (int i = 0; i < m; i++) {
            for (int j = 1; j <= bagVolume; j++) {
                if (j < sales[i].volume) {
                    if (i - 1 >= 0) {
                        grid[i][j] = grid[i - 1][j];
                    }
                } else {
                    if (i - 1 >= 0) {
                        grid[i][j] = Math.max(grid[i - 1][j], sales[i].value + grid[i - 1][j - sales[i].volume]);
                    } else {
                        grid[i][j] = sales[i].value;
                    }
                }
            }
        }
        for (int i = 0; i < grid.length; i++) {
            System.out.println(Arrays.toString(grid[i]));
        }
        return grid[m - 1][bagVolume];
    }

    public static void main(String[] args) {
        Sales[] sales = new Sales[3];
        sales[0] = new Sales("jita", 1, 1500);
        sales[1] = new Sales("laptop", 3, 2000);
        sales[2] = new Sales("yinxiang", 4, 3000);
        int r = new Bag().maxPacked(sales, 6);
        System.out.println(r);
    }
}
