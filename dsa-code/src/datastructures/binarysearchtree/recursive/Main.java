package datastructures.binarysearchtree.recursive;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree myBinarySearchTree = new BinarySearchTree();
        myBinarySearchTree.rInsert(44);
        myBinarySearchTree.rInsert(23);
        myBinarySearchTree.rInsert(76);
        myBinarySearchTree.rInsert(19);

        System.out.println(myBinarySearchTree.minValue(myBinarySearchTree.root));
        System.out.println(myBinarySearchTree.rContains(44));
//        myBinarySearchTree.rDelete(44);
        System.out.println("Inorder "+ myBinarySearchTree.dfsInorder());
        System.out.println("Preorder "+myBinarySearchTree.dfsPreorder());
        System.out.println("Postorder "+myBinarySearchTree.dfsPostOrder());
        System.out.println("BFS "+myBinarySearchTree.bfs());
    }
}
