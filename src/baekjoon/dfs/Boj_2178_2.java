package baekjoon.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2178_2 {

    static int N, M;
    static int[][] maze;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        maze = new int[N + 1][M + 1];
        for (int i = 1; i <= N; i++) {
            String input[] = br.readLine().split("");
            for (int j = 0; j < input.length; j++) {
                maze[i][j] = Integer.parseInt(input[j]);
            }
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                System.out.print(maze[i][j]);
            }
            System.out.println();
        }


    }

}
