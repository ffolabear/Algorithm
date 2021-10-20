package Programmers.level02;

import java.util.Collections;
import java.util.PriorityQueue;

public class Printer2 {

    public int solution(int[] priorities, int location) {

        int answer = 0;

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int priority : priorities) {
            queue.offer(priority);
        }

        while (!queue.isEmpty()) {

            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == queue.peek()) {
                    if (i == location) {
                        return answer;

                    }
                    answer++;
                    queue.poll();
                }
            }


        }

        return answer;
    }

    public static void main(String[] args) {

        int[] priorities = {2, 1, 3, 2};
        int location = 2;

//        int[] priorities = {1, 1, 9, 1, 1, 1};
//        int location = 0;
        Printer2 sol = new Printer2();
        sol.solution(priorities, location);

    }

}
