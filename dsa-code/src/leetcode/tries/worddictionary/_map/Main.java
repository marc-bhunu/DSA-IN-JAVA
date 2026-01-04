package leetcode.tries.worddictionary._map;

public class Main {
    static void main() {
        WordDictionary wordDictionary = new WordDictionary();
        wordDictionary.addWord("bad");
        wordDictionary.addWord("bat");
        wordDictionary.addWord("sort");
        wordDictionary.addWord("sox");
        System.out.println(wordDictionary.search(".prt"));
        wordDictionary.getMap();
    }
}
