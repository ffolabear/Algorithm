package programmers.level02;

import java.util.*;

public class Printer1 {


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
        Printer1 printer = new Printer1();

        System.out.println(printer.solution(arr, 0));


    }


}
