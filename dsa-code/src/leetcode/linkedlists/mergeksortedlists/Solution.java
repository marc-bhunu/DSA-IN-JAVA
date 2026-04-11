package leetcode.linkedlists.mergeksortedlists;


import leetcode.linkedlists.linkedlist.Node.ListNode;

import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {

    public ListNode mergeKLists(ListNode[] lists) {
        Queue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);
        for (ListNode node: lists){
            while (node != null){
                minHeap.offer(node);
                node = node.next;
            }
        }
        ListNode dummy = new ListNode(1000);
        ListNode tail  = dummy;
        while(!minHeap.isEmpty()){
            tail.next = minHeap.remove();
            tail = tail.next;
        }
        return dummy.next;
    }
}
