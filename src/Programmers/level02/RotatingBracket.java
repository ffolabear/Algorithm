package Programmers.level02;

import java.util.LinkedList;
import java.util.Queue;

public class RotatingBracket {


    public int solution(String s) {

        int answer = -1;

        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            queue.add(s.charAt(i));
        }

        System.out.println(queue);

        int max = s.length();
        int  count = 0;

        String testcase = "";

        for (int i = 0; i < max - 1; i++) {
            System.out.println(i);

            Queue<Character> copy = new LinkedList<>(queue);

            while (!copy.isEmpty()) {
                testcase += copy.poll();
            }

            if (isValid(testcase)) {
                count++;
            }

            Character ch =  queue.poll();
            queue.add(ch);

            System.out.println(queue);
            testcase = "";

        }



        return answer;
    }

    static boolean isValid(String str) {

        str.replaceAll(" ", "");

        for (int i = 0; i < str.length(); i++) {

        }

        return true;
    }

    public static void main(String[] args) {

        String s =  "[](){}";
//        String s =  "}]()[{";
//        String s =  "[)(]";
//        String s =  "}}}";

        RotatingBracket sol = new RotatingBracket();
        sol.solution(s);


    }


}
