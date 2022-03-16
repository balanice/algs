package com.force.leetcode;

/**
 * 给你一个链表，每 k 个节点一组进行翻转，请你返回翻转后的链表。
 * k 是一个正整数，它的值小于或等于链表的长度。
 * 如果节点总数不是 k 的整数倍，那么请将最后剩余的节点保持原有顺序。
 *
 * 进阶：
 *   你可以设计一个只使用常数额外空间的算法来解决此问题吗？
 *   你不能只是单纯的改变节点内部的值，而是需要实际进行节点交换。
 */
public class LeetCode25ReverseKNodes {

    public static ListNode reverseKGroup(ListNode head, int k) {
        if (k <= 1) return head;
        var pre = new ListNode(0, head);
        int count = 0;
        var pHead = pre;
        while (head != null) {
            count++;
            if (count == k) {
                count = 0;
                var r = reverseList(pHead.next, head);
                pHead.next = r[0];
                pHead = r[1];
                head = pHead.next;
            } else {
                head = head.next;
            }
        }
        return pre.next;
    }


    public static ListNode[] reverseList(ListNode head, ListNode tail) {
        ListNode remain = tail.next;
        ListNode cur = head;
        while (cur != tail) {
            ListNode temp = cur.next;
            cur.next = remain;
            remain = cur;
            cur = temp;
        }
        cur.next = remain;
        
        return new ListNode[] {tail, head};
    }
}
