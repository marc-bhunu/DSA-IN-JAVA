package leetcode.graphs.practice.q4;



public class Main {
    static void main() {
        Solution solution = new Solution();
        int[][] prerequisites = {{1,0}, {0, 1}};
        System.out.println(solution.canFinish(2,prerequisites));
    }
}
