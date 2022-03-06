package com.force.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode19RemoveNthFromEnd {
    public static ListNode solution(ListNode node, int n) {
        Map<Integer, ListNode> map = new HashMap<>();
        int index = 0;
        int size = 0;
        ListNode head = node;
        while (node != null) {
            size += 1;
            map.put(index++, node);
            node = node.next;
        }
        int indexToRemove = size - n;
        if (indexToRemove == 0) {
            return head.next;
        }
        map.get(indexToRemove - 1).next = map.get(indexToRemove).next;
        return head;
    }
}
