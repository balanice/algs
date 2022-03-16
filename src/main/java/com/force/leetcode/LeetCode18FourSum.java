package com.force.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 给你一个由 n 个整数组成的数组 nums ，和一个目标值 target 。请你找出并返回满足下述全部条件且不重复的四元组 [nums[a], nums[b], nums[c], nums[d]] （若两个四元组元素一一对应，则认为两个四元组重复）：
 *   0 <= a, b, c, d < n
 *   a、b、c 和 d 互不相同
 *   nums[a] + nums[b] + nums[c] + nums[d] == target
 * 你可以按 任意顺序 返回答案 。
 */
public class LeetCode18FourSum {
    
    public List<List<Integer>> fourSum(int[] nums, int target) {
        var result = new LinkedList<List<Integer>>();
        if (nums.length < 4) return result;
        
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 1 && nums[i] == nums[i - 1]) continue;
            
            int target1 = target - nums[i];
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int target2 = target1 - nums[j];
                int head = j + 1;
                int tail = nums.length - 1;
                while (head < tail) {
                    int temp = nums[head] + nums[tail];
                    if (temp == target2) {
                        List<Integer> r = new LinkedList<>();
                        r.add(nums[i]);
                        r.add(nums[j]);
                        r.add(nums[head]);
                        r.add(nums[tail]);
                        result.add(r);

                        while (head < tail && nums[head] == nums[head + 1]) head++;
                        while (head < tail && nums[tail] == nums[tail - 1]) tail--;
                        head++;
                        tail--;
                    } else if (temp > target2) {
                        tail--;
                    } else {
                        head++;
                    }
                }
            }
        }
        return result;
    }
}
