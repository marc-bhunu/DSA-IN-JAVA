package leetcode.trees.serializedeserializebst;

import leetcode.trees.Tree;
import leetcode.trees.TreeNode;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.rInsert(44);
        tree.rInsert(21);
        tree.rInsert(79);
        Solution solution = new Solution();
        System.out.println(solution.serialize(tree.root));
        TreeNode node = solution.deserialize(solution.serialize(tree.root));
    }
}
