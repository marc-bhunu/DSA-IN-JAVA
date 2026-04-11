package leetcode.linkedlists.linkedlist;

import leetcode.linkedlists.linkedlist.Node.ListNode;

public class LinkedList {

    public ListNode head;
    public ListNode tail;
    int length;

    public LinkedList(int val){
        ListNode newNode = new ListNode(val);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public ListNode append(int val){
       ListNode newNode = new ListNode(val);
        if (length == 0) {
            head = newNode;
        }else{
            tail.next = newNode;
        }
        tail = newNode;
        return  newNode;
    }

    public void printList(ListNode aHead){
        ListNode currNode = aHead;
        while(currNode != null){
            System.out.print(currNode.val + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }
}
