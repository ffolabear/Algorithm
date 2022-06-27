package baekjoon.catch_DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj_9012 {

    private static String solution(String current) {

        String ans = "YES";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < current.length(); i++) {
            Character temp = current.charAt(i);
            if (temp == '(') {
                stack.add(temp);

            } else {
                if (stack.isEmpty()) {
                    ans = "NO";
                    return ans;
                } else {
                    stack.pop();
                }


            }
        }

        if (stack.size() != 0) {
            ans = "NO";
        }


        return ans;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String current = br.readLine();
            System.out.println(solution(current));

        }

    }

}
