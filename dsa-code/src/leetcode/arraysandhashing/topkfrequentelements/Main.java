package leetcode.arraysandhashing.topkfrequentelements;

import java.util.Arrays;

public class Main {
    static void main() {
        Solution solution = new Solution();
        int[] nums = {1,2,2,3,3,3};
        System.out.println(Arrays.toString(solution.topKFrequent(nums, 2)));
    }
}
