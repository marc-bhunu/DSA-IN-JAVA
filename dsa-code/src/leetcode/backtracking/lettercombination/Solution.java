package leetcode.backtracking.lettercombination;

import java.util.*;

public class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        map.put("2", "abc");
        map.put("3", "def");
        map.put("4", "ghi");
        map.put("5", "jkl");
        map.put("6", "mno");
        map.put("7", "pqrs");
        map.put("8", "tuv");
        map.put("9", "wxyz");
        System.out.println(map);
        helper(0 , digits, new StringBuilder(), result, map);
        return result;
    }

    private void helper(int i, String digits, StringBuilder stringBuilder, List<String> result, Map<String, String> map) {
        if (i == digits.length()) {
            result.add(stringBuilder.toString());
            return;
        }

        String digit = String.valueOf(digits.charAt(i));
        String letters = map.get(digit);

        for (char letter : letters.toCharArray()) {
            stringBuilder.append(letter);
            helper(i + 1, digits, stringBuilder, result, map);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }


}
