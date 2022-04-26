package baekjoon.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Boj_1260_2 {

    static int N, M, V;
    static ArrayList<Integer>[] nodes;
    static ArrayList<Integer> res = new ArrayList<>();
    static boolean[] visited;

    static void dfs(int current) {

        if (visited[current]) {
            return;
        }

        visited[current] = true;
        res.add(current);

        for (int i = 0; i < nodes[current].size(); i++) {

            //[1] - 추가
            //2(F - 추가), 3(F), 4(F)

            //[2]
            //1(T), 4(F - 추가)

            //[3]
            //1, 4

            //[4]
            //1(T), 2(T), 3(F- 추가)

            int temp = nodes[current].get(i);

            //아직 방문 안했다면 실행 (visited[temp] = false)
            //방문했다면 건너뜀      (visited[temp] = true)
            if (!visited[temp]) {
                dfs(temp);
            }

        }


    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        StringTokenizer st = new StringTokenizer(input);
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        nodes = new ArrayList[N + 1];

        for (int i = 0; i <= N; i++) {
            nodes[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {

            String[] temp = br.readLine().split(" ");
            int from = Integer.parseInt(temp[0]);
            int to = Integer.parseInt(temp[1]);

            nodes[from].add(to);
            nodes[to].add(from);
        }


        for (ArrayList<Integer> node : nodes) {
            Collections.sort(node);
        }

        visited = new boolean[N + 1];

        for (ArrayList<Integer> node : nodes) {
            System.out.println(node);
        }

        dfs(1);
        System.out.println();
        System.out.println("--- 정답 ---");
        System.out.println(res);
    }
}
