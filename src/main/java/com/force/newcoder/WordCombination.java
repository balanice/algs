package com.force.newcoder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCombination {
    public void solution(String s) {
        List<String> list = new ArrayList<String>();
        Map<String, Integer> map = new HashMap<>();
        String lastWord = null;
        int leftIndex = -1, spaceIndex = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                if (leftIndex < 0) {
                    leftIndex = i;
                }
                continue;
            } else {
                String temp = null;
                if (leftIndex >= 0) {
                    temp = s.substring(leftIndex, i);
                    if (map.containsKey(temp)) {
                        map.put(temp, map.get(temp) + 1);
                    } else {
                        map.put(temp, 1);
                    }
                    leftIndex = -1;
                }
                if (spaceIndex > 0) {
                    if (temp != null) {
                        String combination = lastWord + " " + temp;
                        if (!list.contains(combination)) {
                            list.add(combination);
                        }
                        lastWord = temp;
                    } else {
                        lastWord = null;
                    }
                    spaceIndex = -1;
                } else {
                    if (c == ' ' && temp != null) {
                        spaceIndex = i;
                    }
                    lastWord = null;
                }
            }
        }
        if (leftIndex > 0) {
            String temp = s.substring(leftIndex);
            if (map.containsKey(temp)) {
                map.put(temp, map.get(temp) + 1);
            } else {
                map.put(temp, 1);
            }
            if (spaceIndex > 0) {
                String combination = lastWord + " " + temp;
                if (!list.contains(combination)) {
                    list.add(combination);
                }
            }
        }
        for (String ss : list) {
            System.out.println(ss);
        }
    }

    public static void main(String[] args) {
        String s = "hello world a hel. a world";
        new WordCombination().solution(s);
    }
}
