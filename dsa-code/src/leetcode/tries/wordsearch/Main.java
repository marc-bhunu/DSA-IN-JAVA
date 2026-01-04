package leetcode.tries.wordsearch;

public class Main {
    static void main() {
        char[][] board = {
                {'A', 'B', 'C', 'D'},
                {'S', 'A', 'A', 'T'},
                {'A', 'C', 'A', 'E'}
        };
        Solution solution = new Solution();
        System.out.println(solution.exist(board, "CAT"));
    }
}
