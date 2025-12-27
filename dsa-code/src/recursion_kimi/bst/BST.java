package recursion_kimi.bst;

import java.util.ArrayList;
import java.util.List;

public class BST {
    Node root;

    public Node rInsert(Node currentNode, int value){
        if (currentNode == null) {
            return new Node(value);
        }
        if (value < currentNode.value) {
            currentNode.left = rInsert(currentNode.left, value);
        }else{
            currentNode.right = rInsert(currentNode.right, value);
        }
        return currentNode;
    }
    public void rInsert(int value){
        if (root == null) {
            root = new Node(value);
        }else{
            rInsert(root, value);
        }
    }
    public boolean rSearch(Node currentNode, int value){
        if (currentNode == null) {
            return false;
        }
        if (currentNode.value == value) {
            return  true;
        }
        if (value < currentNode.value) {
            return rSearch(currentNode.left, value);
        }else{
         return rSearch(currentNode.right, value);
        }
    }
    public boolean rSearch(int value){
        return rSearch(root, value);
    }

    public int rSumInRange(Node currentNode, int left, int right, int[] sum){
        if (currentNode == null) {
            return sum[0];
        }
        if (currentNode.value >= left && currentNode.value <= right) {
            sum[0] = sum[0] + currentNode.value;
        }
        rSumInRange(currentNode.left,left, right, sum);
        rSumInRange(currentNode.right,left, right, sum);
        return sum[0];
    }
    public int rSumInRange(int left, int right){
        int[] sum = {0};
        return rSumInRange(root, left, right, sum);
    }

    public void dfsInOrderHelper(Node currentNode, List<Integer> result){
        if(currentNode == null) return;
        dfsInOrderHelper(currentNode.left, result);
        result.add(currentNode.value);
        dfsInOrderHelper(currentNode.right, result);

    }
    public List<Integer> dfsInOrder(){
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        dfsInOrderHelper(root, result);
        return  result;
    }

    public void preorderHelper(Node currentNode, List<Integer> result) {
        if (currentNode == null)
            return;
        result.add(currentNode.value);
        preorderHelper(currentNode.left, result);
        preorderHelper(currentNode.right, result);
    }

    public List<Integer> dfsPreOrder() {
        List<Integer> result = new ArrayList<Integer>();
        preorderHelper(root, result);
        return result;
    }

    public void dfsPostOrderHelper(Node currentNode, List<Integer> result){
        if (currentNode == null) {
            return;
        }
        dfsPostOrderHelper(currentNode.left, result);
        dfsPostOrderHelper(currentNode.right, result);
        result.add(currentNode.value);
    }

    public List<Integer> dfsPostOrder(){
        List<Integer> result = new ArrayList<>();
        dfsPostOrderHelper(root, result);
        return  result;
    }

    public int minNodeValue(Node currentNode){
        while(currentNode.left != null){
            currentNode = currentNode.left;
        }
        return currentNode.value;
    }


    public Node rDelete(Node currentNode, int value){
        if(currentNode == null) return null;
        if(value < currentNode.value){
            currentNode.left = rDelete(currentNode.left, value);
        }else if(value > currentNode.value) {
            currentNode.right = rDelete(currentNode.right, value);
        }else{
            if(currentNode.left  == null && currentNode.right == null){
                return null;
            }else if(currentNode.left == null){
                currentNode = currentNode.right;
            }else if(currentNode.right == null){
                currentNode = currentNode.left;
            }else{
                int minValue = minNodeValue(currentNode.right);
                currentNode.value = minValue;
                currentNode.right = rDelete(currentNode.right, minValue);
            }
        }
        return currentNode;
    }

    public void rDelete(int value){
        if(root == null) return;
        rDelete(root, value);
    }

}
