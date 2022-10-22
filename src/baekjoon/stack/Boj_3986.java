package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj_3986 {

    static int cnt = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String input = br.readLine();

            function(input);
        }

        System.out.println(cnt);

    }

    private static void function(String input) {

        Stack<Character> stack = new Stack<>();
        stack.add(input.charAt(0));
        for (int i = 1; i < input.length(); i++) {


            if (stack.empty() || stack.peek() != input.charAt(i)) {
                stack.push(input.charAt(i));
            } else if (stack.peek() == input.charAt(i)){
                stack.pop();
            }
        }

        if (stack.empty()) {
            cnt++;
        }
    }

}
