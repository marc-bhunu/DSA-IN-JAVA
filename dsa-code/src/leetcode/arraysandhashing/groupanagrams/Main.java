package leetcode.arraysandhashing.groupanagrams;

public class Main {
    static void main() {
        Solution solution = new Solution();
        String[] strings = {"ate", "eat", "tab", "bat", "tea", "cat", ""};
        System.out.println(solution.groupAnagrams(strings));
    }
}
