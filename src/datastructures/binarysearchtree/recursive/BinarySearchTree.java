package datastructures.binarysearchtree.recursive;

public class BinarySearchTree {

    Node root;

    private boolean rContains(Node currNode, int value) {
        if (currNode == null)
            return false;
        if (currNode.value == value)
            return true;
        if (value < currNode.value) {
            return rContains(currNode.left, value);
        } else {
            return rContains(currNode.right, value);
        }
    }

    public boolean rContains(int value) {
        return rContains(root, value);
    }

    public int minValue(Node cuurNode) {
        while (cuurNode.left != null) {
            cuurNode = cuurNode.left;
        }
        return cuurNode.value;
    }

    private Node deletNode(Node currNode, int value) {
        if (currNode == null)
            return null;
        if (value < currNode.value) {
            currNode.left = deletNode(currNode.left, value);
        } else if (value > currNode.value) {
            currNode.right = deletNode(currNode.right, value);
        } else {
            if (currNode.left == null && currNode.right == null) {
                return null;
            } else if (currNode.left == null) {
                currNode = currNode.right;
            } else if (currNode.right == null) {
                currNode = currNode.left;
            } else {
                int subTreeMin = minValue(currNode.right);
                currNode.value = subTreeMin;
                currNode.right = deletNode(currNode.right, subTreeMin);
            }
        }
        return currNode;
    }

    public void rDelete(int value) {
        deletNode(root, value);
    }

    private Node rInsert(Node currNode, int value) {
        if (currNode == null) {
            return new Node(value);
        }
        if (value < currNode.value) {
            currNode.left = rInsert(currNode.left, value);
        } else if (value > currNode.value) {
            currNode.right = rInsert(currNode.right, value);
        }
        return currNode;
    }

    public void rInsert(int value) {
        if (root == null) {
            root = new Node(value);
        }
        rInsert(root, value);
    }

}
