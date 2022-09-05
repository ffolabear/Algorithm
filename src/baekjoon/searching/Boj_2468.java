package baekjoon.searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2468 {

    static int N, maxHeight;
    static int answer = 0;
    static int[][] board;
    static boolean[][] chk;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        board = new int[N][N];

        maxHeight = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < input.length; j++) {
                board[i][j] = Integer.parseInt(input[j]);
                maxHeight = Math.max(maxHeight, Integer.parseInt(input[j]));
            }
        }


        for (int i = 0; i <= maxHeight; i++) {

            //탐색 여부 체크 배열
            chk = new boolean[N][N];
            int temp = 0;

            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    if (board[j][k] > i && !chk[j][k]) {
                        temp += dfs(j, k, i);
                    }
                }
            }
            answer = Math.max(answer, temp);
        }


        System.out.println(answer);
    }

    private static int dfs(int x, int y, int height) {

        chk[x][y] = true;

        for (int i = 0; i < 4; i++) {

            int nx = dx[i] + x;
            int ny = dy[i] + y;

            if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
                if (!chk[nx][ny]) {
                    if (board[nx][ny] > height) {
                        dfs(nx, ny, height);
                    }
                }
            }
        }
        return 1;
    }


}
