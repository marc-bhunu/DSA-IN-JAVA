package leetcode.graphs.numberofconnectedcomponents;

import java.util.*;

class Solution {

    public int countComponents(int n, int[][] edges) {
        Map<Integer, ArrayList<Integer>> adjList = new HashMap<>();
        Set<Integer> seen = new HashSet<>();
        int res = 0;
        for (int i = 0; i < n; i++) {
            adjList.put(i, new ArrayList<>());
        }

        for(int[] edge: edges){
            int u = edge[0];
            int v = edge[1];
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        for (int node = 0; node < n; node++) {
            if (!seen.contains(node)) {
                dfsHelper(adjList, seen, node);
                res++;
            }
        }

        return res;
    }

    public void dfsHelper(Map<Integer, ArrayList<Integer>> graph, Set<Integer> seen, Integer source){
        seen.add(source);
        for(int neighbour: graph.get(source)){
            if (!seen.contains(neighbour)) {
                dfsHelper(graph, seen, neighbour);
            }
        }
    }

}

