package org.jubl.corp.problemroadmap.SortingTwoPointers;

import java.util.Arrays;

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int glen = 0, slen = 0;
        while (glen < g.length && slen < s.length) {
            if (g[glen] <= s[slen]) {
                count++;
                glen++;
                slen++;
            } else if (g[glen] > s[slen]) {
                slen++;
            } else  {
                glen++;
            }
        }
        return count;
    }
}
