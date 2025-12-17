package leetcode.graphs.numberofconnectedcomponents;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] edges = {{0,1}, {1,2}, {2,3}, {4,5}};
        System.out.println(solution.countComponents(6,edges));

    }
}
