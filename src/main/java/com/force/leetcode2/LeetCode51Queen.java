package com.force.leetcode2;

import java.util.ArrayList;
import java.util.List;

public class LeetCode51Queen {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '.';
            }
        }
        helper(result, board, 0, 0);
        return result;
    }

    private void helper(List<List<String>> result, char[][] board, int row, int count) {
        if (count == board.length) {
            ArrayList<String> list = new ArrayList<>();
            for (char[] ca : board) {
                list.add(new String(ca));
            }
            result.add(list);
            return;
        }
        if (row >= board.length) {
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if (!isValid(board, row, i)) {
                continue;
            }
            board[row][i] = 'Q';
            helper(result, board, row + 1, count + 1);
            board[row][i] = '.';
        }
    }

    private boolean isValid(char[][] board, int row, int col) {
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == 'Q')
                return false;
            if (board[i][col] == 'Q')
                return false;
        }
        // 左上到右下
        int diff = Math.min(row, col);
        for (int i = row - diff, j = col - diff; i < board.length && j < board.length; i++, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // 左下到右上
        diff = Math.min(board.length - 1 - row, col);
        for (int i = row + diff, j = col - diff; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
}
