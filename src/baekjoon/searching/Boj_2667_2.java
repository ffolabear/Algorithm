package baekjoon.searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Boj_2667_2 {

    static int N, cnt;

    //지도 정보
    static String[][] map;
    //방문 여부 체크
    static boolean[][] visited;

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    //그룹수 저장
    static ArrayList<Integer> groupCnt = new ArrayList<>();


    static void dfs(int x, int y) {

        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
                if (map[nx][ny].equals("1") && !visited[nx][ny])
                dfs(nx, ny);
                cnt++;
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        map = new String[N][N];
        visited = new boolean[N + 1][N + 1];

        for (int i = 0; i < N; i++) {
            String[] row = br.readLine().split("");

            for (int j = 0; j < N; j++) {
                map[i][j] = row[j];
            }
        }

//
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < N; j++) {
//                System.out.print(map[i][j] + " ");
//            }
//            System.out.println();
//        }

        cnt = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j].equals("1") && !visited[i][j]) {
                    cnt = 1;
                    dfs(i, j);
                    groupCnt.add(cnt);
                }
            }
        }

        System.out.println(groupCnt);
    }

}
