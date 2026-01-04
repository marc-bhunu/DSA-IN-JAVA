package leetcode.tries.wordsearchII;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    int ROWS, COLS = 0;

    public List<String> findWords(char[][] board, String[] words) {
        List<String> result = new ArrayList<>();
        this.ROWS = board.length;
        this.COLS = board[0].length;
        for (String word : words) {
            boolean flag = false;
            for (int r = 0; r < ROWS && !flag; r++) {
                for (int c = 0; c < COLS; c++) {
                    if (board[r][c] != word.charAt(0)) continue;
                    if (helperDfs(board, r, c, word, 0)) {
                        result.add(word);
                        flag = true;
                        break;
                    }
                }
            }
        }
        return result;
    }

    private boolean helperDfs(char[][] board, int r, int c, String word, int index) {
        if (index == word.length()) {
            return true;
        }

        if (Math.min(r, c) < 0 || r >= ROWS || c >= COLS || board[r][c] != word.charAt(index)) {
            return false;
        }

        board[r][c] = '#';
        boolean ret =
                        helperDfs(board, r + 1, c, word, index + 1) ||
                        helperDfs(board, r - 1, c, word, index + 1) ||
                        helperDfs(board, r, c + 1, word, index + 1) ||
                        helperDfs(board, r, c - 1, word, index + 1);
        board[r][c] = word.charAt(index);
        return ret;
    }
}
