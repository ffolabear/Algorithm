package Lecture.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Tomato2 {

    static int M, N;
    static int[][] box;
    static int[][] chk;

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    //전체를 탐색하는 것이 아닌 1인곳만 탐색하므로 전역으로 선언한다.
    static Queue<Node> queue = new LinkedList<>();

    private void bfs() {
        while (!queue.isEmpty()) {

            Node current = queue.poll();
            for (int i = 0; i < 4; i++) {

                int nx = current.x + dx[i];
                int ny = current.y + dy[i];

                if (nx >= 1 && nx <= N && ny >= 1 && ny <= M && box[nx][ny] == 0) {
                    box[nx][ny] = 1;
                    queue.offer(new Node(nx, ny));
                    chk[nx][ny] = chk[current.x][current.y] + 1;
                }

            }

        }


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        M = in.nextInt();
        N = in.nextInt();

        box = new int[N + 1][M + 1];
        chk = new int[N + 1][M + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                box[i][j] = in.nextInt();
                if (box[i][j] == 1) {
                    queue.add(new Node(i, j));

                }

            }
        }

        Tomato2 sol = new Tomato2();

        sol.bfs();

        int ans = Integer.MIN_VALUE;
        boolean isValid = true;

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                if (box[i][j] == 0) {
                    isValid = false;
                    break;
                } else {
                    ans = Math.max(ans, chk[i][j]);
                }
            }
        }

        if (isValid) {
            System.out.println(ans);
        } else {
            System.out.println(-1);
        }

    }


}
