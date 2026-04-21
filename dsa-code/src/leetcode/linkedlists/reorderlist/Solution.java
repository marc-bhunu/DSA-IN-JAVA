package leetcode.linkedlists.reorderlist;

import leetcode.linkedlists.linkedlist.Node.ListNode;

public class Solution {

    private ListNode mid(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


    private ListNode reverse(ListNode head){
        ListNode curr   = head;
        ListNode before = null;
        ListNode after;
        while (curr != null){
            after = curr.next;
            curr.next = before;
            before = curr;
            curr = after;
        }
        return before;
    }


    private void merge(ListNode firstHalf, ListNode secondHalf){

        ListNode temp1 = firstHalf;
        ListNode temp2 = secondHalf;

        while (temp1 != null && temp2 != null){

            ListNode prt1 =  temp1.next;
            ListNode prt2 =  temp2.next;

            temp2.next = temp1.next;
            temp1.next = temp2;

            temp1 = prt1;
            temp2 = prt2;

        }



    }

    public void reorderList(ListNode head) {
        if (head == null ||  head.next == null) return;
        ListNode mid =  mid(head);
        ListNode secondHalf = reverse(mid.next);
        mid.next = null;
        merge(head,secondHalf);
    }
}
