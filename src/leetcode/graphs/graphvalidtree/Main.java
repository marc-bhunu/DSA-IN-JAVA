package leetcode.graphs.graphvalidtree;

public class Main {
    static void main() {
        /*
        * n = 5
        * edges = [[0, 1], [0, 2], [0, 3], [1, 4]]
        * true
        * */

        /*
        *n=5
        *edges=[[0,1],[1,2],[2,3],[1,3],[1,4]]
        * int[][] edges = {{0,1}, {1,2}, {2,3}, {1,3}, {1,4}};
        * false
         * */

       /** Solution solution = new Solution();
        System.out.println(solution.validTree(5,edges));
         * */

        int[][] edges = {{0,1}, {0,2}, {0,3},{1,4}};
        BFS bfs = new BFS();
        System.out.println(bfs.validTree(5, edges));
    }
}
