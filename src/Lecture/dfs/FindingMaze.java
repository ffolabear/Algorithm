package Lecture.dfs;

import java.util.Scanner;

public class FindingMaze {

    static int[][] maze = new int[8][8];
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int ans = 0;

    private void dfs(int x, int y) {
        if (x == 7 && y == 7) {
            ans++;
        } else {
            for (int i = 0; i < 4; i++) {

                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 1 && ny >= 1 && nx <= 7 && ny <= 7 && maze[nx][ny] == 0) {
                        maze[nx][ny] = 1;
                        dfs(nx, ny);
                        maze[nx][ny] = 0;
                }

            }
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                maze[i][j] = in.nextInt();
            }
        }

        FindingMaze sol = new FindingMaze();
        maze[1][1] = 1;
        sol.dfs(1, 1);

        System.out.println(ans);



    }

}
