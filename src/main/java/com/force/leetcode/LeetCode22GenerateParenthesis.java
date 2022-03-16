package com.force.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * 有 n 个"(" 和 n 个")", 分别记录为 left, right, 
 * 1. 当 left > right 说明 "(" 放多了， 此时是非法的，直接返回
 * 2. left < right, left > 0, 说明可以放 "(" 或 ")", left == 0, 只能放 ")";
 * 3. left == right == 0, 说明生成完毕;
 * 4. left == right, 只能放 "(";
 */ 

public class LeetCode22GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        var result = new LinkedList<String>();
        generate("", n, n, result);
        return result;
    }

    private void generate(String s, int left, int right, List<String> result) {
        if (left > right) return;
        System.out.println("left: " + left + " right: " + right);

        if (left == 0 && right == 0) {
            result.add(s);
            return;
        }
        if (left == right) {
            generate(s + "(", --left, right, result);
        } else {
            if (left == 0) {
                generate(s + ")", left, right - 1, result);
            } else {
                generate(s + "(", left - 1, right, result);
                generate(s + ")", left, right - 1, result);
            }
        }
    }
}
