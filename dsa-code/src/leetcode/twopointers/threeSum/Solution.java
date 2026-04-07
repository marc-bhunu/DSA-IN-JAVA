package leetcode.twopointers.threeSum;

import java.util.*;

public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> store = new HashSet<>();
        Arrays.sort(nums);
        for (int start = 0; start < nums.length; start++) {
            int left = start + 1;
            int right = nums.length - 1;
            if (nums[start] > 0) break;
            if (start > 0 && nums[start] == nums[start - 1]) continue;
            while (left < right) {
                int sum = nums[start] + nums[left] + nums[right];
                if (sum == 0) {
                    List<Integer> newTriplet = new ArrayList<>();
                    newTriplet.add(nums[start]);
                    newTriplet.add(nums[left]);
                    newTriplet.add(nums[right]);
                    store.add(newTriplet);
                    left++;
                    right--;

                } else if (sum > 0) {
                    right--;
                }else{
                    left++;
                }
            }
        }
        return new ArrayList<>(store);
    }
}
