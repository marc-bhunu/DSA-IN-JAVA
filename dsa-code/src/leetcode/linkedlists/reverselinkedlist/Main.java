package leetcode.linkedlists.reverselinkedlist;


import leetcode.linkedlists.linkedlist.LinkedList;
import leetcode.linkedlists.linkedlist.Node.ListNode;


public class Main {
    static void main() {
        Solution solution = new Solution();
        LinkedList linkedList = new LinkedList(10);
        linkedList.append(20);
        linkedList.append(30);
        linkedList.append(40);
        linkedList.append(50);
        linkedList.printList(linkedList.head);
        ListNode head = solution.reverseList(linkedList.head);
        linkedList.printList(head);
    }
}
