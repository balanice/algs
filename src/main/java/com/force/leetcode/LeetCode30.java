package com.force.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode30 {

    public List<Integer> findSubstring2(String s, String[] words) {
        List<Integer> r = new ArrayList<>();
        int n = words.length;
        int len = words[0].length();
        var map1 = new HashMap<String, Integer>();
        for (String word : words) {
            if (map1.containsKey(word)) {
                map1.put(word, map1.get(word) + 1);
            } else {
                map1.put(word, 1);
            }
        }
        for (int i = 0; i <= s.length() - n * len; i++) {
            var mapCount = new HashMap<String, Integer>();
            int j = 0;
            for (; j < n; j++) {
                var sub = s.substring(i + j * len, i + (j + 1) * len);
                if (!map1.containsKey(sub)) {
                    break;
                }
                if (mapCount.containsKey(sub)) {
                    mapCount.put(sub, mapCount.get(sub) + 1);
                } else {
                    mapCount.put(sub, 1);
                }
                if (mapCount.get(sub) > map1.get(sub)) {
                    break;
                }
            }
            if (j == n) {
                r.add(i);
            }
        }
        return r;
    }

    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> r = new ArrayList<>();
        List<String> subList = concat(words);
        int length = words.length * words[0].length();
        for (int i = 0; i <= s.length() - length; i++) {
            for (String sub : subList) {
                int j = 0;
                for (; j < sub.length(); j++) {
                    if (s.charAt(i + j) != sub.charAt(j)) {
                        break;
                    }
                }
                if (j == sub.length()) {
                    r.add(i);
                }
            }
        }
        return r;
    }

    public List<String> concat(String[] words) {
        boolean[] used = new boolean[words.length];
        List<String> list = new ArrayList<>();
        f(list, "", words, 0, used);
        return list;
    }

    /**
     *
     * @param shu  待选择的数组
     * @param targ 要选择多少个次
     * @param cur  当前选择的是第几次
     */
    private void f(List<String> list, String s, String[] words, int cur, boolean[] used) {
        if (cur == words.length) {
            if (!list.contains(s)) {
                list.add(s);
            }
        }
        for (int i = 0; i < words.length; i++) {
            if (used[i]) {
                continue;
            }
            used[i] = true;
            f(list, s + words[i], words, cur + 1, used);
            used[i] = false;
        }
    }
}
