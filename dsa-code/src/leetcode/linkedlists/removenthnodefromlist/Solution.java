package leetcode.linkedlists.removenthnodefromlist;

import leetcode.linkedlists.linkedlist.Node.ListNode;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;

        ListNode fast =  head;
        ListNode slow =  head;
        for (int i = 0; i < n; i++) {
            fast =  fast.next;
        }

        while (fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
