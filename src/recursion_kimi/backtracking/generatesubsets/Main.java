package recursion_kimi.backtracking.generatesubsets;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Subsets subsets = new Subsets();
        int[] nums = {1,2};
        List<List<Integer>> subList  = subsets.subsets(nums);
        System.out.println(subList);
    }
}
