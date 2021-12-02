package Programmers.level02;

import java.util.LinkedList;
import java.util.Queue;

public class CorrectBracket {
    boolean solution(String s) {
        boolean answer = true;

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));

        }

        System.out.println(queue);

        return answer;
    }

    public static void main(String[] args) {

        String s = "()()";

        CorrectBracket sol = new CorrectBracket();
        sol.solution(s);

    }
}
