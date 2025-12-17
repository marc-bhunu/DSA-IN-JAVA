package datastructures.graph.ajacencyList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        Graph myGraph = new Graph();

        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");


        myGraph.addEdge("A", "B");
        myGraph.addEdge("A", "C");
        myGraph.addEdge("B", "C");

        DFS dfs = new DFS();
        BFS bfs = new BFS();
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        map.put("A", new ArrayList<>(List.of("B", "C")));
        map.put("B", new ArrayList<>(List.of("D")));
        map.put("C", new ArrayList<>(List.of("E")));
        map.put("D", new ArrayList<>(List.of("F")));
        map.put("E", new ArrayList<>(List.of()));
        map.put("F", new ArrayList<>(List.of()));


        //dfs.dfsPrint(myGraph.adjList, "A");
        dfs.rDFSPrint(myGraph.adjList, "A");
        //bfs.bfs(myGraph.adjList, "A");

        //myGraph.printGraph();
    }    
}
