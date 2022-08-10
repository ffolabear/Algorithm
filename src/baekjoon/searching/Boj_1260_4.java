package baekjoon.searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj_1260_4 {

    static int N, M, V;
    static ArrayList<Integer>[] node;
    static boolean[] visited;

    static ArrayList<Integer> dfs_result = new ArrayList<>();
    static ArrayList<Integer> bfs_result = new ArrayList<>();

    private static void dfs(int V) {

        if (visited[V]) {
            return;
        } else {

            visited[V] = true;
            dfs_result.add(V);

            for (int i = 0; i < node[V].size(); i++) {
                int current = node[V].get(i);

                if (!visited[current]) {
                    dfs(current);

                }
            }

        }
    }

    private static void bfs(int V) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(V);
        visited[V] = true;

        while (!queue.isEmpty()) {

            int temp = queue.poll();
            bfs_result.add(temp);

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

        //
        for (ArrayList<Integer> temp : node) {
            Collections.sort(temp);
        }


        dfs(V);
        for (int i : dfs_result) {
            System.out.print(i + " ");
        }

        Arrays.fill(visited, false);

        bfs(V);



        System.out.println();

        for (int i : bfs_result) {
            System.out.print(i + " ");
        }

    }
}
