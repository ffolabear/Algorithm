package baekjoon.catch_DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Boj_10828 {

    static ArrayList<Integer> stack = new ArrayList<>();

    static void push(int x) {
        stack.add(x);
    }

    static int pop() {

        int last = -1;

        if (stack.size() == 0) {
            return last;
        } else {
            last = stack.get(stack.size() - 1);
            stack.remove(stack.size() - 1);
        }
        return last;
    }

    static int size() {

        return stack.size();
    }

    static int empty() {

        if (stack.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }

    static int top() {
        if (stack.isEmpty()) {
            return -1;
        } else {
            return stack.get(stack.size() - 1);
        }
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String[] current = br.readLine().split(" ");

            if (current[0].equals("push")) {
                push(Integer.parseInt(current[1]));
            }

            if (current[0].equals("pop")) {
                System.out.println(pop());
            }

            if (current[0].equals("size")) {
                System.out.println(size());
            }

            if (current[0].equals("empty")) {
                System.out.println(empty());
            }

            if (current[0].equals("top")) {
                System.out.println(top());
            }

        }

    }

}
