package leetcode.tries.implementprefixtrie.witharray;

public class Main {
    static void main() {
        Trie trie = new Trie();
        trie.insert("apple");
        trie.insert("app");

        System.out.println("Search 'apple': " + trie.search("apple"));   // true
        System.out.println("Search 'app': " + trie.search("app"));     // true
        System.out.println("Search 'bat': " + trie.search("bat"));     // false
        System.out.println("Starts with 'app': " + trie.startsWith("app")); // true
        System.out.println("Starts with 'bat': " + trie.startsWith("bat")); // false
    }
}
