package dll;

public class DoublyLinkedList {
    
    Node tail;
    Node head;
    int length;

    public DoublyLinkedList(){}
    
    public DoublyLinkedList(int value){
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1; 
    }


    public void append(int value){
        Node newNode = new Node(value);

        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }

        length++;

    }


    public Node removeLast(){
        
        if (length ==  0) return null;
        
        Node removed = tail;
        Node temp = removed.previous;
        
        if (length == 1) {
            head = null;
            tail = null;
        }

        temp.next = null;
        tail.previous = null;
        tail = temp;

        length--;

        if(length == 0){
            head = null;
            tail = null;
        }
        
        return removed; 
    }

    public void prepend(int value){

        Node newNode = new Node(value);
        
        if (length == 0) {
            head = newNode;
            tail = newNode;
        }else{
            head.previous = newNode;
            newNode.next = head;
            head = newNode;
        } 

        length++;
    }


    public Node removeFirst(){
        if (length == 0) return null;
        Node temp = head;

        if (length == 1) {
            head = null;
            tail = null;
        }else{
            head = head.next;
            head.previous = null;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public Node get(int index) {

        if (index < 0 || index >= length)
            return null;

        Node temp = head;

        if (length / 2 < index) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;

            for (int i = length - 1; i > index; i--) {
                temp = temp.previous;
            }
        }

        return temp;
    }



    public boolean set(int index, int value){

        if (index < 0 || index > length) return false;
                
        Node temp = get(index);
        
        if (temp == null) return false;

        temp.value = value;        
        return true;
    }


    public boolean insert(int index, int value){
        
        if (index < 0 || index > length) return false;

        if (index == 0) {
            prepend(value);
            return true; 
        }

        if (index == length) {
            append(value);
            return true;
        }

        Node newNode = new Node(value);
        
        Node before = get(index -1);
        Node after  = before.next;

        before.next = newNode;
        newNode.previous = before;
        after.previous = newNode;
        newNode.next = after;
        
        length++;

        return true;
    }

    public Node remove(int index){

        if (index == 0 ) {
            return removeFirst();
        }

        if (index == length) {
            return removeLast();
        }
        Node temp = get(index -1);
        if (temp == null) return null;

        Node removed = temp.next;        
        Node after = temp.next.next;
        temp.next = after;
        after.previous = after.previous.previous;

        return removed;
    }

  
 
    public void printAll(){
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;   
        }
    }

    
}
