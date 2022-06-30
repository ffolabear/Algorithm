package baekjoon.catch_DataStructure;

import java.io.*;
import java.util.Stack;

public class Boj_2504 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        Stack<Character> stack = new Stack<>();

        int result = 0;
        int mul = 1;

        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case '(':
                    stack.push('(');
                    mul *= 2;
                    break;

                case '[':
                    stack.push('[');
                    mul *= 3;
                    break;

                case ')':
                    if (stack.isEmpty() || stack.peek() != '(') {
                        result = 0;
                        break;
                    }

                    if (str.charAt(i - 1) == '(') result += mul;
                    stack.pop();
                    mul /= 2;
                    break;

                case ']':
                    if (stack.isEmpty() || stack.peek() != '[') {
                        result = 0;
                        break;
                    }

                    if (str.charAt(i - 1) == '[') result += mul;
                    stack.pop();
                    mul /= 3;
                    break;
            }



        }
        if (!stack.isEmpty()) {
            bw.append('0');
        } else {
            bw.append(String.valueOf(result));
        }

        bw.flush();
        bw.close();

    }
}