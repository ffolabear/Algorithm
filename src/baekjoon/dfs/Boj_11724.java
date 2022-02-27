package baekjoon.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Boj_11724 {

    static int N, M;
    static ArrayList<Integer>[] node;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        node = new ArrayList[N + 1];

        for (int i = 0; i <= N; i++) {
            node[i] = new ArrayList<>();
        }

        M = Integer.parseInt(br.readLine());
        visited = new boolean[N + 1];

        for (int i = 0; i < M; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            node[from].add(to);
            node[to].add(from);

        }



    }
}
