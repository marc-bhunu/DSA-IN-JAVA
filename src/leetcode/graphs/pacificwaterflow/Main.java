package leetcode.graphs.pacificwaterflow;

public class Main {
    static void main() {
        int[][] heights = {
                {1, 2, 2, 3, 5},
                {3, 2, 3, 4, 4},
                {2, 4, 5, 3, 1},
                {6, 7, 1, 4, 5},
                {5, 1, 1, 2, 4}
        };
        Solution solution = new Solution();
        System.out.println(solution.pacificAtlantic(heights));
    }
}
