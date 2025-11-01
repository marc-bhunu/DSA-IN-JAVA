package recursion_kimi.bst;

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
        }
        rInsert(root, value);
    }
    public Node rSearch(Node currentNode, int value){
        if (currentNode == null) {
            return null;
        }

        if (currentNode.value == value) {
            return  currentNode;
        }
        if (value < currentNode.value) {
            return currentNode.left = rSearch(currentNode.left, value);
        }else{
         return    currentNode.right = rSearch(currentNode.right, value);
        }
    }
    public void rSearch(int value){
        if (root == null) {
            return;
        }
        rSearch(root, value);
    }

}
