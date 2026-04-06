package leetcode.arraysandhashing.groupanagrams.optimized;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str: strs){
            String key = getCononicalString(str);
            map.computeIfAbsent(key, _ -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }

    private String getCononicalString(String str){
        int[] count = new int[26];
        for(char c: str.toCharArray()) count[c - 'a']++;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                stringBuilder.append((char)('a' + i));
                stringBuilder.append("#");
                stringBuilder.append(count[i]);
                stringBuilder.append("#");
            }
        }
        return stringBuilder.toString();
    }
}
