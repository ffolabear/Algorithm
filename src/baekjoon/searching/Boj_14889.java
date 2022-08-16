package baekjoon.searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_14889 {

    static int N;
    static int[][] board;
    static boolean[] isUsed;
    static int diff = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        board = new int[N][N];
        isUsed = new boolean[N];

        for (int i = 0; i < N; i++) {

            String[] row = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(row[j]);
            }

        }

        combination(0, 0);
        System.out.println(diff);
    }


    private static void combination(int idx, int count) {

        if (count == N / 2) {
            isValid();

            return;
        } else {
            for (int i = idx; i < N; i++) {
                if (!isUsed[i]) {
                    isUsed[i] = true;
                    combination(i + 1, count + 1);
                    isUsed[i] = false;
                }
            }
        }

    }

    private static void isValid() {

        int teamStart = 0;
        int teamLink = 0;

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (isUsed[i] && isUsed[j]) {
                    teamStart += board[i][j] + board[j][i];

                } else if (!isUsed[i] && !isUsed[j]) {
                    teamLink += board[i][j] + board[j][i];
                }
            }
        }

        int temp = Math.abs(teamStart - teamLink);

        if (diff == 0) {
            System.out.println(diff);
            System.exit(0);
        }

        diff = Math.min(diff, temp);

    }

}
