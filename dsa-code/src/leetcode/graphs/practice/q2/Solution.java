package leetcode.graphs.practice.q2;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Solution {

    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int columns = grid[0].length;
        int islands = 0;
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        Set<String> visited = new HashSet<>();
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                if (grid[r][c] == '1' && !visited.contains(r + "," + c)) {
                    islands++;
                    bfsHelper(r, c, directions, grid, rows, columns, visited);
                }
            }
        }
        return islands;
    }

    private void bfsHelper(int r, int c, int[][] directions, char[][] grid, int rows, int columns, Set<String> visited) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{r, c});
        visited.add(r + "," + c);

        while (!queue.isEmpty()) {
            int[] position = queue.poll();
            int row = position[0];
            int column = position[1];
            for (int[] direction : directions) {
                int nr = row + direction[0];
                int nc = column + direction[1];
                if (nc >= 0 && nc < columns && nr >= 0 && nr < rows && grid[nr][nc] == '1' && !visited.contains(nr + "," + nc)) {
                    queue.add(new int[]{nr, nc});
                    visited.add(nr + "," + nc);
                }
            }
        }

    }
}
