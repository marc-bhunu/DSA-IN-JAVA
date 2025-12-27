package datastructures.recursion;

public class ReverseLinkedList {
    Node head;
    Node tail;
    int length;

    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    private void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        length++;
    }

    public void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.value);
            curr = curr.next;
        }
    }

    public void reverseList() {
        head = reverseListRecursive(head);
    }

    private Node reverseListRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node p = reverseListRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }

    private Node mergeTwoLists(Node list1, Node list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        if (list1.value < list2.value) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    public static void main(String[] args) {
        ReverseLinkedList list1 = new ReverseLinkedList();
        list1.append(10);
        list1.append(30);
        list1.append(50);

        ReverseLinkedList list2 = new ReverseLinkedList();
        list2.append(20);
        list2.append(40);
        list2.append(60);

        Node curr = list1.mergeTwoLists(list1.head, list2.head);
        while (curr != null) {
            System.out.print(curr.value + " ");
            curr = curr.next;
        }
    }

}
