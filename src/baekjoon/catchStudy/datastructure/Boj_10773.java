package baekjoon.catchStudy.datastructure;

import java.io.*;
import java.util.Stack;

public class Boj_10773 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int K = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < K; i++) {
            int current = Integer.parseInt(br.readLine());

            if (current == 0) {
                stack.pop();
            } else {
                stack.add(current);
            }
        }

        int ans = 0;

        while (!stack.isEmpty()) {
            ans += stack.pop();
        }

        bw.append(String.valueOf(ans));
        bw.flush();

    }

}
