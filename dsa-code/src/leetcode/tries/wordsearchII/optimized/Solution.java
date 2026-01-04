package leetcode.tries.wordsearchII.optimized;

import java.util.*;

public class Solution {
    int ROWS, COLS;
    TrieNode root = new TrieNode();
    Set<String> visited = new HashSet<>();
    Set<String> result = new HashSet<>();

    public List<String> findWords(char[][] board, String[] words) {
        generateTrie(words);
        this.ROWS = board.length;
        this.COLS = board[0].length;
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                dfsHelper(board, r, c, root, "");
            }
        }
        return new ArrayList<>(result);
    }

    private void dfsHelper(char[][] board, int r, int c, TrieNode root, String s) {
        if (r < 0 || c < 0 || r >= ROWS || c >= COLS || visited.contains(r + "," + c) || !root.children.containsKey(board[r][c])) {
            return;
        }
        visited.add(r + "," + c);
        root = root.children.get(board[r][c]);
        s += board[r][c];
        if (root.isWord) {
            result.add(s);
        }
        dfsHelper(board, r + 1, c, root, s);
        dfsHelper(board, r - 1, c, root, s);
        dfsHelper(board, r, c + 1, root, s);
        dfsHelper(board, r, c - 1, root, s);
        visited.remove(r + "," + c);
    }

    private void generateTrie(String[] words) {
        for (String word : words) {
            TrieNode currNode = root;
            for (Character ch : word.toCharArray()) {
                if (!currNode.children.containsKey(ch)) {
                    currNode.children.put(ch, new TrieNode());
                }
                currNode = currNode.children.get(ch);
            }
            currNode.isWord = true;
        }
    }


    static class TrieNode {
        Map<Character, TrieNode> children = new HashMap<>();
        boolean isWord = false;
    }
}
