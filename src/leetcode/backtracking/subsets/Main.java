package leetcode.backtracking.subsets;

public class Main {

    static void main() {
        Solution solution = new Solution();
        int[] nums ={1, 2, 3};
        /**
         * [[],[1],[1,2],[1,2,3],[1,3],[2],[2,3],[3]]
         * */
        System.out.println(solution.subsets(nums));
    }
}
