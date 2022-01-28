package baekjoon.silver;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Boj10845_deque {

    static List<Integer> deque = new ArrayList<>();
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String command = br.readLine();

            if (command.matches("push_front.*")) {
                String[] input = command.split(" ");
                push_front(Integer.parseInt(input[1]));

            } else if (command.matches("push_back.*")) {
                String[] input = command.split(" ");
                push_back(Integer.parseInt(input[1]));

            }else if (command.matches("pop_front")) {
                bw.write(pop_front() + "\n");

            }else if (command.matches("pop_back")) {
                bw.write(pop_back() + "\n");

            } else if (command.matches("size")) {
                bw.write(size() + "\n");

            } else if (command.matches("empty")) {
                bw.write(empty() + "\n");

            } else if (command.matches("front")) {
                bw.write(front() +  "\n");

            } else if (command.matches("back")) {
                bw.write(back() + "\n");

            }

            System.out.println(command + " " + deque);

        }

        bw.flush();
        bw.close();

    }


    static void push_front(int element) {
        deque.add(0, element);
    }

    static void push_back(int element) {
        deque.add(element);
    }


    static int pop_front() throws IOException {

        if (deque.size() == 0) {
            return -1;

        } else {

            int index = deque.get(0);
            deque.remove(0);
            return index;
        }
    }

    static int pop_back() throws IOException {

        if (deque.size() == 0) {
            return -1;

        } else {

            int index = deque.get(deque.size() - 1);
            deque.remove(deque.size() - 1);
            return index;
        }
    }


    static int size() {

        return deque.size();
    }

    static int empty() {

        if (deque.size() == 0) {
            return 1;
        } else {
            return 0;
        }

    }

    static int front() {

        if (deque.size() == 0) {
            return -1;
        } else {

            return deque.get(0);
        }
    }

    static int back() {
        if (deque.size() == 0) {
            return -1;
        } else {
            return deque.get(deque.size() - 1);
        }

    }

}
