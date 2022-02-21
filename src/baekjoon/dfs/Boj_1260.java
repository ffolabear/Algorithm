package baekjoon.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj_1260 {

    static int N, M, V;
    static ArrayList<Integer>[] adj;

    static boolean[] visited;

    //dfs 결과
    static ArrayList<Integer> result = new ArrayList<>();
    static Queue<Integer> order = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        adj = new ArrayList[N + 1];
        visited = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());

            adj[from].add(to);
            adj[to].add(from);


        }

        for (int i = 1; i < adj.length; i++) {
            Collections.sort(adj[i]);

        }


        for (int i = 0; i < adj.length; i++) {
            System.out.println(adj[i]);
        }

        System.out.println();
        dfs(1);

        System.out.println(result);

    }

    static void dfs(int current) {
        if (visited[current]) {
            return;
        }

        result.add(current);
        visited[current] = true;
        for (int i = 0; i < adj[current].size(); i++) {
            dfs(adj[current].get(i));
        }
    }

    static void bfs() {



    }

}
