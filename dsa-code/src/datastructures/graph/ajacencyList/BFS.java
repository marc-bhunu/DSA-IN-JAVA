package datastructures.graph.ajacencyList;

import java.util.*;

public class BFS {

    public void bfs(HashMap<String, ArrayList<String>> graph, String source){
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.add(source);
        visited.add(source);

        while (!queue.isEmpty()){
            String element = queue.remove();
            System.out.print(" " + element);
            for (String neighbour: graph.get(element)){
                if (!visited.contains(neighbour)) {
                    queue.add(neighbour);
                    visited.add(neighbour);
                }
            }
        }


    }

}
