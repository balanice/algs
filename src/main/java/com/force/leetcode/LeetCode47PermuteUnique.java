package com.force.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LeetCode47PermuteUnique {

    public List<List<Integer>> permuteUnique(int[] nums) {
        var result = new LinkedList<List<Integer>>();
        var temp = new LinkedList<Integer>();
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
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
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
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
