package leetcode.trees.buildabstfromapreorderaninorder;

import leetcode.trees.TreeNode;
import java.util.HashMap;
import java.util.Map;

public class Solution {




    private TreeNode build(int[] preorder, int[] preorderIndex, Map<Integer, Integer> map, int left, int right) {
        if (left > right) return  null;
        int rootVal = preorder[preorderIndex[0]];
        preorderIndex[0]++;
        TreeNode root = new TreeNode(rootVal);
        int index = map.get(rootVal);
        root.left   = build(preorder,preorderIndex, map, left, index - 1);
        root.right  = build(preorder,preorderIndex, map, index + 1, right);
        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        int[] preorderIndex = {0};
        int left = 0;
        int right = inorder.length - 1;
        return  build(preorder, preorderIndex, map, left, right);
    }
}
