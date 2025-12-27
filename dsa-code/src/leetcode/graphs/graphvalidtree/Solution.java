package leetcode.graphs.graphvalidtree;

import java.util.*;

class Solution {

    public boolean validTree(int n, int[][] edges) {

        if (edges.length != n - 1) return false;

        Set<Integer> visited = new HashSet<>();
        Map<Integer, ArrayList<Integer>> adjList = new HashMap<>();

        for (int i = 0; i < n; i++) {
            adjList.put(i, new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        if (containsCycle(0, -1, adjList, visited)) {
            return false;
        }

        return visited.size() == n;
    }

    public boolean containsCycle(int node, int parent, Map<Integer, ArrayList<Integer>> adjList, Set<Integer> visited) {
        visited.add(node);

        for (int neighbour : adjList.get(node)) {

            if (!visited.contains(neighbour)) {
                if (containsCycle(neighbour, node, adjList, visited)) {
                    return true;
                }
            } else if (neighbour != parent) {
                return true;
            }
        }
        return false;
    }
}


