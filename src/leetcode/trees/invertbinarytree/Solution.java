package leetcode.trees.invertbinarytree;


import leetcode.trees.TreeNode;

public class Solution {

    public TreeNode invertTree(TreeNode root){
        TreeNode currentNode = root;
        if (currentNode == null) return null;


        TreeNode temp = currentNode.left;
        currentNode.left = currentNode.right;
        currentNode.right = temp;

        invertTree(currentNode.left);
        invertTree(currentNode.right);

        return root;
    }
}
