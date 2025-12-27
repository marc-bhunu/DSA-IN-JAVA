package recursion_kimi.bst;

import datastructures.oop.protect.B;

public class Main {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.rInsert(44);
        bst.rInsert(22);
        bst.rInsert(18);
        bst.rInsert(29);
        bst.rInsert(77);
        bst.rInsert(66);
        bst.rInsert(99);
        //System.out.println(bst.rSearch(22));
        //System.out.println(bst.rSumInRange(18,29));
        System.out.println("Inorder  :" +  bst.dfsInOrder());
        System.out.println("Preorder :" +  bst.dfsPreOrder());
        System.out.println("Postorder :" +  bst.dfsPostOrder());
        bst.rDelete(44);
        System.out.println("Inorder after delete :" +  bst.dfsInOrder());

        /**
         *                           44
         *                       /        \
         *                  22            77
         *                /   \          /   \
         *             18      29      66    99
         *
         * */
    }
}
