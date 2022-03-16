package com.force.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
 * 注意：答案中不可以包含重复的三元组。
 * 
 * 输入：nums = [-1,0,1,2,-1,-4]
 * 输出：[[-1,-1,2],[-1,0,1]]
 *
 */
public class LeetCode15ThreeSum {
    
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        if (nums.length < 3) {
            return result;
        }
        // 先对数组进行讨论
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            
            // 对于已排序数组，当位于i的值大于0的时候，它后面的数值无论怎么加都不会等于0
            if (nums[i] > 0) break;

            // 跳过相同的数字
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            // 使用双指针， 遍历数组
            int target = 0 - nums[i];
            int head = i + 1;
            int tail = nums.length - 1;
            while (head < tail) {
                int temp = nums[head] + nums[tail];
                if (temp < target) {
                    head++;
                } else if (temp > target) {
                    tail--;
                } else {
                    List<Integer> r = new LinkedList<>();
                    r.add(nums[i]);
                    r.add(nums[head]);
                    r.add(nums[tail]);

                    result.add(r);
                    while (head < tail && nums[head] == nums[head + 1]) head++;
                    while (head < tail && nums[tail] == nums[tail - 1]) tail--;
                    head++;
                    tail--;
                }
            }
        }
        return result;
    }
}
