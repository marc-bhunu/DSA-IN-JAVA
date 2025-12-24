package leetcode.graphs.practice.q3;

public class Main {
    static void main() {
        Solution solution = new Solution();
        int[][] edges = {{0,1}, {0,2}, {0,3},{1,4}};
        System.out.println(solution.validTree(5, edges));
    }
}
