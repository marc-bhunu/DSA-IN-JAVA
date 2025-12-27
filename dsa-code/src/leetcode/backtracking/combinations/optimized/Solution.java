package leetcode.backtracking.combinations.optimized;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> combine(int n, int k) {
        List<Integer> current = new ArrayList<>();
        List<List<Integer>>  result = new ArrayList<>();
        helper(1, n, k, current, result);
        return result;
    }


    private void helper(int index, int n, int k, List<Integer> current, List<List<Integer>> result){
        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (index > n) return;

        for (int j = index; j < n + 1; j++) {
            current.add(j);
            helper(j + 1, n, k, current, result);
            current.removeLast();
        }


    }
}
