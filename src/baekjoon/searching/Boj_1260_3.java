package baekjoon.searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj_1260_3 {

    static int N, M, V;
    static ArrayList<Integer>[] node;
    static boolean[] visited;
    static StringBuilder sb_dfs = new StringBuilder();
    static StringBuilder sb_bfs = new StringBuilder();

    private void dfs(int V) {

        if (visited[V]) {
            return;
        } else {

            //자기 자신을 다시 방문하면 안되기 때문에
            visited[V] = true;
            sb_dfs.append(V).append(" ");

            for (int i = 0; i < node[V].size(); i++) {
                int temp = node[V].get(i);

                if (!visited[temp]) {
                    dfs(temp);
                }
            }

        }
    }

    private void bfs(int V) {

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(V);
        visited[V] = true;

        while (!queue.isEmpty()) {

            int temp = queue.poll();
            sb_bfs.append(temp).append(" ");

            for (int i : node[temp]) {
                if (!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }

            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        node = new ArrayList[N + 1];
        visited = new boolean[N + 1];

        for (int i = 0; i <= N; i++) {
            node[i] = new ArrayList<>();
        }

        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            node[from].add(to);
            node[to].add(from);
        }

        Boj_1260_3 sol = new Boj_1260_3();
        sol.dfs(V);

        visited = new boolean[N + 1];

        sol.bfs(V);
        System.out.println(sb_dfs);
        System.out.println(sb_bfs);

    }
}
