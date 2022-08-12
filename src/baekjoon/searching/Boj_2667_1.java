package baekjoon.searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Boj_2667_1 {

    static int N, group_cnt;
    static String[] a;
    static boolean[][] visited;
    static int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    static ArrayList<Integer> group;
    static StringBuilder sb = new StringBuilder();

    static void dfs(int x, int y) {

        group_cnt++;
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {

            int nx = x + dir[i][0];
            int ny = y + dir[i][1];

            //존재하지 않는 좌표면 무시
            if (nx < 0 || ny < 0 || nx >= N || ny >= N) {
                continue;
            }

            //집이 없으면 무시
            if (a[nx].charAt(ny) == '0') {
                continue;
            }

            //이미 방문했다면 무시
            if (visited[nx][ny]) {
                continue;
            }
            dfs(nx, ny);

        }

    }

    static void pro() {
        //단지를 찾을때 마다 기록
        group = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                if (!visited[i][j] && a[i].charAt(j) == '1') {
                    group_cnt = 0;
                    dfs(i, j);
                    group.add(group_cnt);
                }

            }
        }
        Collections.sort(group);
        sb.append(group.size()).append('\n');
        for (int house : group) {
            sb.append(house).append('\n');
        }
        System.out.println(sb.toString());
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        a = new String[N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            a[i] = br.readLine();
        }

        pro();

    }

}
