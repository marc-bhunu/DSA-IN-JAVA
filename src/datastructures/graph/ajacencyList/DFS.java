package datastructures.graph.ajacencyList;

import java.util.*;

public class DFS {

    /**
     * Iterative
     * */
    public void dfsPrint(HashMap<String, ArrayList<String>> graph, String source) {
        Stack<String> stack = new Stack<>();
        Set<String> visited = new HashSet<>();
        stack.push(source);
        visited.add(source);
        while (!stack.isEmpty()) {
            String element = stack.pop();
            System.out.print(" " + element);
            for (String neighbor : graph.get(element)) {
                if (!visited.contains(neighbor)) {
                    stack.push(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }

    /**
     * Recursive
     * */
    public void rDFSPrint(HashMap<String, ArrayList<String>> graph, String source, HashSet<String> visited){
        if (visited.contains(source)) return;
        System.out.println("source = " + source);
        visited.add(source);
        for(String neighbour: graph.get(source)){
            rDFSPrint(graph, neighbour, visited);
        }
    }

    public void rDFSPrint(HashMap<String, ArrayList<String>> graph, String source){
        rDFSPrint(graph, source, new HashSet<>());
    }


}
