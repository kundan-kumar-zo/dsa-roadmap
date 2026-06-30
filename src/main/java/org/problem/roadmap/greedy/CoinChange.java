package org.problem.roadmap.greedy;

public class CoinChange {

    /*
    Leetcode 377
    Given an array of distinct integers nums and a target integer target, return the number of possible combinations that add up to target.
    The test cases are generated so that the answer can fit in a 32-bit integer.
    Example 1:
    Input: nums = [1,2,3], target = 4
    Output: 7
    Explanation:
    The possible combination ways are:
    (1, 1, 1, 1)
    (1, 1, 2)
    (1, 2, 1)
    (1, 3)
    (2, 1, 1)
    (2, 2)
    (3, 1)
    Note that different sequences are counted as different combinations.
    -----------------------Solution-------------------------------
    DP: res[i] = number of ordered sequences that sum to i.
    Base case: res[0] = 1 (one way to make sum 0 — use nothing).

    Loop order matters: outer loop over target (1..target), inner loop over nums.
    For each sum i, try appending each num as the LAST element of a sequence.
    If we pick num, every sequence that sums to (i - num) can be extended by num,
    so res[i] += res[i - num].

    Example nums=[1,2,3], target=4:
      i=1: res[1]=1  (only [1])
      i=2: res[2]=2  ([1,1], [2])
      i=3: res[3]=4  ([1,1,1], [1,2], [2,1], [3])
      i=4: res[4]=7

    Time: O(target * n), Space: O(target)
     */
    public int combinationSum4(int[] nums, int target) {
        int[] res = new int[target + 1];
        res[0] = 1; // one way to reach sum 0
        for (int i = 1; i <= target; i++) {
            for (int num : nums) {
                if (i >= num) {
                    res[i] += res[i - num]; // extend every sequence summing to (i - num)
                }
            }
        }
        return  res[target];
    }

    /*
    Leetcode 518 — Coin Change II
    https://leetcode.com/problems/coin-change-ii/
    Given coins of different denominations and a total amount, return the number of
    combinations that make up that amount. Each coin can be used unlimited times.
    Order does NOT matter: {1,2} and {2,1} count as the same combination.

    -----------------------Solution-------------------------------
    DP: dp[i] = number of unordered combinations that sum to i.
    Base case: dp[0] = 1 (one way to make amount 0).

    Loop order matters: outer loop over coins, inner loop over amount (coin..amount).
    Processing one coin at a time avoids counting permutations — each combination
    is built in a fixed coin order, so {2,1} is never counted separately from {1,2}.
    For each coin, dp[i] += dp[i - coin] means "add ways that use this coin at least once."

    Example coins=[1,2,5], amount=5:
      after coin 1: dp = [1,1,1,1,1,1]
      after coin 2: dp = [1,1,2,2,3,3]  (e.g. dp[3]=2 via 1+1+1 and 1+2)
      after coin 5: dp = [1,1,2,2,3,4]

    Time: O(amount * k), Space: O(amount)  where k = number of coin types
     */

    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1; // one way to reach amount 0
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] += dp[i - coin]; // add combinations that include current coin
            }
        }
        return  dp[amount];
    }
}
