package leetcode.stack.validparanthesis;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (Character ch : s.toCharArray()) {
            if (ch.equals('(') || ch.equals('{') || ch.equals('[')) {
                stack.push(ch);
            } else if (ch.equals(')')) {
                if ( stack.pop() != '(') {
                    return false;
                }
            } else if (ch.equals('}')) {
                if ( stack.pop() != '{') {
                    return false;
                }
            }
            else if (ch.equals(']')) {
                if ( stack.pop() != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
