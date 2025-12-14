package leetcode.trees.isthesametree;

import leetcode.trees.Tree;

public class Main {
    public static void main(String[] args) {

        Tree tree = new Tree();
        tree.rInsert(44);
        tree.rInsert(23);
        tree.rInsert(79);

        Tree tree1 = new Tree();
        tree1.rInsert(44);
        tree1.rInsert(23);
        tree1.rInsert(79);

        Solution solution = new Solution();
        System.out.println(solution.isSameTree(tree.root, tree1.root));

    }
}
