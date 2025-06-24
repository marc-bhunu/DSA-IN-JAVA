package datastructures.linkedlist.ll2;

public class LinkedList {

    ListNode head;
    ListNode tail;
    int length;

    public LinkedList(int value) {
        ListNode newNode = new ListNode(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = length + 1;
    }

    public void append(int value) {
        ListNode newNode = new ListNode(value);
        if (this.length > 0) {
            tail.next = newNode;
            tail = newNode;
        } else {
            head = newNode;
            tail = newNode;
        }
        length++;
    }

    public void removeLast() {
        if (length == 0) {
            return;
        }
        ListNode current = head;
        ListNode prevNode = current;

        while (current.next != null) {
            prevNode = current;
            current = current.next;
        }

        tail = prevNode;
        tail.next = null;

        if (length == 1) {
            this.head = null;
            this.tail = null;
            this.length = 0;
        }

    }

    public void printLinkedList() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
    }

}
