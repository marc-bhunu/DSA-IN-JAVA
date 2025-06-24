package datastructures.linkedlist.ll2;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList(0);
        ll.append(10);
        ll.append(42);
        ll.append(89);

        ll.printLinkedList();
        ll.removeLast();
    }
}
