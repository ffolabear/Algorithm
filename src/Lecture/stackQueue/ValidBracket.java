package Lecture.stackQueue;

import java.util.Scanner;
import java.util.Stack;

public class ValidBracket {

    private void solution(String input) {

        Stack<Character> stack = new Stack<>();
        char[] inputArr = input.toCharArray();
        boolean isValid = true;

        //( ( () () ) ())) )
        //))

        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] == '(') {
                stack.add('(');
            } else if (inputArr[i] == ')') {
                if (stack.isEmpty()) {
                    isValid = false;
                    break;
                } else{
                    stack.pop();
                }
            }

            System.out.println(stack);
        }

        if (isValid && stack.isEmpty()) {
            System.out.println("YES");
        } else if (!isValid) {
            System.out.println("NO");

        }


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        ValidBracket sol = new ValidBracket();
        sol.solution(input);

    }

}
