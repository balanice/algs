package com.force.leetcode;

/**
 * 21. 合并两个有序链表。
 * 将两个升序链表合并为一个新的 升序 链表并返回。
 * 新链表是通过拼接给定的两个链表的所有节点组成的。 
 */
public class LeetCode21 {
   
    public static ListNode mergetTwoSortedList(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode curNode = head;
        while (list1 != null || list2 != null) {
            if (list1 == null) {
                curNode.next = list2;
                break;
            }
            if (list2 == null) {
                curNode.next = list1;
                break;
            }
            if (list1.val < list2.val) {
                curNode.next = list1;
                list1 = list1.next;
                curNode = curNode.next;
            } else {
                curNode.next = list2;
                curNode = curNode.next;
                list2 = list2.next;
            }
        }
        return head.next;
    }
}
