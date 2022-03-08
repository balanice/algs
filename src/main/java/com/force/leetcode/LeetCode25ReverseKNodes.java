package com.force.leetcode;

public class LeetCode25ReverseKNodes {
    public static void reverse(ListNode head, ListNode tail) {
        ListNode remain = tail.next;
        ListNode cur = head;
        while (cur != tail) {
            ListNode temp = cur.next;
            cur.next = remain;
            remain = cur;
            cur = temp;
            System.out.println(remain);
        }
    }
}
