package leetcode.groupanagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            String sortedString = getCanonicalKey(str);
            map.computeIfAbsent(sortedString, _ -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }

    private static String getCanonicalKey(String str) {
        int[] arr = new int[26];
        for (char c : str.toCharArray()) arr[c - 'a']++;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sb.append((char) ('a' + i));
                sb.append("#");
                sb.append(arr[i]);
                sb.append("#");
            }

        }
        return sb.toString();
    }


    static void main() {
        String[] str = {"ant", "tan", "ate", "eat", "bat"};
        List<List<String>> res = groupAnagrams(str);
        System.out.println(res);
    }
}
