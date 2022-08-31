package baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_14503 {

    static int N, M, r, c, d;
    static String[][] place;
    static int cnt = 1;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        place = new String[N][M];

        st = new StringTokenizer(br.readLine());

        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            place[i] = br.readLine().split(" ");
        }


//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < M; j++) {
//                System.out.print(place[i][j] + " ");
//            }
//            System.out.println();
//        }

        dfs(r, c, d);
        System.out.println(c);
    }

    public static void dfs(int r, int c, int d) {
        place[r][c] = "-1";

        for (int i = 0; i < 4; i++) {
            d -= 1;
            if (d == -1) {
                d = 3;
            }

            int nx = r + dx[i];
            int ny = c + dy[i];

            if (nx >= 0 && ny >= 0 && nx < N && ny < M){
                if (place[nx][ny].equals("0")) {
                    cnt++;
                    dfs(nx, ny, d);
                    return;
                }
            }
        }

        int dir = (d + 2) % 4;
        int mx = r + dx[dir];
        int my = c + dy[dir];

        if (mx >= 0 && my >= 0 && mx < N && my <  M && !place[mx][my].equals("1")) {
            dfs(mx, my, dir);
        }

    }
}
