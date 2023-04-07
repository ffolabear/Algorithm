package programmers.heap;

import java.util.PriorityQueue;

public class PriorityQueueTest {

    public static void main(String[] args) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < 10; i++) {
            priorityQueue.offer(i);
        }

        System.out.println(priorityQueue);

    }
}
