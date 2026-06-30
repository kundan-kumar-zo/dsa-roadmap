package org.problem.roadmap.hashing;

public class StringAndTwoPointers {
    /*
    1358. Number of Substrings Containing All Three Characters
    Given a string s consisting only of characters a, b and c.
    Return the number of substrings containing at least one occurrence of all these characters a, b and c.
    -----------------------Solution-------------------------------
    Sliding window with two pointers l and r.
    Expand r and track counts of 'a', 'b', 'c'. When all three counts are > 0,
    every substring starting at l and ending at r, r+1, …, n-1 is valid.
    Add (n - r) to ans, then shrink from the left by incrementing l.

    The inner while may shrink l multiple times per r, but each index moves
    at most once — overall O(n).

    Time: O(n), Space: O(1)
     */
    public int numberOfSubstrings(String s) {
        int[] abc = new int[3];
        int l = 0, r = 0;
        int ans = 0;
        char[] chars = s.toCharArray();
        while (l <= r && r < s.length()) {
            abc[chars[r] - 'a']++;
            while (abc[0] > 0 && abc[1] > 0 && abc[2] > 0) {
                ans += s.length() - r; // all extensions from r to end stay valid
                abc[chars[l] - 'a']--;
                l++;
            }
            r++;
        }
        return ans;
    }
    /*
    The power of the string is the maximum length of a non-empty substring that contains only one unique character.
    Given a string s, return the power of s.
    Leetcode 1446
    -----------------------Solution-------------------------------
    Single pass: group consecutive equal characters into runs.
    For each run, update ans with run length (cur - temp).
    Track the maximum run length seen.

    Example s="abbcccddddeeeeedcba":
      runs: a(1), b(2), c(3), d(4), e(5), … → answer = 5

    Time: O(n), Space: O(1)
     */

    public int maxPower(String s) {
        int cur = 0, ans = 0, temp = 0;
        while(cur < s.length()) {
            temp = cur; // start of current run
            while(cur < s.length() && s.charAt(cur) == s.charAt(temp)) {
                cur++;
            }
            ans = Math.max(ans, cur - temp);
        }
        return ans;
    }
}
