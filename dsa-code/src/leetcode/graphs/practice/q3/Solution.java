package leetcode.graphs.practice.q3;

import java.util.*;

public class Solution {

    public boolean validTree(int n, int[][] edges) {
        if (edges.length != n - 1) return false;
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

        System.out.println(adjList);
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, -1});
        visited.add(0);

        while (!queue.isEmpty()) {

            int[] point = queue.poll();
            int currentNode = point[0];
            int parent = point[1];

            for (int neighbour : adjList.get(currentNode)) {
                if (parent == neighbour) continue;
                if (visited.contains(neighbour)) return false;
                queue.add(new int[]{neighbour, currentNode});
                visited.add(neighbour);
            }
        }

        return  visited.size() == n;
    }
}
