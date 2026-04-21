package leetcode.linkedlists.reversebetween;

import leetcode.linkedlists.linkedlist.Node.ListNode;

public class Solution {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;
        ListNode previousNode = head;

        for (int i = 0; i < left - 1; i++) {
            previousNode = previousNode.next;
        }

        ListNode currentNode = previousNode.next;

        for (int i = 0; i < right - left; i++) {
            ListNode nodeToMove = currentNode.next;
            currentNode.next = nodeToMove.next;
            nodeToMove.next = previousNode.next;
            previousNode.next = nodeToMove;
        }
        return  dummy.next;
    }
}
