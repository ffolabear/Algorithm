package baekjoon.catchStudy.datastructure;

import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Boj_11286 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {

                Integer o1abs = Math.abs(o1);
                Integer o2abs = Math.abs(o2);
                if (o1abs > o2abs) {
                    return o1abs - o2abs;
                } else if (o1abs.equals(o2abs)) {
                    return o1 - o2;
                } else {
                    return -1;
                }

            }
        });

        for (int i = 0; i < N; i++) {

            int current = Integer.parseInt(br.readLine());

            if (current != 0) {
                pq.add(current);
            } else {
                if (pq.isEmpty()) {
                    bw.append(String.valueOf(0)).append('\n');
                } else {
                    bw.append(String.valueOf(pq.poll())).append('\n');
                }
            }
        }

        bw.flush();
        bw.close();

    }
}
