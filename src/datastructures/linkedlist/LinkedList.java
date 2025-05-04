package datastructures.linkedlist;

import java.util.Arrays;

public class LinkedList {

    Node head;
    Node tail;
    int length;


    public LinkedList(){}

    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length  = 1;
    }

    public void append(int value){

        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }

        length++;

    }

    public Node removeLast(){
        
        if(head == null) return null;
        
        Node current = head;
        Node prev    = head;
        
        while (current.next != null) {
            prev = current;          
            current = current.next;
        }

        tail  = prev;
        tail.next= null;
        
        length--;

        if(head == null){
            head = null;
            tail = null;
        }

        return current;
    }


    public void prepend(int value){

        Node newNode = new Node(value);
        Node temp = head;
        
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            head = newNode;
            newNode.next = temp;
        }
        length++;
    
    }


    public Node get(int index){
        
        if(index < 0 || index >= length) return null;
        
        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp;
    }


    public boolean set(int index, int value){

        Node temp = get(index);
        
        if(temp == null) return false;

        temp.value = value;                                

        return true;
    }

    public Node findMiddlePart(){
        Node fast = head;
        Node slow  = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;            
        }

        return slow;
    
    }
    

    public Node removeFirst(){
        
        if(head == null) return null;  
        
        Node temp = head;
        
        head = temp.next;
        temp.next = null; 
        
        length--;
        
        if(head ==  null){
            head = null;
            tail = null;
        }

        return temp;
    }

    public boolean insert(int index, int value){
        
        if(head == null) return false;
        
        if(index == 0){
            prepend(value);
            return true;
        } 
        
        if(index == length){
            append(value);
            return true;

        } 

        Node newNode = new Node(value);
        Node temp = get(index - 1);

        newNode.next = temp.next;
        temp.next = newNode;        
        
        length++;
        

        return true;
    }

    public boolean remove(int index){

        if(index < 0 || index > length   ){
            return false;
        }

        if(index == 0){
            removeFirst();
            return true;
        }

        if(index == length){
            removeLast();
            return true;
        }


        Node temp  = get(index - 1);
        temp.next = temp.next.next;
        length--;


        return true;
    }

    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;

        Node before = null;
        Node after = null;
    
        while (temp != null) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }


    public void printAll(){

        Node temp = head;

        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }

    }


    /*Option 1 Bubble Sort*/
    public void bubbleSort(){
        Node i,j = null;
        for (i = head; i != null; i = i.next) {
            for ( j = i.next; j != null ; j = j.next) {
                if (i.value > j.value) {
                    int temp = i.value;
                    i.value = j.value;
                    j.value = temp;
                }
            }
        }
    }

    /*Option 2 Bubble Sort*/
    public void bubble() {
        if (length < 2) return;
        Node sortedUntil = null;
        while (sortedUntil != this.head.next) {
            Node current = this.head;
            while (current.next != sortedUntil) {
                Node nextNode = current.next;
                if (current.value > nextNode.value) {
                    int temp = current.value;
                    current.value = nextNode.value;
                    nextNode.value = temp;
                }
                current = current.next;
            }
            sortedUntil = current;
        }
    }

    public void selectionSortLinkedList(){
        if(length < 2) return;
        Node current = head;
        while (current != null) {
            Node smallest = current;
            Node comparison = current.next;
            while (comparison != null) {
                if (comparison.value < smallest.value) {
                    smallest = comparison;
                }
                comparison = comparison.next;
            }
            if (smallest != current) {
                int temp = smallest.value;
                smallest.value = current.value;
                current.value = temp;
            }
            current = current.next;
        }

    }

  public void insertionSortLinkedList(){
        Node current = head;
        for (Node i = current.next; i != null; i = i.next) {
            while (current != null && i.value < current.value) {
               current.next.value = current.value;
               current.value = i.value;
               current = current.next;
            }
        }

  }



    
}
