package leetcode.backtracking.combinationsum;

public class Main {
    static void main() {
        Solution solution = new Solution();
        int [] candidates = {1, 2, 3, 6, 7};
        System.out.println(solution.combinationSum(candidates, 7));
    }
}
