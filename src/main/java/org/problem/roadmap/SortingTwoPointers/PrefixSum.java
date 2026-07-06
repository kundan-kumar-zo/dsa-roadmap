package org.problem.roadmap.SortingTwoPointers;

import java.util.HashMap;
import java.util.Map;

public class PrefixSum {
    /*
    Leetcode: 560
    Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

    A subarray is a contiguous non-empty sequence of elements within an array.

    Example 1:

    Input: nums = [1,1,1], k = 2
    Output: 2
    Example 2:

    Input: nums = [1,2,3], k = 3
    Output: 2

    Constraints:

    1 <= nums.length <= 2 * 104
    -1000 <= nums[i] <= 1000
    -107 <= k <= 107

     */
    public int subarraySum(int[] nums, int k) {
        int len = nums.length;
        int ans = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            sum += nums[i];
            if (sum == k) {
                ans++;
            }
            ans += map.getOrDefault(sum - k, 0);
            map.merge(sum, 1, Integer::sum);
        }
        return  ans;
    }

    /*
        Leetcode: 523
        Given an integer array nums and an integer k, return true if nums has a good subarray or false otherwise.

        A good subarray is a subarray where:

        its length is at least two, and
        the sum of the elements of the subarray is a multiple of k.
        Note that:

        A subarray is a contiguous part of the array.
        An integer x is a multiple of k if there exists an integer n such that x = n * k. 0 is always a multiple of k.

        Example 1:

        Input: nums = [23,2,4,6,7], k = 6
        Output: true
        Explanation: [2, 4] is a continuous subarray of size 2 whose elements sum up to 6.
        Example 2:

        Input: nums = [23,2,6,4,7], k = 6
        Output: true
        Explanation: [23, 2, 6, 4, 7] is an continuous subarray of size 5 whose elements sum up to 42.
        42 is a multiple of 6 because 42 = 7 * 6 and 7 is an integer.
        Example 3:

        Input: nums = [23,2,6,4,7], k = 13
        Output: false
     */

    public boolean checkSubarraySum(int[] nums, int k) {
        if (nums.length < 2) return  false;
        if (k == 1) return  true;
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            int mod = sum%k;
            if (map.containsKey(mod)) {
                if (i - map.get(mod) >= 2) {
                    return  true;
                }
            } else  {
                map.put(mod, i);
            }
        }
        return  false;
    }
}
