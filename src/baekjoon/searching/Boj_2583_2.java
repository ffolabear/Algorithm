package baekjoon.searching;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Boj_2583_2 {

    static int N, M, K;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static int[][] map;
    static int cnt = 0;
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        map = new int[M][N];

        for (int i = 0; i < K; i++) {

            st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            makingArea(x1, y1, x2, y2);

        }


    }

    private static void makingArea(int x1, int y1, int x2, int y2) {
        for (int i = 0; i < y2; i++) {
            for (int j = x1; j < x2; j++) {
                map[i][j] = 1;
            }
        }

    }

    private static void dfs(int x, int y) {


    }

}
