package org.problem.roadmap.graph;

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
}
