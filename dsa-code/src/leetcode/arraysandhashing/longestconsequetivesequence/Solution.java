package leetcode.arraysandhashing.longestconsequetivesequence;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int longestConsecutive(int[] nums) {
        int longestStreak = 0;
        Set<Integer> set = new HashSet<>();
        for(int num: nums) set.add(num);
        for(int num: set){
            int currStreak = 0;
            int currNum = num;
            while(set.contains(currNum)){
                currNum++;
                currStreak++;
            }

            longestStreak = Math.max(longestStreak, currStreak);
        }
        return longestStreak;
    }
}
