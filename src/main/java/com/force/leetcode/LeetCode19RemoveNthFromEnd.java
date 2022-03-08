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

    /**
     * 使用快慢指针方法解题, 第一个指针比第二个指针快 n, 当第一个指针为 null 时，
     * 第二个指针刚好走到要删除节点的前一个
     */
    public static ListNode solution2(ListNode head, int n) {
        ListNode temp = new ListNode(0, head);
        ListNode first = head;
        ListNode second = temp;
        for (int i = 0; i < n; i++) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second = second.next.next;
        return temp.next;
    }
}
