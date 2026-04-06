package leetcode.arraysandhashing.groupanagrams;

import java.util.*;

public class Solution {

    public  List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String sortedString = sortString(strs[i]);
            if (map.containsKey(sortedString)) {
                List<String> currList = map.get(sortedString);
                currList.add(strs[i]);
                map.put(sortedString, currList);
            }else{
                map.put(sortedString, new ArrayList<>(Arrays.asList(strs[i])));
            }
        }
        return  new ArrayList<>(map.values());

    }

    private String sortString(String string){
        char[] stringArr = string.toCharArray();
        Arrays.sort(stringArr);
        return String.valueOf(stringArr);
    }

}
