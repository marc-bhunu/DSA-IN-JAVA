package datastructures.stack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Stack {
    
    Node top;
    int height;


    public Stack(int value){
        Node newNode = new Node(value);
        top = newNode;
        height = 1;

        Collection<Integer> list = new ArrayList<>();
    }


    public void push(int value){
        Node newNode = new Node(value);

        if (height == 0) {
            top = newNode;

        }else{
            newNode.next = top;
            top= newNode;
        }
        height++;
    }

    public Node pop(){
        if (height == 0) return null;

        Node temp = top;
        
        top = temp.next;
        temp.next = null;

        height--;
        return temp;
    }

    public void printStack(){
        
        Node temp = top;

        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }



}
