package Lecture.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 원론적인 이유를 제외하면 최단거리를 구하는 알고리즘이므로 BFS를 떠올릴 수 있다.
 * DFS로 풀었던 문제와는 다르게 Queue 를 선언하며, 진행할 수 있는 길로 갈때마다 그 거리를
 * 배열에 표시해준다. (dis 배열)
 *
 * 그리고 마찬가지로 상하좌우를 탐색해야하기 때문에 dx, dy 테크닉을 사용한다.
 * 조건에 만족하는 정점들을 큐에 넣고 하나씩 탐색할때마다 그 거리를 dis 배열에 기록하기 때문에 목적지인 (7,7) 죄표값이 정답이 된다.
 */

public class FindingShortcut3 {

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

        FindingShortcut3 sol = new FindingShortcut3();
        sol.bfs(1, 1);

        if (dis[7][7] == 0) {
            System.out.println(-1);
        } else {
            System.out.println(dis[7][7]);
        }


    }

}
