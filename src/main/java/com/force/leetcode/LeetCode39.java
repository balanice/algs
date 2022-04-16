package com.force.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetCode39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        var result = new ArrayList<List<Integer>>();
        var temp = new LinkedList<Integer>();
        combine(result, candidates, target, 0, temp);
        return result;
    }

    private void combine(List<List<Integer>> result, int[] candidates, int target, int index,
            LinkedList<Integer> temp) {
        if (target < 0)
            return;
        if (target == 0) {
            result.add(new LinkedList<>(temp));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            temp.add(candidates[i]);
            combine(result, candidates, target - candidates[i], i, temp);
            temp.removeLast();
        }
    }
}
