package leetcode.dynamicprogramming.longestincreasingsubsequence;

public class Main {

    static void main() {
        Solution solution = new Solution();
        int sol = solution.lengthOfLIS(new int[]{9,1,4,2,3,3,7});
        System.out.println(sol);
    }
}
