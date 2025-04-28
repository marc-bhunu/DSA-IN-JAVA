package datastructures.binarysearchtree.recursive;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree myBinarySearchTree = new BinarySearchTree();
        myBinarySearchTree.rInsert(44);
        myBinarySearchTree.rInsert(23);
        myBinarySearchTree.rInsert(76);
        myBinarySearchTree.rInsert(19);
        myBinarySearchTree.rInsert(23);

        System.out.println(myBinarySearchTree.minValue(myBinarySearchTree.root));

        System.out.println(myBinarySearchTree.rContains(44));
    }
}
