package programmers.heap;

import java.util.PriorityQueue;

public class Spicier {

    public static int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < scoville.length; i++) {
            priorityQueue.offer(scoville[i]);
        }


        while (priorityQueue.peek() < K) {

            if (priorityQueue.size() == 1) {
                return -1;
            }
            int food1 = priorityQueue.poll();
            int food2 = priorityQueue.poll();
            int mixed = food1 + (food2 * 2);
            priorityQueue.offer(mixed);
            answer++;

        }
        return answer;
    }


    public static void main(String[] args) {
        int[] scovile = {1, 2, 3, 9, 10, 12};
        int k = 7;
        solution(scovile, k);

    }


}
