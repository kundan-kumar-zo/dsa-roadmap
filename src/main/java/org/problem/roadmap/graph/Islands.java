package org.problem.roadmap.graph;

import java.util.*;

public class Islands {
    /*
    200. Number of islands
    https://leetcode.com/problems/number-of-islands/description/

    -----------------------Solution-------------------------------
    DFS flood fill: scan every cell. When an unvisited '1' is found, run DFS to mark
    the entire connected land component as visited and increment the island count.

    DFS explores all 4 neighbors (up, down, left, right) and returns on water,
    out-of-bounds, or already visited cells.

    Time: O(m * n), Space: O(m * n) for visited (or O(m * n) recursion stack)
     */
    public int numIslands(char[][] grid) {
        int m = grid.length, n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    travel(grid, i, j, visited); // mark entire island
                    count++;
                }
            }
        }
        return count;
    }

    private void travel(char[][] grid, int i, int j, boolean[][] visited) {
        if (i >= grid.length || i < 0 || j >= grid[0].length || j < 0 || visited[i][j] || grid[i][j] == '0') {
            return;
        }
        visited[i][j] = true;
        travel(grid, i - 1, j, visited);
        travel(grid, i + 1, j, visited);
        travel(grid, i, j - 1, visited);
        travel(grid, i, j + 1, visited);
    }
    public int findMaxPathScore(int[][] edges, boolean[] online, long k) {
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for (var edge : edges) {
            if (online[edge[0]]) {
                graph.computeIfAbsent(edge[0], p -> new ArrayList<>());
                if (online[edge[1]]) {
                    graph.get(edge[0]).add(new int[]{edge[1], edge[2]});
                }
            }
        }
        PriorityQueue<int[]> dqueue = new PriorityQueue<>();
        int n = online.length;
        int[] minDistance = new int[n];
        boolean[] visited = new boolean[n];
        Arrays.fill(minDistance, Integer.MAX_VALUE);
        Queue<Integer> tQueue = new LinkedList<>();
        tQueue.offer(0);
        minDistance[0] = 0;
        while (!tQueue.isEmpty()) {
            int node = tQueue.poll();
            if (!visited[node]) {
                visited[node] = true;
                for (int[] arr : graph.get(node)) {
                    minDistance[arr[0]] = Math.min(minDistance[arr[0]], minDistance[node] + arr[1]);
                    tQueue.offer(arr[0]);
                }
            }
        }
        System.out.println(minDistance[n-1]);
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        return queue.isEmpty() ? -1 : queue.peek();
    }
    private void travel(Map<Integer, List<int[]>> graph, int node, boolean[] visited,
                        int cost, PriorityQueue<Integer> queue, int minCost, long k) {
        if (visited[node]) {
            return;
        }
        if (node == visited.length - 1 && k >= 0) {
            queue.offer(minCost);
        }
        visited[node] = true;
        List<int[]> list = graph.get(node);
        for (int[] arr : list) {
            travel(graph, arr[0], visited, arr[1], queue, Math.min(minCost, arr[1]), k - arr[1]);
        }
        visited[node] = false;
    }

    public int minScore(int n, int[][] roads) {
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for (int[] road : roads) {
            graph.computeIfAbsent(road[0], p -> new ArrayList<>()).add(new int[] {road[1], road[2]});
            graph.computeIfAbsent(road[1], p -> new ArrayList<>()).add(new int[] {road[0], road[2]});
        }
        boolean[] visited = new boolean[n+1];
        PriorityQueue<int[]> tQueue = new PriorityQueue<>(Comparator.comparingInt(arr -> arr[1]));
        tQueue.offer(new int[]{1, 0});
        int ans = Integer.MAX_VALUE;
        while (!tQueue.isEmpty()) {
            int[] node = tQueue.poll();
            if (!visited[node[0]]) {
                visited[node[0]] = true;
                for (int[] arr : graph.get(node[0])) {
                    ans = Math.min(ans, arr[1]);
                    tQueue.offer(new int[]{arr[0], arr[1]});
                }
            }
        }
        return ans;
    }
}
