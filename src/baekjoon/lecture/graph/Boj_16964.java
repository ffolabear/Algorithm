package baekjoon.lecture.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj_16964 {

    static ArrayList<Integer>[] adj;
    static boolean[] visited;
    static int[] order;
    static int[] orderNum;

    static int N;
    static ArrayList<Integer> result = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        StringTokenizer st;

        adj = new ArrayList[N + 1];
        visited = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 1; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int current = Integer.parseInt(st.nextToken());
            int next = Integer.parseInt(st.nextToken());

            adj[current].add(next);
            adj[next].add(current);
        }

        //입력 순서 처리
        String[] orderInput = br.readLine().split(" ");

        order = new int[N + 1];
        orderNum = new int[N + 1];

        for (int i = 1; i <=N ; i++) {
            order[i] = Integer.parseInt(orderInput[i - 1]);
            orderNum[order[i]] = i;
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(adj[i], new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    if (orderNum[o1] < orderNum[o2]) {
                        return -1;
                    } else if (orderNum[o1] == orderNum[o2]) {
                        return 0;
                    } else {
                        return 1;
                    }

                }
            });
        }

        visited = new boolean[N + 1];
        dfs(1);

        boolean chk = true;

        for (int i = 1; i <= N; i++) {
            if (order[i] != result.get(i - 1)) {
                chk = false;
                break;
            }
        }

        if (chk) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

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



}
