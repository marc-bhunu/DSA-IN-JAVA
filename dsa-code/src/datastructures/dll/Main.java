package datastructures.dll;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList(5);
        dll.append(3);
        dll.append(78);
        dll.append(66);
        dll.append(300);
        dll.append(400);
        System.out.println(dll.remove(2).value);
        System.out.println(dll.removeFirst().value);
        System.out.println("I got removed " + dll.removeLast().value);
        dll.prepend(8000);
        dll.printAll();
    }
    
}
