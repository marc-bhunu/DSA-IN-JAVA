package datastructures.recursion;

public class ContstructBST {
    static class Node {
        Node left;
        Node right;
        int value;

        Node(int value) {
            this.value = value;
        }

    }

    public static Node build(int[] arr, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = left + (right - left) / 2;
        Node newNode = new Node(arr[mid]);
        newNode.left = build(arr, left = 0, mid - 1);
        newNode.right = build(arr, mid + 1, arr.length - 1);
        return newNode;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int left = 0;
        int right = arr.length - 1;
        Node node = build(arr, left, right);
        System.out.println(node.value);
    }
}
