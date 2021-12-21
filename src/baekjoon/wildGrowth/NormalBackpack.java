package baekjoon.wildGrowth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NormalBackpack {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String input = bf.readLine();
        StringTokenizer st = new StringTokenizer(input);

        int N = 0;
        int K = 0;

        while (st.hasMoreTokens()) {
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
        }

        int[] W = new int[N + 1];
        int[] V = new int[N + 1];


        int[][] knapsack = new int[N + 1][K + 1];


        for (int i = 0; i < N; i++) {

            String inputStuff = bf.readLine();
            st = new StringTokenizer(inputStuff);

            while (st.hasMoreTokens()) {
                W[i] = Integer.parseInt(st.nextToken());
                V[i] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= K; j++) {

                if (W[i] > j) {
                    knapsack[i][j] = knapsack[i - 1][j];
                } else {
                    knapsack[i][j] = Math.max(knapsack[i - 1][j], knapsack[i - 1][j - W[i]] + V[i]);
                }


            }

        }

        System.out.println(knapsack[N][K]);

    }


}
