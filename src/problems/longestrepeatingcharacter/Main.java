package problems.longestrepeatingcharacter;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        OptimalSolution optimalSolution = new OptimalSolution();
        System.out.println("Intuition " + solution.lengthOfLongestSubstring("abcabcbb"));
        System.out.println("Optimal Solution " + optimalSolution.lengthOfLongestSubstring("abcabcbb"));

    }
}
