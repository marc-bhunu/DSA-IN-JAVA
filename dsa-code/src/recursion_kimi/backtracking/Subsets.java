package recursion_kimi.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Subsets {

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        subset(nums, current, result, 0);
        return result;
    }

    static  void subset(int[] nums, List<Integer> current, List<List<Integer>> result, int index){
        result.add(new ArrayList<>(current));
        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);
            subset(nums, current, result, i+ 1);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr ={1,2};
        System.out.println(subsets(arr));
    }


}