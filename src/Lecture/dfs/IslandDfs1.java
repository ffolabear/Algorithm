package Lecture.dfs;

import java.util.Scanner;

public class IslandDfs1 {

    static int N;
    static int ans = 0;
    static int[][] island;

    static int[] dx = {1, -1, 0, 0, 1, 1, -1, -1};
    static int[] dy = {0, 0, -1, 1, 1, -1, 1, -1};

    private void dfs(int x, int y) {
        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 1 && nx <= N && ny >= 1 && ny <= N && island[nx][ny] == 1) {
                island[nx][ny] = 0;
                dfs(nx, ny);
            }

        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        island = new int[N + 1][N + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                island[i][j] = in.nextInt();
            }
        }

        IslandDfs1 sol = new IslandDfs1();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (island[i][j] == 1) {
                    ans++;
                    sol.dfs(i, j);
                }

            }

        }

        System.out.println(ans);
    }
}
