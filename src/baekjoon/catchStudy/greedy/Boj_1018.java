package baekjoon.catchStudy.greedy;

import java.io.*;
import java.util.StringTokenizer;

public class Boj_1018 {

    static boolean[][] board;
    static int N, M;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        board = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            for (int j = 0; j < M; j++) {
                if (input.charAt(j) == 'W') {
                    board[i][j] = true;
                } else {
                    board[i][j] = false;
                }

            }
        }

        //경우의 수는 (N - 7) * (M - 7) * 2

        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {
                isValid(i, j);

            }
        }

    }


    private static void isValid(int i, int j) {



    }

}
