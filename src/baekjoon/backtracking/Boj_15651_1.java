package baekjoon.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_15651_1 {

    static int N;
    static int M;
    static int[] selected;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        selected = new int[M + 1];

        dfs(1);
        System.out.println(sb);

    }

    static void dfs(int depth) {

        if (depth == M + 1) {
            for (int i = 1; i <= M; i++) {
                sb.append(selected[i]).append(" ");
            }
            sb.append('\n');
            return;
        } else {

            for (int i = 1; i <= N; i++) {
                selected[depth] = i;
                dfs(depth + 1);
            }
        }

    }

}
