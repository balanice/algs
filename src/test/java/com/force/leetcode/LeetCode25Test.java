package com.force.leetcode;

import org.junit.jupiter.api.Test;

public class LeetCode25Test {
    
    @Test
    public void testReverse() {
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        ListNode tail = new ListNode(3);
        head.next.next = tail;
        LeetCode25ReverseKNodes.reverse(head, tail);
    }
}
