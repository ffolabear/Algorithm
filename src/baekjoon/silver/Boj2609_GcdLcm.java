package baekjoon.silver;

import java.io.*;
import java.util.StringTokenizer;

public class Boj2609_GcdLcm {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        N = Math.max(N, M);
        M = Math.min(N, M);

        int GCD = 1;
        int LCM = M;

        for (int i = 1; i <= M; i++) {
            if (N % i == 0) {
                if (M % i == 0) {
                    GCD = Math.max(GCD, i);
                }
            }
        }

        bw.append(String.valueOf(GCD)).append("\n");

        for (int i = 1; i <= N * M; i++) {
            if (M * i % N == 0) {
                LCM = M * i;
                break;
            }

        }

        bw.append(String.valueOf(LCM));
        bw.flush();
        bw.close();

    }

}
