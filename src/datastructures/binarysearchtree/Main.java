package datastructures.binarysearchtree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree(47);
        bst.insert(21);
        bst.insert(76);
        bst.insert(18);
        bst.insert(34);
        bst.insert(55);
        bst.insert(82);

        System.out.println(bst.DFSPreOrderWithHelper());
        System.out.println(bst.diameterOfBinaryTree(bst.root));

        /*
         * BinarySearchTree bst2 = new BinarySearchTree(21);
         * bst2.insert(18);
         * bst2.insert(34);
         */

        // System.out.println(bst2.isSubtree(bst.root, bst2.root));
        // System.out.println("The maximum path is " + bst.maxPathSum(bst.root));

        /**
         * System.out.println(bst.contains(56));
         * System.out.println(bst.contains(33));
         * System.out.println(bst.contains(21));
         * System.out.println("BFS "+bst.BFS());
         * System.out.println("DFS Preorder"+ bst.DFSPreOrder());
         * System.out.println("DFS Postorder"+ bst.DFSPostOrder());
         * System.out.println("DFS Inorder"+ bst.DFSInOrder());
         */
    }
}
