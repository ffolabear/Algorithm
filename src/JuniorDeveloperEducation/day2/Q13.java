package JuniorDeveloperEducation.day2;

import java.io.*;
import java.util.*;

public class Q13 {

    static int N, M, V;
    static ArrayList<Integer>[] adj;

    static boolean[] visited;

    //dfs 결과
    static ArrayList<Integer> dfs_result = new ArrayList<>();
    static ArrayList<Integer> bfs_result = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        adj = new ArrayList[N + 1];

        for (int i = 0; i <= N; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int parent = Integer.parseInt(st.nextToken());
            int child = Integer.parseInt(st.nextToken());
            adj[parent].add(child);
            adj[child].add(parent);

        }

        visited = new boolean[N + 1];


        dfs(1);
        System.out.println("dfs_result = " + dfs_result);

        System.out.println();
        Arrays.fill(visited, false);

        bfs(1);
        System.out.println("bfs_result = " + bfs_result);

    }


    private static void dfs(int n) {

        if (visited[n]) {
            return;
        }

        visited[n] = true;
        dfs_result.add(n);

        for (int i : adj[n]) {
            if (!visited[i]) {
                dfs(i);
            }
        }


    }

    static void bfs(int n) {

        Queue<Integer> queue = new LinkedList<>();

        visited[n] = true;

        //첫 노드부터 참색해야 하므로 큐에 넣어줌
        queue.add(n);


        //큐에 탐색해애하는 노드들을 넣고 하나씩 빼면서 차례로 참색
        while (!queue.isEmpty()) {

            //탐색해야하는 노드를 poll
            int current = queue.poll();
            bfs_result.add(current);

            //현재 노드에 연결되어 있는 노드들을 대상으로 탐색
            for (int i : adj[current]) {
                if (!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }

        }

    }

}
