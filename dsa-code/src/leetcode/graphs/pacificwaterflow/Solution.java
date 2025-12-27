package leetcode.graphs.pacificwaterflow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        int rows = heights.length;
        int columns = heights[0].length;
        boolean[][] atlantic = new boolean[rows][columns];
        boolean[][] pacific =  new boolean[rows][columns];


        for (int c = 0; c < columns; c++) {
            dfs(0, c, pacific , directions, heights, rows, columns);
            dfs(rows - 1, c,atlantic ,directions, heights, rows, columns);
        }


        for (int r = 0; r < rows; r++) {
            dfs(r, 0, pacific ,directions, heights, rows, columns);
            dfs(r, columns - 1, atlantic, directions, heights, rows, columns);
        }


        List<List<Integer>> results = new ArrayList<>();

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                if (pacific[r][c] && atlantic[r][c]) {
                    results.add(Arrays.asList(r,c));
                }
            }
        }

        return results;
    }

    private void dfs(int r, int c, boolean[][] visited,  int[][] directions, int[][] heights, int rows, int columns){
        visited[r][c] = true;


        for (int[] direction: directions) {
            int nr  = r + direction[0];
            int nc  = c + direction[1];

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
