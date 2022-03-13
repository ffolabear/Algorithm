package swexpert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class sw_1226 {

    static int[] dy = {-1, 1, 0, 0};
    static int[] dx = {0, 0, -1, 1};
    static int ans = 0;

    public static void main(String[] args) throws FileNotFoundException {

        System.setIn(new FileInputStream("src/swexpert/input_1226.txt"));
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {

            int Testcase = sc.nextInt();
            ans = 0;

            String[][] maze = new String[16][];
            boolean[][] visited = new boolean[16][16];
            for (int j = 0; j < 16; j++) {
                maze[j] = sc.next().split("");
            }

            for (int k = 0; k < maze.length; k++) {
                for (int l = 0; l < maze[k].length; l++) {
                    if (maze[k][l].equals("2")) {
                        System.out.print("#" + Testcase + " ");
                        dfs(maze, visited, k, l);
                        System.out.print(ans + "\n");

                    }

                }
            }
        }
    }

    static void dfs(String[][] maze, boolean[][] visited, int x, int y) {
        if (ans == 1) return;
        if (maze[x][y].equals("3")) {
            ans = 1;
            return;
        }

        boolean isDeadEnd = false;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            String next = maze[nx][ny];

            if (nx < 0 || ny < 0 || nx > 15 || ny > 15) {
                continue;
            }

            if (next.equals("1")) continue;
            if (!visited[nx][ny]) {
                visited[nx][ny] = true;
                dfs(maze, visited, nx, ny);
                visited[nx][ny] = false;

            }
        }
    }

}
