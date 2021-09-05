package Programmers.Heap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DiskController {

    public static int solution(int[][] jobs) {


        int answer = 0;
        int count = 0;
        int job = 0;
        int end = 0;

        Arrays.sort(jobs, (o1, o2) -> o1[1] - o2[1]);
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);

        while (count < jobs.length) {

            while (job < jobs.length && jobs[job][0] <= 0) {

                priorityQueue.add(jobs[job++]);
            }

            if (priorityQueue.isEmpty()) {
                end = jobs[job][0];
            } else{
                int[] temp = priorityQueue.poll();
                answer += temp[1] + end - temp[0];
                end += temp[1];
                count++;

            }

        }


        return (int) Math.floor(answer / jobs.length);
    }

    public static void main(String[] args) {

        int[][] jobs = {{0, 3}, {1, 9}, {2, 6}};
//        int[][] jobs = {{0, 10}, {2, 10}, {9, 10}, {15, 2}};
//        int[][] jobs = {{0, 10}, {2, 12}, {9, 19}, {15, 17}};
//        int[][] jobs = {{1000, 1000}};
//        int[][] jobs = {{0, 1}, {0, 1}, {0, 1}};
        solution(jobs);

    }


}
