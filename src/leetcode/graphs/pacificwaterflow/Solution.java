package leetcode.graphs.pacificwaterflow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<List<Integer>> pacificAtlantic(int[][] heights) {

        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        int rows = heights.length;
        int columns = heights[0].length;

        boolean[][] pacific =  new boolean[rows][columns];
        boolean[][] atlantic = new boolean[rows][columns];

        //TOP AND BOTTOM ROW
        for (int c = 0; c < columns; c++) {
            dfs(0, c, pacific, heights, directions, rows, columns);
            dfs(rows - 1, c, atlantic, heights, directions, rows, columns);
        }

        //LEFT AND RIGHT COLUMN
        for (int r = 0; r < rows; r++) {
            dfs(r, 0, pacific, heights, directions, rows, columns);
            dfs(r, columns - 1, atlantic, heights, directions, rows, columns);
        }

        List<List<Integer>> result = new ArrayList<>();
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                if (pacific[r][c] && atlantic[r][c]){
                    result.add(Arrays.asList(r,c));
                }
            }
        }
        return result;
    }


    private void dfs(int r, int c, boolean[][] visited, int[][] heights, int[][] directions, int rows, int columns) {
        visited[r][c] = true;
        for (int[] direction : directions) {
            int nr = r + direction[0];
            int nc = c + direction[1];

            if(nr < 0 || nc < 0 || nr >= rows || nc >= columns){
                continue;
            }

            if (visited[nr][nc]) {
                continue;
            }

            if (heights[nr][nc] < heights[r][c]) {
                continue;
            }

            dfs(nr, nc, visited, heights, directions, rows, columns);

        }
    }
}
