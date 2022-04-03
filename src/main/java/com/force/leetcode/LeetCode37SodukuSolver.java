package com.force.leetcode;

public class LeetCode37SodukuSolver {
    public void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }

    private boolean solve(char[][] board, int row, int col) {
        if (row >= 9) {
            return true;
        }
        if (col >= 9) {
            return solve(board, row + 1, 0);
        }
        for (char c = '1'; c <= '9'; c++) {
            if (board[row][col] != '.') {
                return solve(board, row, col + 1);
            }
            if (!isValid(board, row, col, c)) {
                continue;
            }
            board[row][col] = c;
            if (solve(board, row, col + 1)) {
                return true;
            }
            board[row][col] = '.';
        }
        return false;
    }

    private boolean isValid(char[][] board, int row, int col, char target) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == target)
                return false;
            if (board[i][col] == target)
                return false;
        }
        int rowStart = row - (row % 3);
        int colStart = col - (col % 3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[rowStart + i][colStart + j] == target)
                    return false;
            }
        }
        return true;
    }
}
