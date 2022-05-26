package Lecture.dfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
    int x, y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class FindingShortcut1 {

    static int[][] maze = new int[8][8];
    static int[][] dis = new int[8][8];

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static int ans = 1;

    private void bfs(int x, int y) {

        Queue<Node> queue = new LinkedList<>();

        queue.offer(new Node(x, y));
        maze[x][y] = 1;

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            for (int i = 0; i < 4; i++) {

                int nx = current.x + dx[i];
                int ny = current.y + dy[i];

                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && maze[nx][ny] == 0) {
                    maze[nx][ny] = 1;
                    queue.offer(new Node(nx, ny));
                    dis[nx][ny] = dis[current.x][current.y] + 1;

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
        sol.bfs(1, 1);
        if (dis[7][7] == 0) {
            System.out.println(-1);
        } else {
            System.out.println(dis[7][7]);
        }


    }

}
