package baekjoon.lecture.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj16940 {

    static int N;
    static ArrayList<ArrayList<Integer>> adj;
    static int[] visit;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        adj = new ArrayList<>();


        for (int i = 1; i < N; i++) {
            adj.add(new ArrayList<>());
        }


        for (int i = 1; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int parent = Integer.parseInt(st.nextToken());
            int child = Integer.parseInt(st.nextToken());
            adj.get(parent).add(child);

        }

        System.out.println(adj);

        String[] row = br.readLine().split(" ");
        visit = new int[row.length];

        for (int i = 0; i < row.length; i++) {
            visit[i] = Integer.parseInt(row[i]);

        }


    }

    static boolean check() {

        Queue<Integer> parentQueue = new LinkedList<>();
        int parent = 1;
        for (int i = 1; i < N; i++) {

            int current = visit[i];

            if (adj.get(current).size() > 1) {
                parentQueue.add(current);


            }


        }


        return false;
    }


}
