package org.problem.roadmap.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
    207. Course Schedule
    https://leetcode.com/problems/course-schedule/description/
 */
public class CourseScheduling {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (var arr : prerequisites) {
            if (!graph.containsKey(arr[0])) {
                graph.put(arr[0], new ArrayList<>());
            }
            graph.get(arr[0]).add(arr[1]);
        }
        boolean done[] = new boolean[numCourses];
        boolean visited[] = new boolean[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (detectCycle(i, visited, graph, done)) {
                return false;
            }
        }
        return true;
    }

    private boolean detectCycle(int node, boolean[] visited, Map<Integer, List<Integer>> graph, boolean done[]) {
        if (!graph.containsKey(node)) {
            return false;
        }
        if (done[node]) {
            return false;
        }
        visited[node] = true;
        boolean res = false;
        for (int num : graph.get(node)) {
            if (num == node || visited[num]) {
                return true;
            }
            res = res || detectCycle(num, visited, graph, done);
        }
        visited[node] = false;
        done[node] = true;
        return res;
    }
}
