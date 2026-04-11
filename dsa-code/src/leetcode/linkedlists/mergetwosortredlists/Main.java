package leetcode.linkedlists.mergetwosortredlists;

import leetcode.linkedlists.linkedlist.LinkedList;
import leetcode.linkedlists.linkedlist.Node.ListNode;

public class Main {
    static void main() {
        Solution solution = new Solution();
        LinkedList linkedList = new LinkedList(10);
        linkedList.append(30);
        linkedList.append(50);
        linkedList.append(70);
        LinkedList linkedList1 = new LinkedList(20);
        linkedList1.append(40);
        linkedList1.append(60);
        ListNode head = solution.mergeTwoLists(linkedList.head, linkedList1.head);
        linkedList.printList(head);

    }
}
