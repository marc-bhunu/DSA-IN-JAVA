package leetcode.linkedlists.mergeksortedlists;



import leetcode.linkedlists.linkedlist.LinkedList;
import leetcode.linkedlists.linkedlist.Node.ListNode;


public class Main {
    static void main() {
        Solution solution = new Solution();
        LinkedList list1 = new LinkedList(1);
        list1.append(4);
        list1.append(5);

        LinkedList list2 = new LinkedList(1);
        list2.append(3);
        list2.append(4);

        LinkedList list3 = new LinkedList(2);
        list3.append(6);

        ListNode [] listNodes = {list1.head, list2.head, list3.head};
        ListNode head = solution.mergeKLists(listNodes);
        list1.printList(head);
    }
}
