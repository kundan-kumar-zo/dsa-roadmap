package org.problem.roadmap.greedy;

public class ArrayIncreasingDecreasing {
    /*
    1827. Minimum Operations to Make the Array Increasing
    You are given an integer array nums (0-indexed). In one operation, you can choose an element of the array and increment it by 1.
    For example, if nums = [1,2,3], you can choose to increment nums[1] to make nums = [1,3,3].
    Return the minimum number of operations needed to make nums strictly increasing.
    An array nums is strictly increasing if nums[i] < nums[i+1] for all 0 <= i < nums.length - 1. An array of length 1 is trivially strictly increasing.
    Example 1:
    Input: nums = [1,1,1]
    Output: 3
    Explanation: You can do the following operations:
    1) Increment nums[2], so nums becomes [1,1,2].
    2) Increment nums[1], so nums becomes [1,2,2].
    3) Increment nums[2], so nums becomes [1,2,3].
    -----------------------Solution-------------------------------
    Greedy left-to-right: scan from index 1 and fix violations in place.
    If nums[i] <= nums[i-1], the minimum value for nums[i] is nums[i-1] + 1.
    Add (nums[i-1] + 1 - nums[i]) to ans and update nums[i].

    Why greedy works: earlier elements are already fixed at their smallest valid
    values, so raising nums[i] to the minimum needed never blocks a later fix.

    Example nums=[1,1,1]:
      i=1: nums[1] becomes 2, ans=1  → [1,2,1]
      i=2: nums[2] becomes 3, ans=3  → [1,2,3]

    Time: O(n), Space: O(1)
     */

    public int minOperations(int[] nums) {
        int ans = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i-1]) {
                ans += nums[i - 1] + 1 - nums[i]; // cost to reach minimum valid value
                nums[i] = nums[i-1] + 1;
            }
        }
        return ans;
    }
}
