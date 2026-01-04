package leetcode.tries.wordsearchII.optimized;


public class Main {
    static void main() {
        char[][] board = {
                {'a', 'b', 'c', 'd'},
                {'s', 'a', 'a', 't'},
                {'a', 'c', 'k', 'e'},
                {'a', 'c', 'd', 'n'}
        };
        String[] words = {"bat","cat","back","backend","stack"};
        Solution solution = new Solution();
        System.out.println(solution.findWords(board, words));

    }
}
