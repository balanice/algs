package com.force.leetcode;

/**
 * 给你一个链表数组，每个链表都已经按升序排列。
 * 请你将所有链表合并到一个升序链表中，返回合并后的链表。
 * 
 * Solution:
 * 
 * L0   L1  L2  L3  L4  L5
 * L0----|  L2---|  L4---|
 * L0--------|      L4
 * L0----------------|
 * 
 */
public class LeetCode23MergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        int interval = 1;
        while (interval < lists.length) {
            for (int i = 0; i + interval < lists.length; i += interval * 2) {
                lists[i] = LeetCode21.mergetTwoSortedList(lists[i], lists[i + interval]);
            }
            interval *= 2;
        }
        return lists[0];
    }
}
