package leetcode.threeSum;

import java.util.*;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> store = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++){
            int left = i + 1;
            int right = nums.length - 1;
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    List<Integer> triplet  = Arrays.asList(nums[i], nums[left], nums[right]);
                    store.add(triplet);
                    left++;
                    right--;
                }else if (sum > 0) {
                    right--;
                }else{
                    left++;
                }
            }
        }

        return  new ArrayList<>(store);
    }
}
