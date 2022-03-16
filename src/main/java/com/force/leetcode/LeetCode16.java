package com.force.leetcode;

import java.util.Arrays;

/**
 * 给你一个长度为 n 的整数数组 nums 和 一个目标值 target。请你从 nums 中选出三个整数，使它们的和与 target 最接近。
 * 返回这三个数的和。
 * 假定每组输入只存在恰好一个解。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/3sum-closest
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode16 {
    
    public static int solution(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[2];
        int diff = Math.abs(result - target);
        System.out.println("diff: " + diff);
        for (int i = 0; i < nums.length - 2; i++) {
            int head = i + 1;
            int tail = nums.length - 1;
            while (head < tail) {
                int t = nums[i] + nums[head] + nums[tail];
                int newDiff = Math.abs(target - t);
                System.out.println(newDiff);
                if (newDiff < diff) {
                    diff = newDiff;
                    result = t;
                }
                if (target < t) {
                    tail--;
                } else {
                    head++;
                }
            }
        }
        return result;
    }
}
