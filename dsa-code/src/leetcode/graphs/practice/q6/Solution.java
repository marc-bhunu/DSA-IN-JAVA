package leetcode.graphs.practice.q6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<List<Integer>> pacificAtlantic(int[][] heights) {

        int rows = heights.length;
        int columns = heights[0].length;

        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        boolean[][] atlantic = new boolean[rows][columns];
        boolean[][] pacific = new boolean[rows][columns];

        //top and bottom rows
        for (int c = 0; c < columns; c++) {
            dfs(0, c, pacific, directions, heights, rows, columns);
            dfs(rows - 1, c, atlantic, directions, heights, rows, columns);
        }

        //left and right columns
        for (int r = 0; r < rows; r++) {
            dfs(r, 0, pacific, directions, heights, rows, columns);
            dfs(r, columns - 1, atlantic, directions, heights, rows, columns);
        }

        List<List<Integer>> result = new ArrayList<>();

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                if (atlantic[r][c] && pacific[r][c]) {
                    result.add(new ArrayList<>(Arrays.asList(r, c)));
                }
            }
        }

        return result;
    }

    private void dfs(int r, int c, boolean[][] visited, int[][] directions, int[][] heights, int rows, int columns) {
        visited[r][c] = true;

        for (int[] direction : directions) {
            int nr = direction[0] + r;
            int nc = direction[1] + c;

            if (nc < 0 || nr < 0 || nr >= rows || nc >= columns) {
                continue;
            }

            if (visited[nr][nc]) {
                continue;
            }

            if (heights[r][c] > heights[nr][nc]) {
                continue;
            }

            dfs(nr, nc, visited, directions, heights, rows, columns);
        }
    }
}
