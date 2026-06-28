package org.problem.roadmap.graph;

public class Islands {
    /*
    200. Number of islands
    https://leetcode.com/problems/number-of-islands/description/
     */
    public int numIslands(char[][] grid) {
        int m = grid.length, n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    travel(grid, i, j, visited);
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
