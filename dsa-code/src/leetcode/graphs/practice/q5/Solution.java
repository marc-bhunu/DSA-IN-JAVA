package leetcode.graphs.practice.q5;

import java.util.*;

public class Solution {

    public int countComponents(int n, int[][] edges) {

        int components = 0;
        Map<Integer, ArrayList<Integer>> adjList = new HashMap<>();
        Set<Integer> visited = new HashSet<>();

        for (int i = 0; i < n; i++) {
            adjList.put(i, new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        for (int i = 0; i < n; i++) {
            if (!visited.contains(i)) {
                visited.add(i);
                dfs(i, adjList, visited);
                components++;
            }
        }

        return components;
    }

    private void dfs(int currentNode, Map<Integer, ArrayList<Integer>> adjList, Set<Integer> visited) {
        visited.add(currentNode);
        for (int neighbour : adjList.get(currentNode)) {
            if (!visited.contains(neighbour)) {
                dfs(neighbour, adjList, visited);
            }
        }
    }
}
