package leetcode.trees.kthsmallestelementinabst;

import leetcode.trees.TreeNode;

import java.util.PriorityQueue;

public class Solution {

    private void  dfsInorderHelper(TreeNode currentTreeNode, PriorityQueue<Integer> queue){
        if (currentTreeNode == null) return;
        dfsInorderHelper(currentTreeNode.left, queue);
        queue.offer(currentTreeNode.val);
        dfsInorderHelper(currentTreeNode.right, queue);
    }

    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        dfsInorderHelper(root, priorityQueue);
        for (int i = 1; i < k ; i++) {
            priorityQueue.remove();
        }

        return priorityQueue.remove();
    }
}
