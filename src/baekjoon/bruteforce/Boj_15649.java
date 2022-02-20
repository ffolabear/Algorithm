package baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_15649 {

    static StringBuilder sb = new StringBuilder();
    static int N, M;
    static int[] selected;

    static void input() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String init = bf.readLine();

        StringTokenizer st = new StringTokenizer(init);
        while (st.hasMoreTokens()) {
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
        }

        selected = new int[M + 1];
    }

    static void recurFunc(int k) {

        if (k == M + 1) {
            for (int i = 1; i <= M; i++) {
                sb.append(selected[i]).append(" ");
            }
            sb.append('\n');
        } else {

            for (int i = 1; i <= N; i++) {
                boolean chk = false;
                for (int j = 1; j < k; j++) {
                    if (i == selected[j]) {
                        chk = true;
                    }
                }


                if (!chk) {
                    selected[k] = i;
                    recurFunc(k + 1);
                    selected[k] = 0;
                }
            }

        }

    }

    public static void main(String[] args) throws IOException {
        input();
        recurFunc(1);
        System.out.println(sb.toString());

    }


}
