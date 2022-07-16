package baekjoon.catchStudy.greedy;

import java.io.*;
import java.util.StringTokenizer;

public class Boj_1018 {

    static boolean[][] board;
    static int N, M;
    static int min = 64;


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

        bw.append(String.valueOf(min));
        bw.flush();
        bw.close();

    }


    private static void isValid(int i, int j) {

        int end_x = i + 8;
        int end_y = j + 8;
        int count = 0;

        boolean init = board[i][j];

        for (int x = i; x < end_x; x++) {
            for (int y = j; y < end_y; y++) {
                if (board[x][y] != init) {
                    count++;
                }

                //교대로 색이 바뀌어야 하므로 반대로 바꿔줌
                init = (!init);
            }
            init = (!init);
        }

        count = Math.min(count, 64 - count);
        min = Math.min(min, count);
    }

}
