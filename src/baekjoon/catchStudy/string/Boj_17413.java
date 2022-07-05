package baekjoon.catchStudy.string;

import java.io.*;
import java.util.Stack;

public class Boj_17413 {

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    private static void printStack(Stack<Character> stack) throws IOException {

        while (!stack.isEmpty()) {
            bw.append(stack.pop());
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        Stack<Character> stack = new Stack<>();

        boolean isBetweenTag = false;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '<') {
                printStack(stack);
                isBetweenTag = true;
                bw.append('<');

            } else if (input.charAt(i) == '>'){
                isBetweenTag = false;
                bw.append('>');

            } else if (isBetweenTag) {
                bw.append(input.charAt(i));

            } else {
                //태그 사이가 아닐떼
                if (input.charAt(i) == ' ') {
                    printStack(stack);
                    bw.append(' ');
                } else {
                    stack.push(input.charAt(i));
                }

            }

        }

        printStack(stack);

        bw.flush();
        bw.close();

    }

}
