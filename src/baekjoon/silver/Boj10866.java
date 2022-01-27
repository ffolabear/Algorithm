package baekjoon.silver;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Boj10866 {

    static List<Integer> queue = new ArrayList<>();
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String command = br.readLine();



        }
    }

    static void push(int element) {
        queue.add(element);
    }

    static int pop() throws IOException {

        if (queue.size() == 0) {
            return -1;

        } else {

            int index = queue.get(0);
            queue.remove(0);
            return index;
        }


    }


    static int size() {

        return queue.size();
    }

    static int empty() {

        if (queue.size() == 0) {
            return 1;
        } else {
            return 0;
        }

    }

    static int front() {

        if (queue.size() == 0) {
            return -1;
        } else {

            return queue.get(0);
        }
    }

    static int back() {
        if (queue.size() == 0) {
            return -1;
        } else {
            return queue.get(queue.size() - 1);
        }

    }

}
