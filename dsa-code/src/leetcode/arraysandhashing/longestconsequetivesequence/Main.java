package leetcode.arraysandhashing.longestconsequetivesequence;


public class Main {

    static void main() {
        Solution solution = new Solution();
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        int result = solution.longestConsecutive(nums);
        System.out.println(result);
    }
}
