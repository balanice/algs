package com.force.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode49GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, Integer> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if (map.containsKey(key)) {
                result.get(map.get(key)).add(s);
            } else {
                map.put(key, result.size());
                List<String> l = new ArrayList<>();
                l.add(s);
                result.add(l);
            }
        }
        return result;
    }
}
