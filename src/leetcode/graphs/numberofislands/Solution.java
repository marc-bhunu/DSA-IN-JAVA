package leetcode.graphs.numberofislands;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Solution {

    public int numIslands(char[][] grid) {
        int numberOfIslands = 0;
        int rows = grid.length;
        int columns = grid[0].length;
        Set<String> visited = new HashSet<>();
        int[][] directions = {{1, 0}, {-1, 0}, {0,1}, {0, -1}};
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                if (grid[r][c] == '1' && !visited.contains(r +","+ c)) {
                    numberOfIslands++;
                    bfs(grid, r, c, visited, directions, rows, columns);
                }
            }
        }
        return  numberOfIslands;
    }

    private void bfs(char[][] grid, int r, int c, Set<String> visited, int[][] directions, int rows, int cols){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{r, c});
        visited.add(r+","+c);
        while(!queue.isEmpty()){
            int[] point = queue.poll();
            int row = point[0], col = point[1];
            for (int[] direction: directions){
                int nr = row + direction[0], nc = col + direction[1];
                if (nr >= 0 && nr < rows && nc >= 0 && nc < cols && grid[nr][nc] =='1' && !visited.contains(nr+","+nc)) {
                    queue.add(new int[]{nr, nc});
                    visited.add(nr+","+nc);
                }
            }

        }
    }

}
