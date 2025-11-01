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
        bst.rSearch(88);

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
