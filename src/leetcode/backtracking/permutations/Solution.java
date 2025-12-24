package leetcode.backtracking.permutations;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        helper(nums, result, new ArrayList<>());
        return result;
    }

    private void helper(int nums[], List<List<Integer>> result, List<Integer> current ){
        if (current.size() == nums.length ) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int num : nums){
            if (!current.contains(num)) {
                current.add(num);
                helper(nums, result, current);
                current.removeLast();
            }
        }
    }
}