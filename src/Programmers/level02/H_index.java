package Programmers.level02;

import java.util.PriorityQueue;

public class H_index {
    public int solution(int[] citations) {


        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < citations.length; i++) {
            queue.add(citations[i]);
        }

        System.out.println(queue);


        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {

        int[] citation = {3, 0, 6, 1, 5};

        H_index sol = new H_index();
        sol.solution(citation);

    }
}
