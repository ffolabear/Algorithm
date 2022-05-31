package Lecture.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class IslandBfs {

    static int N;
    static int ans = 0;
    static int[][] island;

    static int[] dx = {1, -1, 0, 0, 1, 1, -1, -1};
    static int[] dy = {0, 0, -1, 1, 1, -1, 1, -1};

    static Queue<Node> queue = new LinkedList<>();

    private void bfs(int x, int y) {

        queue.offer(new Node(x, y));

        while (!queue.isEmpty()) {

            Node current = queue.poll();

            for (int i = 0; i < 8; i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];
                if (nx >= 1 && nx <= N && ny >= 1 && ny <= N && island[nx][ny] == 1) {
                    island[nx][ny] = 0;
                    queue.offer(new Node(nx, ny));
                }

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

        IslandBfs sol = new IslandBfs();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (island[i][j] == 1) {
                    island[i][j] = 0;
                    sol.bfs(i, j);
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}
