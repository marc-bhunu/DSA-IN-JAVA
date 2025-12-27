package leetcode.backtracking.combinationsum;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        helper(0, 0, result, new ArrayList<>(), candidates, target);
        return result;
    }

    private void  helper(int i, int total, List<List<Integer>> result, List<Integer> current, int[] candidates, int target){
        if (total == target) {
            result.add( new ArrayList<>(current));
            return;
        }
        if (total > target || i >= candidates.length) {
            return;
        }
        current.add(candidates[i]);
        helper(i, total + candidates[i], result, current, candidates, target);
        current.removeLast();
        helper(i + 1, total, result, current, candidates, target);
    }
}
