package leetcode.graphs.graphvalidtree;

import java.util.*;

public class BFS {

    public boolean validTree(int n, int[][] edges) {
        if (edges.length != n - 1) return false;

        Set<Integer> seen = new HashSet<>();
        Map<Integer, ArrayList<Integer>> adjList = new HashMap<>();

        for (int i = 0; i < n; i++) {
            adjList.put(i , new ArrayList<>());
        }

        for(int[] edge: edges){
            int u = edge[0];
            int v = edge[1];

            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }


        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, -1});
        seen.add(0);

        while(!queue.isEmpty()){
            int [] vertex = queue.poll();

            int node   = vertex[0];
            int parent = vertex[1];

            for(int neighbour: adjList.get(node)){
                if (neighbour == parent) continue;
                if (seen.contains(neighbour)) return false;
                queue.add(new int[]{neighbour, node});
                seen.add(neighbour);
            }

        }

        return seen.size() == n;
    }
}
