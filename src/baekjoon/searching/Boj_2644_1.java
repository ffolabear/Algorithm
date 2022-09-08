package baekjoon.searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Boj_2644_1 {

    static int n, a, b, m;
    static boolean[] visited;
    static ArrayList<Integer>[] node;
    static int ans = -1;

    private void dfs(int start, int end, int count) {
        if (start == end) {
            ans = count;
            return;
        } else {
            visited[start] = true;
            for (int i = 0; i < node[start].size(); i++) {
                int current = node[start].get(i);
                if (!visited[current]) {
                    dfs(current, end, count + 1);
                }

            }

        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        m = Integer.parseInt(br.readLine());

        node = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            node[i] = new ArrayList<>();
        }

        for (int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine());
            int parent = Integer.parseInt(st.nextToken());
            int child = Integer.parseInt(st.nextToken());
            node[parent].add(child);
            node[child].add(parent);
        }



        Boj_2644_1 sol = new Boj_2644_1();
        sol.dfs(a, b, 0);
        System.out.println(ans);
    }
}
