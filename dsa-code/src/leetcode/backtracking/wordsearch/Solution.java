package leetcode.backtracking.wordsearch;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    int ROWS, COLS;
    Set<String> visited = new HashSet<>();

    public boolean exist(char[][] board, String word) {
        this.ROWS = board.length;
        this.COLS = board[0].length;

        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                if (dfsHelper(r, c, board, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfsHelper(int r, int c, char[][] board, String word, int index) {
        if (index == word.length()) {
            return true;
        }

        if (Math.min(r, c) < 0 || r == ROWS || c == COLS || board[r][c] != word.charAt(index) || visited.contains(r + "," + c)) {
            return false;
        }

        visited.add(r + "," + c);
        boolean result = dfsHelper(r + 1, c, board, word, index + 1) ||
                dfsHelper(r - 1, c, board, word, index + 1) ||
                dfsHelper(r, c + 1, board, word, index + 1) ||
                dfsHelper(r, c - 1, board, word, index + 1);
        visited.remove(r + "," + c);

        return result;
    }


}
