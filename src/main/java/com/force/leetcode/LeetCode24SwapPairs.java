package com.force.leetcode;

/**
 * 给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。
 * 你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）。
 * 
 * 输入：head = [1,2,3,4]
 * 输出：[2,1,4,3]
 */
public class LeetCode24SwapPairs {
    public static ListNode solution(ListNode head) {
        ListNode temp = new ListNode(0, head);
        ListNode cur = temp;
        while (cur.next != null && cur.next.next != null) {
            ListNode t2 = cur.next;
            ListNode t1 = cur.next.next;
            cur.next = t1;
            t2.next = t1.next;
            t1.next = t2;
            cur = t2;
        }
        return temp.next;
    }
}
