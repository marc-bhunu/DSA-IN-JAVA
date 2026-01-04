package leetcode.tries.worddictionary._map;

import java.util.HashMap;
import java.util.Map;

public class WordDictionary {

    TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode currentNode = root;
        for (char ch : word.toCharArray()) {
            if (!currentNode.children.containsKey(ch)) {
                currentNode.children.put(ch, new TrieNode());
            }
            currentNode = currentNode.children.get(ch);
        }
        currentNode.isWord = true;
    }

    public boolean search(String word) {
        return dfsHelper(0, root, word);
    }

    private boolean dfsHelper(int index, TrieNode currentNode, String word) {

        if (word.length() == index) {
            return currentNode.isWord;
        }

        char ch = word.charAt(index);

        if (ch =='.') {

            for (TrieNode child: currentNode.children.values()){
                if (dfsHelper(index + 1, child, word)) {
                    return true;
                }
            }
            return false;
        }

        if (!currentNode.children.containsKey(ch)) {
            return false;
        }

        return dfsHelper(index + 1, currentNode.children.get(ch), word);
    }

    public void getMap(){
        System.out.println(root.children);
    }

    class TrieNode {
        Map<Character, TrieNode> children = new HashMap<>();
        boolean isWord = false;

        @Override
        public String toString() {
            return "TrieNode{" +
                    "children=" + children +
                    ", isWord=" + isWord +
                    '}';
        }
    }


}
