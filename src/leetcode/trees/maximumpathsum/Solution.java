package leetcode.trees.maximumpathsum;

import leetcode.trees.TreeNode;

public class Solution {

    private int maxSum = Integer.MIN_VALUE;

    private int recursiveMaximumPathSum(TreeNode root){
        if (root == null) return 0;
        int left   =  Math.max(0, recursiveMaximumPathSum(root.left));
        int right  =  Math.max(0, recursiveMaximumPathSum(root.right));
        maxSum = Math.max(maxSum, (left + right) + root.val);
        return Math.max(left, right) + root.val;
    }

    public int maxPathSum(TreeNode root) {
        recursiveMaximumPathSum(root);
        return maxSum;
    }
}
