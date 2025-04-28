package datastructures.stack.ArrayList;

import java.util.ArrayList;

public class Stack<T> {

    private ArrayList<T> stackList = new ArrayList<T>();

    public void printAll(){
        for (int i = stackList.size()-1; i >= 0; i--) {
            System.out.println(stackList.get(i));
        }
    }

    public boolean isEmpty(){

        if (stackList.size() == 0) return true;
        
        return false;
    }

    public int size() {
        return stackList.size();
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        } else {
            return stackList.get(stackList.size() - 1);
        }
    }

    public T push(T value){
        stackList.add(value);
        return value; 
    }
    

    public T pop(){
        
        if (isEmpty()) return null;
        
        return  stackList.remove(stackList.size() -1);
    }
    
}
