package leetcode.linkedlists.reverselinkedlist;

import java.util.Stack;
import leetcode.linkedlists.linkedlist.Node.ListNode;

public class Solution {

    public ListNode reverseList(ListNode head) {
        ListNode currNode = head;
        Stack<Integer> stack = new Stack<>();
        while(currNode != null){
            stack.push(currNode.val);
            currNode = currNode.next;
        }

        ListNode dummy = new ListNode(10000);
        ListNode tail = dummy;
        while(!stack.isEmpty()){
            ListNode newNode =  new ListNode(stack.pop());
            tail.next = newNode;
            tail = newNode;
        }
        return dummy.next;
    }
}
