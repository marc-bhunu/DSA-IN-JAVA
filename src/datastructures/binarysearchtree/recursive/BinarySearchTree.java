package datastructures.binarysearchtree.recursive;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

    Node root;

    /**
     * Contains
     * */
    public boolean rContains(int value){
        return  rContains(root, value);
    }
    private boolean rContains(Node currentNode, int value) {
        if (currentNode == null) return false;
        if (currentNode.value == value) return true;
        if (value < currentNode.value) {
            return rContains(currentNode.left, value);
        } else {
            return rContains(currentNode.right, value);
        }
    }
    /**
    * Delete
    * */

    public int minValue(Node currentNode){
        while(currentNode.left != null){
            currentNode = currentNode.left;
        }
        return currentNode.value;
    }

    public Node rDelete(Node currentNode, int value){
        if(currentNode == null) return null;
        if (value < currentNode.value) {
            currentNode.left  = rDelete(currentNode.left, value);
        } else if (value > currentNode.value) {
            currentNode.right = rDelete(currentNode.right, value);
        }else{
            if (currentNode.left == null && currentNode.right == null) {
                return  null;
            }else if(currentNode.left == null){
                currentNode = currentNode.right;
            }else if (currentNode.right == null){
                currentNode = currentNode.left;
            }else{
                int subTreeMin = minValue(currentNode.right);
                currentNode.value  = subTreeMin;
                currentNode.right = rDelete(currentNode.right, subTreeMin);
            }
        }
        return  currentNode;
    }

    public void rDelete(int value){
        rDelete(root, value);
    }

    /**
    * Insert
    * */
   private Node rInsert(Node currentNode, int value){
       if (currentNode == null) return new Node(value);
       if (currentNode.value == value) return currentNode;
       if (value < currentNode.value) {
           currentNode.left = rInsert(currentNode.left, value);
       }else{
           currentNode.right = rInsert(currentNode.right, value);
       }
        return currentNode;
   }

   public void rInsert(int value){
       if (root == null){
           root = new Node(value);
       }else {
           rInsert(root, value);
       }
   }

   /**
   * Recursive dfs Inorder
   * */

    public ArrayList<Integer> dfsInorder(){
        ArrayList<Integer> result = new ArrayList<>();
        dfsInorderHelper(root, result);
        return result;
    }

    private void dfsInorderHelper(Node currentNode, ArrayList<Integer> result){
        if (currentNode == null) return;
        dfsInorderHelper(currentNode.left, result);
        result.add(currentNode.value);
        dfsInorderHelper(currentNode.right, result);
    }

    /**
     * Recursive DFS Preorder
     * */
    public ArrayList<Integer> dfsPreorder(){
        ArrayList<Integer> result = new ArrayList<>();
        dfsPreorderHelper(root, result);
        return result;
    }

    private void dfsPreorderHelper(Node currentNode, ArrayList<Integer> result){
        if (currentNode == null) return;
        result.add(currentNode.value);
        dfsPreorderHelper(currentNode.left, result);
        dfsPreorderHelper(currentNode.right, result);
    }

    /**Recursive Dfs Post Order*/
    public ArrayList<Integer> dfsPostOrder(){
        ArrayList<Integer> result = new ArrayList<>();
        dfsPostOrderHelper(root, result);
        return result;
    }

    private void dfsPostOrderHelper(Node currentNode, ArrayList<Integer> result){
        if (currentNode == null) return;
        dfsPostOrderHelper(currentNode.left, result);
        dfsPostOrderHelper(currentNode.right, result);
        result.add(currentNode.value);
    }

    /**
     * BFS - Level Order Traversal
     * */

    public ArrayList<Integer> bfs(){
        if (root == null) return new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node removedNode = queue.remove();
            result.add(removedNode.value);
            if (removedNode.left != null) {
                queue.add(removedNode.left);
            }
            if (removedNode.right != null) {
                queue.add(removedNode.right);
            }
        }
        return result;
    }



}
