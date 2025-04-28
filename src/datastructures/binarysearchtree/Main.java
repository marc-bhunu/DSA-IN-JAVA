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
        System.out.println(bst.root.left.right);

        System.out.println(bst.contains(56));
        System.out.println(bst.contains(33));
        System.out.println(bst.contains(21));
        System.out.println("BFS "+bst.BFS());
        System.out.println("DFS Preorder"+ bst.DFSPreOrder());
        System.out.println("DFS Postorder"+ bst.DFSPostOrder());
        System.out.println("DFS Inorder"+ bst.DFSInOrder());
    }
}
