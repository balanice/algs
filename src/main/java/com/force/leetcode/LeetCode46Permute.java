package com.force.leetcode;

import java.util.LinkedList;
import java.util.List;

public class LeetCode46Permute {
    public List<List<Integer>> permute(int[] nums) {
        var result = new LinkedList<List<Integer>>();
        var temp = new LinkedList<Integer>();
        boolean[] used = new boolean[nums.length];
        sort(nums, 0, used, temp, result);
        return result;
    }

    private void sort(int[] nums, int count, boolean[] used, LinkedList<Integer> temp, List<List<Integer>> result) {
        if (count == nums.length) {
            result.add(new LinkedList<>(temp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            used[i] = true;
            temp.add(nums[i]);
            sort(nums, count + 1, used, temp, result);
            used[i] = false;
            temp.removeLast();
        }
    }
}
