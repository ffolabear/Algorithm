package baekjoon.silver;

import java.io.*;

public class Boj14889_startLink {

    static int N;
    static int[][] power;
    static boolean[] visit;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        power = new int[N][N];
        visit = new boolean[N];

        for (int i = 0; i < N; i++) {

            String[] input = br.readLine().split(" ");

            for (int j = 0; j < power.length; j++) {
                power[i][j] = Integer.parseInt(input[j]);

            }

        }




//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < power.length; j++) {
//                System.out.print(power[i][j] + " ");
//            }
//            System.out.println();
//
//        }

    }

    static void dfs(int depth, int idx) {

        if (depth == N / 2) {
            return;
        }

    }

}
