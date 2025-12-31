package leetcode.tries.implementprefixtrie;

public class Main {

    static void main() {
        Trie trie = new Trie();
        trie.insert("apple");
        trie.insert("ape");
        trie.insert("aid");
        trie.insert("banana");
        trie.insert("bone");
        trie.insert("bones");

        System.out.println("Found Apple :" +trie.search("apple"));
        System.out.println("Found bones :" +trie.search("bones"));
        System.out.println("Found aid :" +trie.search("aid"));
        System.out.println("Found invalid :" +trie.search("invalid"));

        System.out.println("Starts with :"+ trie.startsWith("ap"));
    }
}
