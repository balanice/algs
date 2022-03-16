package com.force.leetcode;

public class LeetCode12IntToRoman {
    
    public static String intToRoman(int num) {
        StringBuilder builder = new StringBuilder();
        int[] intArray = new int[] {1000, 500, 100, 50, 10, 5, 1};
        String[] strArray = new String[] {"M", "D", "C", "L", "X", "V", "I"};
        for (int i = 0; i < intArray.length; i += 2) {
            int r = num / intArray[i];
            if (r >= 9) {
                builder.append(strArray[i]);
                builder.append(strArray[i - 2]);
            } else if (r >= 5) {
                builder.append(strArray[i - 1]);
                for (int j = 0; j < r - 5; j++) {
                    builder.append(strArray[i]);
                }
            } else if (r == 4) {
                builder.append(strArray[i]);
                builder.append(strArray[i - 1]);
            } else if (r > 0) {
                for (int j = 0; j < r; j++) {
                    builder.append(strArray[i]);
                }
            } else {
                continue;
            }
            num = num % intArray[i];
        }
        
        return builder.toString();
    }
}
