package leetcode.trees.binarytreelevelordertraversal;

import leetcode.trees.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return  result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int n = queue.size();
            List<Integer> currList  = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                TreeNode removedTreeNode = queue.remove();
                currList.add(removedTreeNode.val);
                if (removedTreeNode.left != null) {
                    queue.add(removedTreeNode.left);
                }
                if (removedTreeNode.right != null) {
                    queue.add(removedTreeNode.right);
                }
            }
            result.add(currList);
        }
        return  result;
    }
}
