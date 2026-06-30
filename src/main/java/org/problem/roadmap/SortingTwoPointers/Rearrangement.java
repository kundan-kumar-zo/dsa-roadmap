package org.problem.roadmap.SortingTwoPointers;

import java.util.Arrays;

public class Rearrangement {
    /*
    1846. Maximum Element After Decreasing and Rearranging
    https://leetcode.com/problems/maximum-element-after-decreasing-and-rearranging/description/

    -----------------------Solution-------------------------------
    Sort the array (rearranging is free). Set arr[0] = 1 — smallest valid positive value.
    Greedy left-to-right: enforce arr[i] - arr[i-1] <= 1 by capping arr[i] to arr[i-1] + 1
    when the gap is larger. Decreasing is free, so always cap down, never up.

    This maximizes the final element while keeping adjacent difference <= 1.

    Example arr=[3,2,1,2,1,7]:
      sorted → [1,1,2,2,3,7] → after greedy → [1,1,2,2,3,4] → answer = 4

    Time: O(n log n), Space: O(1)
     */
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        arr[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] > 1) {
                arr[i] = arr[i - 1] + 1; // cap to satisfy adjacent difference constraint
            }
        }
        return arr[arr.length - 1];
    }
}
