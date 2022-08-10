package baekjoon.searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Node {
    int x;
    int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Boj_2178_2 {

    static int N, M;

    static int[][] maze, dis;


    static int ans = 0;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    private void bfs(int x, int y) {

        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(x, y));
        maze[x][y] = 0;

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            for (int i = 0; i < 4; i++) {

                int nx = current.x + dx[i];
                int ny = current.y + dy[i];

                if (nx >= 1 && nx <= N && ny >= 1 && ny <= M && maze[nx][ny] == 1) {
                    maze[nx][ny] = 0;
                    queue.add(new Node(nx, ny));
                    dis[nx][ny] = dis[current.x][current.y] + 1;
                }
            }

        }


    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        maze = new int[N + 1][M + 1];
        dis = new int[N + 1][M + 1];

        for (int i = 1; i <= N; i++) {
            String input = br.readLine();
            for (int j = 1; j <= M; j++) {
                maze[i][j] = input.charAt(j - 1) - '0';
            }
        }

        Boj_2178_2 sol = new Boj_2178_2();
        dis[1][1] = 1;
        sol.bfs(1, 1);
        System.out.println(dis[N][M]);
    }

}
