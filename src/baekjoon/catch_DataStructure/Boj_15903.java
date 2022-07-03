package baekjoon.catch_DataStructure;

import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Boj_15903 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        PriorityQueue<Long> pq = new PriorityQueue<>();

        while (st.hasMoreTokens()) {
            pq.add(Long.parseLong(st.nextToken()));

        }

        if (n > 1) {
            for (int i = 0; i < m; i++) {
                Long sum = pq.poll() + pq.poll();
                pq.add(sum);
                pq.add(sum);

            }
        }

        Long ans = 0l;

        while (!pq.isEmpty()) {
            ans += pq.poll();
        }

        bw.append(String.valueOf(ans));
        bw.flush();
        bw.close();

    }

}
