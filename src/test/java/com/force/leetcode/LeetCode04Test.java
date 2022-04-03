package com.force.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeetCode04Test {

    @Test
    public void testMedian() {
        int[] arr1 = new int[] { 1, 2, 4, 5 };
        int[] arr2 = new int[] { 3 };
        Assertions.assertEquals(3.0, LeetCode04.findMedianSortedArrays(arr1, arr2));
    }

    @Test
    public void testMedian2() {
        int[] arr1 = new int[] { 1, 2, 4, 5 };
        int[] arr2 = new int[] { 3, 6 };
        Assertions.assertEquals(3.5, LeetCode04.findMedianSortedArrays(arr1, arr2));
    }

    @Test
    public void testMedian3() {
        int[] arr1 = new int[] { 1, 2, 4, 5 };
        int[] arr2 = new int[] {};
        Assertions.assertEquals(3.0, LeetCode04.findMedianSortedArrays(arr1, arr2));
    }

    @Test
    public void testMedian4() {
        int[] arr1 = new int[] { 1, 2, 4, 5 };
        int[] arr2 = new int[] { 1, 2, 4, 5 };
        Assertions.assertEquals(3.0, LeetCode04.findMedianSortedArrays(arr1, arr2));
    }
}
