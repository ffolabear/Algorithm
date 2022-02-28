package baekjoon.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2178 {

    static int N, M;
    static String[][] maze;
    static boolean[][] isVisited;


    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static int answer = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        maze = new String[N][M];
        isVisited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            maze[i] = br.readLine().split("");
        }










        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                System.out.print(maze[i][j]);
            }
            System.out.println();
        }

    }


    static void dfs(int x, int y) {

        if (isVisited[x][y]) {

        }

    }

}
