package leetcode.trees.maximumpathsum;

import leetcode.trees.Tree;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.rInsert(4);
        tree.rInsert(1);
        tree.rInsert(5);
        tree.rInsert(3);
        tree.rInsert(2);
        Solution solution = new Solution();
        System.out.println(tree.bfs());
        System.out.println(solution.maxPathSum(tree.root));
    }
}
