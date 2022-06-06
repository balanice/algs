package com.force.leetcode2;

import java.util.LinkedList;
import java.util.List;

/**
 * 解题思路：观察可发现，每一个数字在第一位时候，都有 （n -1)! 种排列， 这个数字的顺序在当前序列的第 k / (n - 1)! 位上，
 * 依次类推，即可获取到相应的数字。
 */
public class LeetCode60PermutationSequence {
    public String getPermutation(int n, int k) {
        String result = "";
        List<Integer> list = new LinkedList<>();
        int degree = 1;
        for (int i = 1; i <= n; i++) {
            list.add(i);
            if (i != n) {
                degree *= i;
            }
        }
        k--;
        while (k > 0) {
            int index = k / degree;
            result += list.get(index);
            list.remove(index);
            k %= degree;
            degree /= n - 1;
            n--;
        }
        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                result += list.get(i);
            }
        }
        return result;
    }
}
