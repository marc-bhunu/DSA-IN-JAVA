package datastructures.binarysearchtree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

    Node root;

    public BinarySearchTree() {
    }

    public BinarySearchTree(int value) {
        Node newNode = new Node(value);
        root = newNode;
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);

        if (root == null) {
            root = newNode;
            return true;
        }

        Node temp = root;

        while (true) {
            if (temp.value == newNode.value)
                return false;
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }

        }
    }

    public boolean contains(int value) {
        if (root == null)
            return false;
        Node temp = root;
        while (temp != null) {
            if (value < temp.value) {
                temp = temp.left;
            } else if (value > temp.value) {
                temp = temp.right;
            } else {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Integer> BFS() {
        ArrayList<Integer> results = new ArrayList<Integer>();
        Queue<Node> queue = new LinkedList<Node>();
        Node currentNode = root;
        queue.add(currentNode);
        while(!queue.isEmpty()){
            currentNode = queue.remove();
            results.add(currentNode.value);
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
        return  results;
    }
    public ArrayList<Integer> DFSPreOrder() {
        ArrayList<Integer> results = new ArrayList<>();
        class Traversal {
            Traversal(Node node){
                results.add(node.value);
                if (node.left != null) {
                    new Traversal(node.left);
                }
                if (node.right != null) {
                    new Traversal(node.right);
                }
            }
        }
        new Traversal(root);
        return  results;
    }

    public ArrayList<Integer> DFSPostOrder() {
        ArrayList<Integer> results = new ArrayList<>();

        class Traversal {
            Traversal(Node node){
                if (node.left != null) {
                    new Traversal(node.left);
                }
                if (node.right != null) {
                    new Traversal(node.right);
                }
                results.add(node.value);
            }
        }

        new Traversal(root);

        return  results;
    }

    public ArrayList<Integer> DFSInOrder() {
        ArrayList<Integer> results = new ArrayList<>();

        class Traverse {

            Traverse(Node curretNode){
                if (curretNode.left != null) {
                    new Traverse(curretNode.left);
                }
                results.add(curretNode.value);
                if (curretNode.right != null) {
                    new Traverse(curretNode.right);
                }
            }
        }
        new Traverse(root);

        return  results;
    }


}