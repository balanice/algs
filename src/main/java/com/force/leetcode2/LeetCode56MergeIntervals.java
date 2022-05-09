package com.force.leetcode2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LeetCode56MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        List<int[]> list = new ArrayList<>();
        list.add(intervals[0]);
        int j = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= intervals[j][0] && intervals[i][0] <= intervals[j][1]) {
                intervals[j][1] = Math.max(intervals[i][1], intervals[j][1]);
            } else {
                j++;
                intervals[j][0] = intervals[i][0];
                intervals[j][1] = intervals[i][1];
            }
        }
        return Arrays.copyOfRange(intervals, 0, j + 1);
    }
}
