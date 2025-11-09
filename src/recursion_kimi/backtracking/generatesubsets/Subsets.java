package recursion_kimi.backtracking.generatesubsets;

import java.util.ArrayList;
import java.util.List;

class Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        subset(nums, current, result, 0);
        return result;
    }

    void subset(int[] nums, List<Integer> current, List<List<Integer>> result, int index) {
        result.add(new ArrayList<>(current));
        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);
            subset(nums,  current, result, i+1);
            current.remove(current.size() - 1);
        }
    }


}