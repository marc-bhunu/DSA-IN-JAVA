package leetcode.linkedlists.hascycle;


import leetcode.linkedlists.linkedlist.LinkedList;

public class Main {
    static void main() {
        Solution s = new Solution();
        LinkedList list = new LinkedList(10);
        list.append(20);
        list.head.next.next = list.head;
        System.out.println(s.hasCycle(list.head));
    }
}
