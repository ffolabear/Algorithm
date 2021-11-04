package Programmers.level02;

import java.util.LinkedList;
import java.util.Queue;

public class H_index {

    public int solution(int[] citations) {

        Queue<Integer> queue = new LinkedList<>();
        int answer = 0;

        for (int i : citations) {
            queue.add(i);
        }

        for (int i = 0; i < citations.length; i++) {

            int over = 0;
            int low = 0;

            Queue<Integer> clone = new LinkedList<>(queue);
            System.out.println("현재 : " + citations[i]);

            while (!clone.isEmpty()) {
                if (clone.peek() >= citations[i]) {
                    clone.poll();
                    over++;
                } else if (clone.peek() < citations[i]) {
                    clone.poll();
                    low++;
                }


            }

            System.out.println("over : " + over + " | low : " + low);
            if (over > low) {
                answer = Math.max(answer, over);
            }
            System.out.println(answer);
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] citation = {3, 0, 6, 1, 5};

        H_index sol = new H_index();
        sol.solution(citation);

    }
}
