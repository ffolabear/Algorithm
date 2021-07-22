package Programmers.Test;

import java.util.*;

public class queue_printer {


    public int solution(int[] priorities, int location) {
        int answer = 1;

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : priorities) {
            priorityQueue.offer(i);
        }

        while (!priorityQueue.isEmpty()) {

            for (int i = 0; i < priorities.length; i++) {

                if (priorities[i] == priorityQueue.peek()){
                    if (location == i){
                        return answer;
                    }

                    answer++;
                    priorityQueue.poll();
                }
            }

        }

        return answer;
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 9, 1, 1, 1};
        queue_printer printer = new queue_printer();

        System.out.println(printer.solution(arr, 0));


    }


}
