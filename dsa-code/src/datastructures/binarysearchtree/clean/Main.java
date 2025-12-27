package datastructures.binarysearchtree.clean;


public class Main {

    public static void main(String[] args) {

        BST bst = new BST(42);
        bst.insert(22);
        bst.insert(94);
        bst.insert(18);
        bst.insert(34);
        bst.insert(72);
        bst.insert(64);

        System.out.println(bst.contains(22));



    }
}
