package datastructures.binarysearchtree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinarySearchTree {

    private int maxPath = Integer.MIN_VALUE;
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

    public List<Integer> BFS() {
        Node currNode = root;
        List<Integer> result = new ArrayList<Integer>();
        Queue<Node> queue = new LinkedList<>();
        if (currNode == null) {
            return null;
        }
        queue.add(currNode);
        while (!queue.isEmpty()) {
            Node removedNode = queue.remove();
            result.add(removedNode.value);
            if (removedNode.left != null) {
                queue.add(removedNode.left);
            }
            if (removedNode.right != null) {
                queue.add(removedNode.right);
            }
        }
        return result;
    }

    public ArrayList<Integer> DFSPreOrder() {
        ArrayList<Integer> results = new ArrayList<>();
        class Traversal {
            Traversal(Node node) {
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
        return results;
    }

    public ArrayList<Integer> DFSPostOrder() {
        ArrayList<Integer> results = new ArrayList<>();

        class Traversal {
            Traversal(Node node) {
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

        return results;
    }

    public ArrayList<Integer> DFSInOrder() {
        ArrayList<Integer> results = new ArrayList<>();

        class Traverse {

            Traverse(Node curretNode) {
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

        return results;
    }

    /*
     * 
     * Is the same tree
     */
    public boolean isSameTree(Node p, Node q) {
        if (p == null && q == null) {
            return true;
        }
        if ((p != null && q != null) && (p.value == q.value)) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        return false;
    }

    /*
     * 
     * Is the same tree of sub tree
     */
    public boolean isSubtree(Node root, Node subRoot) {
        if (root == null) {
            return false;
        }
        if (isSameTree(root, subRoot)) {
            return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);

    }

    /*
     * 
     * longest path
     */
    public int pathSum(Node root) {
        if (root == null) {
            return 0;
        }
        int left = Math.max(0, pathSum(root.left));
        int right = Math.max(0, pathSum(root.right));
        maxPath = Math.max(maxPath, (left + right + root.value));
        return Math.max(left, right) + root.value;
    }

    public int maxPathSum(Node root) {
        pathSum(root);
        return maxPath;
    }

}