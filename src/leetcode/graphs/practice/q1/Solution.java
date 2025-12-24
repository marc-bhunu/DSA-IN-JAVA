package leetcode.graphs.practice.q1;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public Node cloneGraph(Node node) {
        Map<Node, Node> oldToNew = new HashMap<>();
        return dfsHelper(oldToNew, node);
    }

    private Node dfsHelper(Map<Node, Node> oldToNew, Node currentNode) {
        if (currentNode == null) {
            return  null;
        }

        if (oldToNew.containsKey(currentNode)) {
            return oldToNew.get(currentNode);
        }

        Node copy = new Node(currentNode.val);
        oldToNew.put(currentNode, copy);

        for (Node neighbour : currentNode.neighbors){
            if (!oldToNew.containsKey(neighbour)) {
               copy.neighbors.add(dfsHelper(oldToNew, neighbour));
            }
        }
        return  copy;
    }
}