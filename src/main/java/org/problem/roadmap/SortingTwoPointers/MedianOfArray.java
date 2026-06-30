package org.problem.roadmap.SortingTwoPointers;

import java.util.Arrays;

public class MedianOfArray {
    /*
    3107. Minimum Operations to Make Median of Array Equal to K
    https://leetcode.com/problems/minimum-operations-to-make-median-of-array-equal-to-k/description/

    -----------------------Solution-------------------------------
    Sort nums. For odd-length arrays the median is nums[n/2].
    If median < k: increment elements from index n/2 upward while nums[i] < k.
    If median > k: decrement elements from index n/2 downward while nums[i] > k.
    Sum the absolute gaps — each +1 or -1 operation costs 1.

    Only elements on the median side of k need to change; the other half stays put.

    Time: O(n log n), Space: O(1)
     */
    public long minOperationsToMakeMedianK(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int median = nums[n / 2];
        long ans = 0;
        int start = n / 2;
        if (median < k) {
            while (start < n && nums[start] < k) {
                ans += k - nums[start];
                start++;
            }
        } else {
            while (start >= 0 && nums[start] > k) {
                ans += nums[start] - k;
                start--;
            }
        }
        return ans;
    }
}
