package leetcode.trees.binarytreelevelordertraversal;

import leetcode.trees.Tree;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.rInsert(44);
        tree.rInsert(23);
        tree.rInsert(79);
        tree.rInsert(21);
        tree.rInsert(34);
        tree.rInsert(64);
        tree.rInsert(88);
        Solution solution = new Solution();
        System.out.println(solution.levelOrder(tree.root));
    }
}
