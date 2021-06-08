package Java;

import java.util.LinkedList;
import java.util.Queue;

public class Test {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();


        for (int i = 0; i < 10; i++) {
            queue.add(i);
        }

        Queue<Integer> queue2 = new LinkedList<>();
        queue2 = queue;

        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();

        System.out.println("오리지날 큐 : " + queue.peek());
        System.out.println("오리지날 큐 : " + queue2.peek());
    }
}
