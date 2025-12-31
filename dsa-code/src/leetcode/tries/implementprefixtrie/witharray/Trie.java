package leetcode.tries.implementprefixtrie.witharray;

public class Trie {

    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isWord = false;
    }

    private final TrieNode root;


    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode currNode = root;
        for (char currChar : word.toCharArray()) {
            int index  = currChar -'a';
            if (currNode.children[index] == null) {
                currNode.children[index]  = new TrieNode();
            }
            currNode = currNode.children[index];
        }
        currNode.isWord = true;
    }

    public boolean search(String word) {
        TrieNode currNode =  root;
        for (char currChar: word.toCharArray()){
            int index = currChar - 'a';
            if (currNode.children[index] == null) {
                return false;
            }
            currNode = currNode.children[index];
        }
        return true;
    }

    public boolean startsWith(String prefix) {
        TrieNode currNode =  root;
        for (char currChar: prefix.toCharArray()){
            int index = currChar - 'a';
            if (currNode.children[index] == null) {
                return false;
            }
            currNode = currNode.children[index];
        }
        return true;
    }


}

