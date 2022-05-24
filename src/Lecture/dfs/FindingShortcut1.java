package Lecture.dfs;

import java.util.Scanner;

public class FindingShortcut1 {

    static int[][] maze = new int[8][8];
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static int ans = Integer.MAX_VALUE;

    private void bfs(int x, int y) {

        if (x == 7 && y == 7) {

        }

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                maze[i][j] = in.nextInt();
            }
        }

        FindingShortcut1 sol = new FindingShortcut1();
        maze[1][1] = 1;
        sol.bfs(1, 1);
        System.out.println(ans);

    }

}
