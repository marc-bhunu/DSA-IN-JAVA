package leetcode.graphs.numberofislands;

public class Main {

    static void main() {
        char[][] islands = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        Solution solution = new Solution();
        System.out.println(solution.numIslands(islands));
    }
}
