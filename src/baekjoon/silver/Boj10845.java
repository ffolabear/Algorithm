package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj10845 {

    static List<Integer> stack = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String command = br.readLine();
            if (command.matches("[push\b\\s]")) {
                System.out.println("1");
            }else if (command.matches("pop")) {
                System.out.println("2");
            }else if (command.matches("size")) {
                System.out.println("3");
            }else if (command.matches("empty")) {
                System.out.println("4");
            }else if (command.matches("front")) {
                System.out.println("5");
            }else if (command.matches("back")) {
                System.out.println("6");
            }

        }


    }


    static void push(int element) {


    }

    static void pop() {

    }

    static int size() {

        return stack.size();
    }

    static int empty() {

        if (stack.size() == 0) {
            return 1;
        } else {
            return 0;
        }

    }

    static int front() {

        if (stack.size() == 0) {
            return -1;
        } else {

            return stack.get(0);
        }
    }

    static int back() {
        if (stack.size() == 0) {
            return -1;
        } else {
            return stack.get(stack.size() - 1);
        }

    }

}
