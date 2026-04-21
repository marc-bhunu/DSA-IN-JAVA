package leetcode.linkedlists.removenthnodefromlist;

import leetcode.linkedlists.linkedlist.LinkedList;

public class Main {

    static void main() {
        Solution s = new Solution();
        LinkedList ll = new LinkedList(5);
        ll.append(10);
        ll.append(20);
        ll.append(30);
        ll.append(40);
        ll.append(50);

        ll.printList(ll.head);
        s.removeNthFromEnd(ll.head, 2);
        ll.printList(ll.head);

    }
}
