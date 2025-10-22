package leetcode.firstuniquechar;

import java.util.*;

public class Solution {

    public Character firstuniquechar(String str) {
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : map.keySet()) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }
        return null;
    }

}
// count the number of characters that are in a string using a hashmap
// we iterate throgh the keys and access each and every value that is in the map
// and check if that value == 1
// if its equal to 1 we retrun it
// Time Complexity --> O(2N) = O(N) + O(N)
// --> O(N)
// Space Complexity --> O(N)