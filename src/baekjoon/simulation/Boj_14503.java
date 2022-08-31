package baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Boj_14503 {

    static int N, M, r, c, d;
    static int[][] place;
    static int cnt = 1;

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        N = scan.nextInt();
        M = scan.nextInt();
        r = scan.nextInt();
        c = scan.nextInt();
        d = scan.nextInt();

        place = new int[N][M];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                place[i][j] = scan.nextInt();
            }
        }

        dfs(r, c, d);
        System.out.println(cnt);
    }

    public static void dfs(int x, int y, int d) {
        place[x][y] = -1;

        for (int i = 0; i < 4; i++) {
            d -= 1;
            if (d == -1) {
                d = 3;
            }

            int nx = x + dx[d];
            int ny = y + dy[d];

            if (nx >= 0 && ny >= 0 && nx < N && ny < M){
                if (place[nx][ny] == 0) {
                    cnt++;
                    dfs(nx, ny, d);
                    return;
                }
            }
        }

        int dir = (d + 2) % 4;
        int mx = x + dx[dir];
        int my = y + dy[dir];

        if (mx >= 0 && my >= 0 && mx < N && my <  M && place[mx][my] != 1) {
            dfs(mx, my, d);
        }

    }
}
