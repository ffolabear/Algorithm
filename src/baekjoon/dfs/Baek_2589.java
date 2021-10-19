package baekjoon.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Baek_2589 {

    static String[][] treasure;
    static boolean[][] visited;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static int height;
    static int width;

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String wh = bf.readLine();
        String[] input = wh.split(" ");

        height = Integer.parseInt(input[0]);
        width = Integer.parseInt(input[1]);


        treasure = new String[height][];

        for (int i = 0; i < height; i++) {
            treasure[i] = bf.readLine().split("");
        }

        int distance = -1;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {

                if (treasure[i][j].equals("L")) {
                    visited = new boolean[height][width];
                    int result = bfs(j, i);

                    if (result > distance) {
                        distance = result;
                    }
                }


            }
        }
        System.out.println(distance);
    }

    static int bfs(int m, int n) {

        Queue<int[]> q = new LinkedList<>();

        int maxMove =-1;
        visited[n][m] = true;

        q.add(new int[]{m, n, 0});

        while (!q.isEmpty()) {
            int[] pos = q.poll();
            int px = pos[0];
            int py = pos[1];
            int move = pos[2];

            if(move > maxMove) {
                maxMove = move;
            }

            for(int i=0; i<4; i++) {
                int nx = px + dx[i];
                int ny = py + dy[i];
                if(nx <0 || nx > width-1 || ny<0 || ny > height-1) {
                    continue;
                }

                if(!visited[ny][nx] && treasure[ny][nx].equals("L")) {
                    visited[ny][nx] =true;
                    q.add(new int[]{nx,ny, move+1});
                }
            }

        }

        return maxMove;
    }


}
