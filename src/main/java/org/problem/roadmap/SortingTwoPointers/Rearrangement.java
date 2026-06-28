package org.problem.roadmap.SortingTwoPointers;

import java.util.Arrays;

public class Rearrangement {
    /*
    1846. Maximum Element After Decreasing and Rearranging
    https://leetcode.com/problems/maximum-element-after-decreasing-and-rearranging/description/
     */
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        arr[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] > 1) {
                arr[i] = arr[i - 1] + 1;
            }
        }
        return arr[arr.length - 1];
    }
}
