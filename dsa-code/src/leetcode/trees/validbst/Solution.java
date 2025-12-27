package leetcode.trees.validbst;

import leetcode.trees.TreeNode;

import java.util.ArrayList;

public class Solution {


    private void dfsInorderHelper(TreeNode currentTreeNode, ArrayList<Integer> result){
        if (currentTreeNode == null) return;
        dfsInorderHelper(currentTreeNode.left, result);
        result.add(currentTreeNode.val);
        dfsInorderHelper(currentTreeNode.right, result);
    }
    public ArrayList<Integer> dfsInorder(TreeNode root){
        ArrayList<Integer> result = new ArrayList<>();
        dfsInorderHelper(root, result);
        return result;
    }

    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> inorderList = dfsInorder(root);
        for (int i = 0; i < inorderList.size() - 1; i++) {
            if (inorderList.get(i) >= inorderList.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
