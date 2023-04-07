package lecture.stackQueue;

import java.util.Scanner;
import java.util.Stack;

public class RemovingCharacter {

    private String solution(String input) {

        char[] arr = input.toCharArray();
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                stack.add('(');
            } else if (arr[i] == ')') {
                stack.pop();
            } else {
                if (stack.isEmpty()) {
                    sb.append(arr[i]);
                }
            }
        }


        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        RemovingCharacter sol = new RemovingCharacter();

        System.out.println(sol.solution(input));

    }

}
