package Lecture.greedy;

import java.util.*;

public class MaximumProfitSchedule {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        ArrayList<Node> schedule = new ArrayList<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        int maxDay = Integer.MIN_VALUE;
        int ans = 0;

        for (int i = 0; i < N; i++) {
            int money = in.nextInt();
            int due = in.nextInt();
            maxDay = Math.max(maxDay, due);
            schedule.add(new Node(due, money));
        }

        Collections.sort(schedule, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                if (o1.x != o2.x) {
                    return o2.x - o1.x;
                } else {
                    return o2.y - o1.y;

                }
            }
        });

        for (Node n : schedule) {
            System.out.println(n.x + " " + n.y);
        }

        System.out.println("----------------");

        int j = 0;
        for (int i = maxDay; i >= 1; i--) {
            for (; j < N; j++) {
                if (schedule.get(j).x < i) {
                    break;
                }
                priorityQueue.offer(schedule.get(j).y);
            }
            if (!priorityQueue.isEmpty()) {
                ans += priorityQueue.poll();
            }

        }

        System.out.println(ans);

    }


}
