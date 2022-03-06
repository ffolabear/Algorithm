package swexpert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class sw_1249 {

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int N, min;

    static int[][] map, total;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testcase; i++) {
            System.out.print("#" + (int) (i + 1) + " ");
            N = Integer.parseInt(br.readLine());

            map = new int[N][N];
            total = new int[N][N];
            min = Integer.MAX_VALUE;

//            visited = new boolean[N][N];

            for (int k = 0; k < total.length; k++) {
                Arrays.fill(total[k], Integer.MAX_VALUE);
            }

            for (int j = 0; j < N; j++) {
                String[] input = br.readLine().split("");
                for (int k = 0; k < N; k++) {
                    map[j][k] = Integer.parseInt(input[k]);
                }
            }


            bfs();
            System.out.print(min + "\n");
        }
    }

    static void bfs() {

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});
        total[0][0] = 0;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentX = current[0];
            int currentY = current[1];

            if (currentX == N - 1 && currentY == N - 1) {
                min = Math.min(min, total[N - 1][N - 1]);
            }


            for (int k = 0; k < 4; k++) {
                int nx = currentX + dx[k];
                int ny = currentY + dy[k];

                if (nx < 0 || ny < 0 || nx >= N || ny >= N) {
                    continue;
                }

                if (total[nx][ny] <= total[currentX][currentY] + map[nx][ny]) {
                    continue;
                }


                total[nx][ny] = total[currentX][currentY] + map[nx][ny];

                queue.add(new int[]{nx, ny});


            }


        }


    }

}
