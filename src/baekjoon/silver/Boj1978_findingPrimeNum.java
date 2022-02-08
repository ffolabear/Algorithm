package baekjoon.silver;

import java.io.*;
import java.util.StringTokenizer;

public class Boj1978_findingPrimeNum {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int answer = 0;

        while (st.hasMoreTokens()) {

            int current = Integer.parseInt(st.nextToken());

            int cnt = 0;

            for (int i = 1; i <= current; i++) {

                if (current == 1) {
                    continue;
                }

                if (current % i == 0) {
                    cnt++;
                }

                if (cnt > 2) {
                    continue;
                }


            }

            if (cnt == 2) {
                answer++;
            }

        }

        bw.append(String.valueOf(answer));
        bw.flush();
        bw.close();

    }

}
