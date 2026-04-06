package leetcode.arraysandhashing.containsduplicate;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(); //O(n)
        for (int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry: map.entrySet()){
            if (entry.getValue() > 1) {
                return true;
            }
        }
        return  false;
    }
}
