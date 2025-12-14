package leetcode.trees.serializedeserializebst;

import leetcode.trees.TreeNode;

import java.util.Arrays;

public class Solution {

        public String serialize(TreeNode root) {
            StringBuilder sb = new StringBuilder();
            dfsSerializePreorderHelper(root, sb);
            return  sb.toString();
        }

        private void dfsSerializePreorderHelper(TreeNode currentNode, StringBuilder sb){
            if (currentNode == null) {
                sb.append("null#");
                return;
            }
            sb.append(currentNode.val).append("#");
            dfsSerializePreorderHelper(currentNode.left, sb);
            dfsSerializePreorderHelper(currentNode.right, sb);
        }

        public TreeNode build(String[] preorder, int[] preorderIndex){
            if (preorder[preorderIndex[0]].equals("null")) {
                preorderIndex[0]++;
                return null;
            }
            int rootVal = Integer.valueOf(preorder[preorderIndex[0]]);
            preorderIndex[0]++;
            TreeNode root = new TreeNode(rootVal);
            root.left = build(preorder, preorderIndex);
            root.right = build(preorder, preorderIndex);
            return root;
        }

        public TreeNode deserialize(String data) {
            String[] preorder = data.split("#");
            System.out.println(Arrays.toString(preorder));
            int[] preorderIndex  = {0};
            return build(preorder, preorderIndex);
        }

}
