package leetcode.linkedlists.reverselinkedlist.optimized;

import leetcode.linkedlists.linkedlist.Node.ListNode;

public class Solution {
    public ListNode reverseList(ListNode head) {
        //After the current Node
        ListNode after = head;
        //The current root node
        ListNode curr = after;
        //Always before the currNode
        ListNode before = null;
        while (curr != null) {
            after = curr.next;
            curr.next = before;
            before = curr;
            curr = after;
        }
        return before;
    }
}
