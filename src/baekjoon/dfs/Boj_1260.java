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
    static ArrayList<Integer> dfs_result = new ArrayList<>();
    static ArrayList<Integer> bfs_result = new ArrayList<>();

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
        bfs(1);

        System.out.println(dfs_result);
        System.out.println(bfs_result);

    }

    static void dfs(int current) {
        if (visited[current]) {
            return;
        }

        dfs_result.add(current);
        visited[current] = true;
        for (int i = 0; i < adj[current].size(); i++) {
            dfs(adj[current].get(i));
        }
    }

    static void bfs(int start) {

        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {

            int temp = queue.poll();
            bfs_result.add(temp);

            for (int i = 0; i < adj[temp].size(); i++) {
                int current = adj[temp].get(i);

                if (!visited[current]) {
                    visited[current] = true;
                    queue.add(current);
                }

            }

        }

    }

}
