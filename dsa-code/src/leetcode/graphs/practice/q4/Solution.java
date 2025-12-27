package leetcode.graphs.practice.q4;

import java.util.*;

public class Solution {

    public boolean canFinish(int numCourses, int[][] prerequisites){

        Map<Integer, ArrayList<Integer>> adjList = new HashMap<>();
        int[] indegree = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            adjList.put(i, new ArrayList<>());
        }

        for (int[] prerequisite : prerequisites) {
            int courseToBeTaken = prerequisite[0];
            int courseRequired =  prerequisite[1];
            adjList.get(courseRequired).add(courseToBeTaken);
            indegree[courseToBeTaken]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++){
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }

        while(!queue.isEmpty()){
            int currentCourse = queue.poll();
            numCourses--;
            for (int dependentCourse: adjList.get(currentCourse)){
                indegree[dependentCourse]--;
                if (indegree[dependentCourse] == 0) {
                    queue.offer(dependentCourse);
                }
            }
        }

        return numCourses == 0;
    }
}
