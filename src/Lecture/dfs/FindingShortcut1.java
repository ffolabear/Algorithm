package Lecture.dfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class node{
    int x, y;

    public node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class FindingShortcut1 {



    static int[][] maze = new int[7][7];
    static int[][] dis = new int[7][7];

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static int ans = Integer.MAX_VALUE;

    private void bfs(int x, int y, int sum) {

        if (x == 7 && y == 7) {
            ans = Math.max(ans, sum);
        } else {
            for (int i = 0; i < 4; i++) {
                Queue<int[]> queue = new LinkedList<>();

                int nx = x + dx[i];
                int ny = x + dy[i];
                int[] temp = new int[2];

                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && maze[nx][ny] == 1) {
                    temp[0] = nx;
                    temp[1] = ny;
                    queue.offer(temp);


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

        FindingShortcut1 sol = new FindingShortcut1();
        maze[1][1] = 1;
        sol.bfs(1, 1, 0);
        System.out.println(ans);

    }

}
