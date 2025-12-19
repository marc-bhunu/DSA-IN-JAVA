package leetcode.graphs.clonegraph;

import java.util.HashMap;
import java.util.Map;



public class Solution {

     public Node cloneGraph(Node node) {
        Map<Node, Node> oldNodeNewNode = new HashMap<>();
        return dfsCloneHelper(oldNodeNewNode, node);
    }

    private Node dfsCloneHelper(Map<Node, Node> map, Node currentNode){
        if (currentNode == null) {
            return null;
        }

        if (map.containsKey(currentNode)) {
            return map.get(currentNode);
        }

        Node copy = new Node(currentNode.val);

        map.put(currentNode, copy);

        for (Node neighbour: currentNode.neighbors){
            copy.neighbors.add(dfsCloneHelper(map, neighbour));
        }

        return copy;
    }
}
