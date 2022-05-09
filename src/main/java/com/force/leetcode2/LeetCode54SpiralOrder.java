package com.force.leetcode2;

import java.util.ArrayList;
import java.util.List;

public class LeetCode54SpiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int rowStart = 0, rowEnd = matrix.length - 1;
        int colStart = 0, colEnd = matrix[0].length - 1;
        int currentRow = 0, currentCol = 0;
        while (rowStart <= rowEnd) {
            // 左上角
            if (currentRow == rowStart && currentCol == colStart) {
                for (int i = colStart; i <= colEnd; i++) {
                    list.add(matrix[currentRow][i]);
                }
                currentRow = ++rowStart;
                currentCol = colEnd;
                continue;
            }
            // 右上角
            if (currentRow == rowStart && currentCol == colEnd) {
                for (int i = rowStart; i <= rowEnd; i++) {
                    list.add(matrix[i][currentCol]);
                }
                currentRow = rowEnd;
                currentCol = --colEnd;
                continue;
            }
            // 右下角
            if (currentRow == rowEnd && currentCol == colEnd) {
                for (int i = currentCol; i >= colStart; i--) {
                    list.add(matrix[currentRow][i]);
                }
                currentRow = --rowEnd;
                currentCol = colStart;
                continue;
            }
            // 左下角
            if (currentRow == rowEnd && currentCol == colStart) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    list.add(matrix[i][currentCol]);
                }
                currentRow = rowStart;
                currentCol = ++colStart;
                continue;
            }
        }
        return list;
    }
}
