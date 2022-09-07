package baekjoon.searching;

import java.io.*;
import java.util.StringTokenizer;

public class Boj_4963 {

    static int w, h, cnt;
    static int[][] map;
    static boolean[][] chk;

    static int[] dx = {-1, 1, 0, 0, 1, -1, 1, -1};
    static int[] dy = {0, 0, -1, 1, 1, 1, -1, -1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        while (true) {

            st = new StringTokenizer(br.readLine());

            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            if (w == 0 && h == 0) {
                break;
            }

            map = new int[h][w];
            chk = new boolean[h][w];
            cnt = 0;

            for (int i = 0; i < h; i++) {
                String[] input = br.readLine().split(" ");
                for (int j = 0; j < input.length; j++) {
                    map[i][j] = Integer.parseInt(input[j]);
                }
            }


            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (!chk[i][j] && map[i][j] == 1) {
                        cnt += dfs(i, j);
                    }
                }
            }

            bw.append(String.valueOf(cnt)).append("\n");


        }

        bw.flush();
        bw.close();
    }

    private static int dfs(int x, int y) {

        chk[x][y] = true;

        for (int i = 0; i < 8; i++) {

            int nx = dx[i] + x;
            int ny = dy[i] + y;

            if (nx >= 0 && ny >= 0 && nx < h && ny < w) {
                if (!chk[nx][ny] && map[nx][ny] == 1) {
                    dfs(nx, ny);
                }
            }

        }

        return 1;
    }
}
