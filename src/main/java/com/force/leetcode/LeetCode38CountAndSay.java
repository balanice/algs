package com.force.leetcode;

public class LeetCode38CountAndSay {

    public String countAndSay(int n) {
        String r = "1";
        for (int i = 2; i <= n; i++) {
            StringBuilder builder = new StringBuilder();
            int count = 0;
            char last = '.';
            char c = '.';
            for (int j = 0; j < r.length(); j++) {
                c = r.charAt(j);
                if (c != last) {
                    if (last != '.') {
                        builder.append(count);
                        builder.append(last);
                    }
                    last = c;
                    count = 1;
                } else {
                    count++;
                }
            }
            builder.append(count);
            builder.append(c);
            r = builder.toString();
            System.out.println(r);
        }
        return r;
    }
}
