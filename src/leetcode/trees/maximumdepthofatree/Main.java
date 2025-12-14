package leetcode.trees.maximumdepthofatree;

import leetcode.trees.Tree;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.rInsert(44);
        tree.rInsert(23);
        tree.rInsert(79);
        Solution solution = new Solution();
        System.out.println(solution.maxDepth(tree.root));
    }
}
