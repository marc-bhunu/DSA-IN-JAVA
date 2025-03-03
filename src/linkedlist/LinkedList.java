package linkedlist;

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

    
}
