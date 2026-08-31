package leetcode.graphs.courseshedule;

public class Main {
   public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] prerequisites = {{1,0}};
        System.out.println(solution.canFinish(2,prerequisites));
    }
}
