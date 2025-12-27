package leetcode.trees.isusbtreeofanother;

import leetcode.trees.Tree;

public class Main {
    public static void main(String[] args) {

        Tree tree = new Tree();
        tree.rInsert(44);
        tree.rInsert(23);
        tree.rInsert(79);
        tree.rInsert(15);
        tree.rInsert(24);

        Tree tree1 = new Tree();
        tree1.rInsert(23);
        tree1.rInsert(15);
        tree1.rInsert(24);
        tree1.rInsert(79);

        Solution solution = new Solution();
        System.out.println(solution.isSubtree(tree.root, tree1.root));
        System.out.println(tree1.bfs());

    }
}
