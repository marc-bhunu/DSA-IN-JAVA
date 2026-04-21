package leetcode.linkedlists.reverselinkedlist;

import java.util.Stack;
import leetcode.linkedlists.linkedlist.Node.ListNode;

public class Solution {

    public ListNode reverseList(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;
        while(temp != null){
            stack.push(temp.val);
            temp = temp.next;
        }


        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while(!stack.isEmpty()){
            tail.next  = new ListNode(stack.pop());
            tail = tail.next;
        }
        return dummy.next;
    }
}
