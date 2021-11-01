package Programmers.level02;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class RotatingBracket {

    public int solution(String s) {

        int answer = -1;

        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            queue.add(s.charAt(i));
        }


        int max = s.length();

        String testcase = "";

        for (int i = 0; i < max - 1; i++) {

            Queue<Character> copy = new LinkedList<>(queue);

            while (!copy.isEmpty()) {
                testcase += copy.poll();
            }

            if (isValid(testcase)) {
                System.out.println("correct : " + queue);
                answer++;
            }

            Character ch = queue.poll();
            queue.add(ch);

            testcase = "";

        }

        return answer;
    }

    static boolean isValid(String str) {

        Stack<Character> stack = new Stack<>();

        int left = 0;
        int right = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {
                left++;
                stack.push('(');
            } else {
                right++;
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }

            }

        }

        if (left == right) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

//        String s = "[](){}";
        String s =  "}]()[{";
//        String s =  "[)(]";
//        String s =  "}}}";

        RotatingBracket sol = new RotatingBracket();
        sol.solution(s);


    }


}
