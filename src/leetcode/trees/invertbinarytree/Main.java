package leetcode.trees.invertbinarytree;

import leetcode.trees.Tree;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.rInsert(44);
        tree.rInsert(22);
        tree.rInsert(78);
        System.out.println(tree.bfs());
        Solution solution = new Solution();
        solution.invertTree(tree.root);
        System.out.println(tree.bfs());

    }
}
