package leetcode.dynamicprogramming.longestincreasingsubsequence;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int sol = solution.lengthOfLIS(new int[]{0, 1, 0, 4, 6, 7, 3, 2, 1});
        System.out.println(sol);
    }
}
