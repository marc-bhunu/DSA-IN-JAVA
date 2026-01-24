package leetcode.backtracking.lettercombination;

import java.util.*;

public class Solution {
    private final List<String> result = new ArrayList<>();
    private final Map<String, String> map = new HashMap<>();
    public List<String> letterCombinations(String digits) {
        map.put("2", "abc");
        map.put("3", "def");
        map.put("4", "ghi");
        map.put("5", "jkl");
        map.put("6", "mno");
        map.put("7", "pqrs");
        map.put("8", "tuv");
        map.put("9", "wxyz");
        helper(0 , digits, new StringBuilder());
        return result;
    }

    private void helper(int i, String digits, StringBuilder stringBuilder) {
        if (i == digits.length()) {
            result.add(stringBuilder.toString());
            return;
        }

        String digit = String.valueOf(digits.charAt(i));
        String letters = map.get(digit);

        for (char letter : letters.toCharArray()) {
            stringBuilder.append(letter);
            helper(i + 1, digits, stringBuilder);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }


}
