package baekjoon.catch_DataStructure;

import java.io.*;
import java.util.PriorityQueue;

public class Boj_1927 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int current = Integer.parseInt(br.readLine());

            if (current == 0) {
                if (priorityQueue.isEmpty()) {
                    bw.append('0').append('\n');
                } else {
                    bw.append(String.valueOf(priorityQueue.poll())).append('\n');
                }
            }else {

                priorityQueue.add(current);
            }

        }

        bw.flush();
        bw.close();

    }

}
