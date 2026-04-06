package leetcode.arraysandhashing.validanagram;

import java.util.Arrays;

public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() !=  t.length()) return false;
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        String tString = String.valueOf(tArray);
        String sString = String.valueOf(sArray);
        return  tString.equals(sString) ;
    }
}
