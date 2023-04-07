package lecture.stackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Curriculum {

    private void solution(String plan, String order) {

        char[] planArr = plan.toCharArray();
        char[] orderArr = order.toCharArray();

        Queue<Character> planQueue = new LinkedList<>();
        Queue<Character> orderQueue = new LinkedList<>();

        for (int i = 0; i < planArr.length; i++) {
            planQueue.add(planArr[i]);
        }

        for (int i = 0; i < orderArr.length; i++) {
            orderQueue.add(orderArr[i]);
        }

        while (!planQueue.isEmpty()) {

            if (orderQueue.isEmpty()) {
                System.out.println("YES");
                break;
            }

            char current = planQueue.poll();

            if (orderQueue.peek() == current) {
                orderQueue.poll();
            }

        }

        if (!orderQueue.isEmpty()) {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String order = in.next();
        String plan = in.next();
        Curriculum sol = new Curriculum();
        sol.solution(plan, order);

    }
}
