package Leetcode;

import java.util.Stack;

public class Leet_0020 {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                if (stack.peek() == '(' && s.charAt(i) == ')') {
                    stack.pop();
                } else if ((stack.peek() == '{' && s.charAt(i) == '}')) {
                    stack.pop();
                } else if ((stack.peek() == '[' && s.charAt(i) == ']')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        if (stack.size() == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "()[]{}";
        Leet_0020 sol = new Leet_0020();
        System.out.println(sol.isValid(s));
    }

}
