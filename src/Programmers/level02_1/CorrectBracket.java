package Programmers.level02_1;

import java.util.Stack;

public class CorrectBracket {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();

        int left = 0;
        int right = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
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
                answer = true;
            } else {
                answer = false;
            }

        return answer;
    }

    public static void main(String[] args) {

//        String s = "()()";
        String s = "(()(";

        CorrectBracket sol = new CorrectBracket();

        System.out.println(sol.solution(s));

    }
}
