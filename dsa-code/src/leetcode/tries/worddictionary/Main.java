package leetcode.tries.worddictionary;

public class Main {
    static void main() {
        WordDictionary wordDictionary = new WordDictionary();
        wordDictionary.addWord("bad");
        wordDictionary.addWord("bat");
        wordDictionary.addWord("fat");
        wordDictionary.addWord("fast");
        wordDictionary.addWord("father");
        System.out.println(wordDictionary.search(".as"));
    }
}
