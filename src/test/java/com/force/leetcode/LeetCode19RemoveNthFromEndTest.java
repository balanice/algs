package com.force.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeetCode19RemoveNthFromEndTest {
    @Test
    public void testRemove1() {
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);

        ListNode node = LeetCode19RemoveNthFromEnd.solution(head, 1);
        Assertions.assertNull(node.next.next);
    }

    @Test
    public void testRemove2() {
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);

        ListNode node = LeetCode19RemoveNthFromEnd.solution(head, 3);
        Assertions.assertEquals(1, node.val);
    }
}
