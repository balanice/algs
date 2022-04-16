package com.force.leetcode;

public class LeetCode43Multiply {
    public String multiply(String num1, String num2) {
        int[] nums = new int[num1.length() + num2.length()];
        for (int i = num1.length() - 1; i >= 0; i--) {
            for (int j = num2.length() - 1; j >= 0; j--) {
                int pr = (num1.length() - 1 - i) + (num2.length() - 1 - j);
                int pl = pr + 1;
                int temp = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int valueR = nums[pr] + (temp % 10);
                int valueL = nums[pl] + temp / 10 + valueR / 10;
                nums[pr] = valueR % 10;
                nums[pl] = valueL % 10;
                if (valueL > 9) {
                    nums[pl + 1] = nums[pl + 1] + (valueL / 10);
                }
            }
        }
        String r = "";
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 0 && r.length() == 0)
                continue;
            r += nums[i];
        }
        return r;
    }
}
