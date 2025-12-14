package leetcode.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Tree {

    public TreeNode root;

    /**
     * Contains
     * */
    public boolean rContains(int val){
        return  rContains(root, val);
    }
    private boolean rContains(TreeNode currentTreeNode, int val) {
        if (currentTreeNode == null) return false;
        if (currentTreeNode.val == val) return true;
        if (val < currentTreeNode.val) {
            return rContains(currentTreeNode.left, val);
        } else {
            return rContains(currentTreeNode.right, val);
        }
    }
    
    /**
     * Delete
     * */
    public void rDelete(int val){
        rDelete(root, val);
    }
  
    public TreeNode rDelete(TreeNode currentTreeNode, int val){
        if(currentTreeNode == null) return null;
        if (val < currentTreeNode.val) {
            currentTreeNode.left  = rDelete(currentTreeNode.left, val);
        } else if (val > currentTreeNode.val) {
            currentTreeNode.right = rDelete(currentTreeNode.right, val);
        }else{
            if (currentTreeNode.left == null && currentTreeNode.right == null) {
                return  null;
            }else if(currentTreeNode.left == null){
                currentTreeNode = currentTreeNode.right;
            }else if (currentTreeNode.right == null){
                currentTreeNode = currentTreeNode.left;
            }else{
                int subTreeMin = minval(currentTreeNode.right);
                currentTreeNode.val  = subTreeMin;
                currentTreeNode.right = rDelete(currentTreeNode.right, subTreeMin);
            }
        }
        return  currentTreeNode;
    }

    public int minval(TreeNode currentTreeNode){
        while(currentTreeNode.left != null){
            currentTreeNode = currentTreeNode.left;
        }
        return currentTreeNode.val;
    }
    
    /**
     * Insert
     * */
    private TreeNode rInsert(TreeNode currentTreeNode, int val){
        if (currentTreeNode == null) return new TreeNode(val);
        if (currentTreeNode.val == val) return currentTreeNode;
        if (val < currentTreeNode.val) {
            currentTreeNode.left = rInsert(currentTreeNode.left, val);
        }else{
            currentTreeNode.right = rInsert(currentTreeNode.right, val);
        }
        return currentTreeNode;
    }

    public void rInsert(int val){
        if (root == null){
            root = new TreeNode(val);
        }else {
            rInsert(root, val);
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

    private void dfsInorderHelper(TreeNode currentTreeNode, ArrayList<Integer> result){
        if (currentTreeNode == null) return;
        dfsInorderHelper(currentTreeNode.left, result);
        result.add(currentTreeNode.val);
        dfsInorderHelper(currentTreeNode.right, result);
    }

    /**
     * Recursive DFS Preorder
     * */
    public ArrayList<Integer> dfsPreorder(){
        ArrayList<Integer> result = new ArrayList<>();
        dfsPreorderHelper(root, result);
        return result;
    }

    private void dfsPreorderHelper(TreeNode currentTreeNode, ArrayList<Integer> result){
        if (currentTreeNode == null) return;
        result.add(currentTreeNode.val);
        dfsPreorderHelper(currentTreeNode.left, result);
        dfsPreorderHelper(currentTreeNode.right, result);
    }

    /**Recursive Dfs Post Order*/
    public ArrayList<Integer> dfsPostOrder(){
        ArrayList<Integer> result = new ArrayList<>();
        dfsPostOrderHelper(root, result);
        return result;
    }

    private void dfsPostOrderHelper(TreeNode currentTreeNode, ArrayList<Integer> result){
        if (currentTreeNode == null) return;
        dfsPostOrderHelper(currentTreeNode.left, result);
        dfsPostOrderHelper(currentTreeNode.right, result);
        result.add(currentTreeNode.val);
    }

    /**
     * BFS - Level Order Traversal
     * */

    public ArrayList<Integer> bfs(){
        if (root == null) return new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode removedTreeNode = queue.remove();
            result.add(removedTreeNode.val);
            if (removedTreeNode.left != null) {
                queue.add(removedTreeNode.left);
            }
            if (removedTreeNode.right != null) {
                queue.add(removedTreeNode.right);
            }
        }
        return result;
    }
}
