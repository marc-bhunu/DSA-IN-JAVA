package leetcode.graphs.practice.q2;

public class Main {
    static void main() {
        char[][] islands = {
                {'1', '0'},
                {'0', '1'},
        };
        Solution solution = new Solution();
        System.out.println(solution.numIslands(islands));

    }
}
