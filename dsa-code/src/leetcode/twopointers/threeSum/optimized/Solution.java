package leetcode.twopointers.threeSum.optimized;

import java.util.*;

public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for (int start = 0; start < nums.length; start++) {
            int left  = start + 1;
            int right = nums.length - 1;
            if (nums[start] > 0 ) break;
            if (start > 0  && nums[start] == nums[start - 1]) continue;
            while (left < right){
                int sum = nums[start]  + nums[left] + nums[right];
                if (sum == 0) {
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[start]);
                    triplet.add(nums[left]);
                    triplet.add(nums[right]);
                    set.add(triplet);
                    left++;
                    right--;
                }else if(sum > 0){
                    right--;
                }else{
                    left++;
                }
            }

        }
        return  new ArrayList<>(set);
    }
}
