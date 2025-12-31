package leetcode.tries.implementprefixtrie;


import java.util.HashMap;
import java.util.Map;

class Trie {

   class TrieNode{
       boolean isValidWord = false;
       Map<Character, TrieNode> children = new HashMap<>();
   }

   TrieNode root;

   public Trie(){
       root = new TrieNode();
   }

   public void insert(String word){
       TrieNode currNode = root;
       for (char c: word.toCharArray()){
           if (!currNode.children.containsKey(c)) {
               currNode.children.put(c, new TrieNode());
           }

           currNode = currNode.children.get(c);
       }
       currNode.isValidWord = true;
   }

   public boolean search(String word){
       TrieNode currNode = root;
       for (char c: word.toCharArray()){
           if (!currNode.children.containsKey(c)) {
              return false;
           }
           currNode = currNode.children.get(c);
       }
       return currNode.isValidWord;
   }

   public boolean startsWith(String prefix){
       TrieNode currNode = root;
       for (char c: prefix.toCharArray()){
           if (!currNode.children.containsKey(c)) {
               return false;
           }
           currNode = currNode.children.get(c);
       }
       return true;
   }

}
