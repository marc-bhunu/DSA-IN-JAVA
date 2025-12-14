package leetcode.trees.lowestcommonanscestor;

import leetcode.trees.TreeNode;

public class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode currentNode = root;
        if (currentNode == null) return null;
        int currentVal = currentNode.val;

        if (p.val < currentVal && q.val < currentVal) {
            return lowestCommonAncestor(currentNode.left, p, q);
        }

        if (p.val > currentVal &&  q.val > currentVal) {
            return  lowestCommonAncestor(currentNode.right, p, q);
        }

        return currentNode;
    }
}
