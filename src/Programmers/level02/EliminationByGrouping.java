package Programmers.level02;

import java.util.LinkedList;
import java.util.Queue;

public class EliminationByGrouping {



    public int solution(String s) {

        int answer = -1;
        Queue<Character> queue = new LinkedList<>();



        for (int i = 0; i < s.length(); i++) {

            if (queue.isEmpty()) {
                queue.offer(s.charAt(i));

            } else{
                if (queue.peek() == s.charAt(i)) {
                    queue.poll();
                } else {
                    queue.offer(s.charAt(i));
                }
            }


        }

        if (queue.isEmpty()) {
            answer = 1;
        } else {
            answer =  0;
        }

        return answer;
    }


    public static void main(String[] args) {
        String s = "baabaa";
        EliminationByGrouping sol = new EliminationByGrouping();
        sol.solution(s);


    }
}
