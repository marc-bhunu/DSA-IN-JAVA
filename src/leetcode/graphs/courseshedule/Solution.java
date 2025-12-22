package leetcode.graphs.courseshedule;

import java.util.*;

public class Solution {


    public boolean canFinish(int numCourses, int[][] prerequisites){

        Map<Integer, ArrayList<Integer>> adjList = new HashMap<>();
        int[] indeg = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            adjList.put(i, new ArrayList<>());
        }

        for (int[] prerequisite : prerequisites){
            int prereqToCourse = prerequisite[1];
            int courseToBeTaken = prerequisite[0];

            adjList.get(prereqToCourse).add(courseToBeTaken);
            indeg[courseToBeTaken]++;
        }

        System.out.println(adjList);
        System.out.println(Arrays.toString(indeg));

        Queue<Integer> queue = new LinkedList<>();
        for (int course = 0; course < numCourses; course++) {
            if (indeg[course] == 0) {
                queue.offer(course);
            }
        }

        while(!queue.isEmpty()){

            int currentCourse = queue.poll();
            numCourses--;

            for (int dependentCourse: adjList.get(currentCourse)){
                indeg[dependentCourse]--;
                if (indeg[dependentCourse] == 0) {
                    queue.offer(dependentCourse);
                }
            }
        }


        return numCourses == 0;
    }
}
