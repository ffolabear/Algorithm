package baekjoon.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 중복되는 수열을 여러 번 출력하면 안되며,
 * 각 수열은 공백으로 구분해서 출력해야 한다.
 * 수열은 사전 순으로 증가하는 순서로 출력해야 한다.
 */

public class Boj_15649_2 {

    static int N, M;

    static int[] selected;
    static boolean[] isVisited;
    static StringBuilder sb = new StringBuilder();



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        selected = new int[M + 1];
        isVisited = new boolean[N + 1];

        dfs(1);
        System.out.println(sb);

    }

    static void dfs(int depth) {

        if (depth == M + 1) {
            for (int i = 1; i < selected.length; i++) {
                sb.append(selected[i]).append(' ');
            }
            sb.append("\n");
            return;

        } else {

            for (int i = 1; i <= N; i++) {
                if (isVisited[i]) {
                    continue;
                }
                selected[depth] = i;
                isVisited[i] = true;
                dfs(depth + 1);
                isVisited[i] = false;

            }
        }
    }

}

