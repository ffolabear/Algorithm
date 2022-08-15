package baekjoon.searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_14889 {

    static int N;
    static int[][] board;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        board = new int[N][N];

        for (int i = 0; i < N; i++) {

            String[] row = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(row[j]);
            }

        }

//
//        for (int i = 0; i < N; i++) {
//
//            for (int j = 0; j < N; j++) {
//                System.out.print(board[i][j] + " ");
//            }
//            System.out.println();
//
//        }

    }


    private void dfs() {

    }


}
