package org.problem.roadmap.SortingTwoPointers;

import java.util.Arrays;

public class MedianOfArray {
    /*
    3107. Minimum Operations to Make Median of Array Equal to K
    https://leetcode.com/problems/minimum-operations-to-make-median-of-array-equal-to-k/description/
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
