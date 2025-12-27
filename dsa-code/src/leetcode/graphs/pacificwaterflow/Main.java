package leetcode.graphs.pacificwaterflow;

public class Main {
    static void main() {
        int[][] heights = {
                {1, 2, 2},
                {3, 2, 3},
                {2, 4, 5}
        };

        Solution solution = new Solution();
        System.out.println(solution.pacificAtlantic(heights));
    }
}
