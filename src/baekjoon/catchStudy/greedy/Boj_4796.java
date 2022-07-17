package baekjoon.catchStudy.greedy;

import java.io.*;
import java.util.StringTokenizer;

public class Boj_4796 {

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 1;

        while (true) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            //캠핑장을 연속하는 P일 중, L 일동안만 사용할 수 있다. 강산이는 이제 막 V일짜리 휴가를 시작했다.
            // 강산이가 캠핑장을 최대 며칠동안 사용할 수 있을까?

            int L = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());

            if (L == 0 && P == 0 && V == 0) {
                break;
            }

            calculate(L, P, V, count++);

        }

        bw.flush();
        bw.close();

    }

    private static void calculate(int L, int P, int V, int count) throws IOException {

        int ans = 0;

        ans = (V / P) * L + Math.min((V % P), L);

        bw.append("Case ").append(String.valueOf(count)).append(": ").append(String.valueOf(ans)).append('\n');
    }

}
