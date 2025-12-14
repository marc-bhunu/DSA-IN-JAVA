package leetcode.trees.maximumdepthofatree;

import leetcode.trees.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int maxDepth = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                TreeNode removed = queue.remove();
                if (removed.left != null) {
                    queue.add(removed.left);
                }
                if (removed.right != null) {
                    queue.add(removed.right);
                }
            }
            maxDepth++;
        }
        return maxDepth;
    }
}
