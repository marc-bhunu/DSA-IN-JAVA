package leetcode.linkedlists.reversebetween;


import leetcode.linkedlists.linkedlist.LinkedList;

public class Main {
    static void main() {

        Solution s = new Solution();
        LinkedList linkedList = new LinkedList(10);
        linkedList.append(20);
        linkedList.append(30);
        linkedList.append(40);
        linkedList.append(50);
        linkedList.append(60);
        s.reverseBetween(linkedList.head, 2, 3);
        linkedList.printList(linkedList.head);
    }
}
