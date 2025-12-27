package leetcode.longestconsequetivesequence;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int longestConsecutive(int[] nums) {
        int longestSequence = 0;
        Set<Integer> numSet = new HashSet<>();
        for(int num: nums){
            numSet.add(num);
        }
        for (int start : numSet){
            if (!numSet.contains(start - 1)) {
                int currentStreak  = 1;
                int currentNum = start;

                while(numSet.contains(currentNum + 1)){
                    currentStreak++;
                    currentNum++;
                }

                longestSequence = Math.max(longestSequence, currentStreak);

            }
        }
        return longestSequence;
    }
}
