package leetcode.backtracking.subsets;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        helper( 0,nums, result, current);
        return result;
    }

    public void helper( int i,int[] nums, List<List<Integer>> result, List<Integer> current) {
        if (i >= nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[i]);

        helper(i + 1, nums, result, current);

        current.remove(current.size() - 1);

        helper(i + 1,nums, result, current);
    }
}
