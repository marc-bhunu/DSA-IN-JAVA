package datastructures.linkedlist;

public class Main {

    public static void main(String[] args) {
        LinkedList  ll = new LinkedList();

        ll.append(90);
        ll.append(80);
        ll.append(70);
        ll.append(120);
        /*ll.reverse();
        ll.set(1, 600);
        System.out.println(ll.remove(1));
        System.out.println(ll.get(1).value);
        System.out.println(ll.findMiddlePart().value);
        System.out.println(ll.removeFirst().value);
        System.out.println(ll.removeLast().value);*/
        System.out.println("Before bubble sort: ");
        ll.printAll();
        ll.insertionSortLinkedList();
        System.out.println("After selection sort: ");
        ll.printAll();
    }
    
}
