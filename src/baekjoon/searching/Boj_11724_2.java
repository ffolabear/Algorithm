package baekjoon.searching;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Boj_11724_2 {

    static int N, M, answer;
    static ArrayList<Integer>[] adj;
    static boolean[] isVisited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        adj = new ArrayList[N + 1];
        for (int i = 0; i <= N; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {

            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());


            adj[u].add(v);
            adj[v].add(u);
        }

        for (ArrayList<Integer> list : adj) {
            System.out.println(list);
        }

        isVisited = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            if (dfs(i)) {
                answer++;
            }
        }

        bw.append(String.valueOf(answer));
        bw.flush();
        bw.close();

    }

    private static boolean dfs(int current) {

        if (isVisited[current]) {
            return false;
        } else {
            isVisited[current] = true;
        }

        for (int i : adj[current]) {
            if (!isVisited[i]) {
                dfs(i);
            }
        }


        return true;
    }


}
