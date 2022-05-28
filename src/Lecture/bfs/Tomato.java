package Lecture.bfs;

import java.util.Scanner;

public class Tomato {

    static int[][] box;
    static boolean[][] isVisited;

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    private void bfs() {

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        int N = in.nextInt();

        box = new int[N + 1][M + 1];
        isVisited = new boolean[N + 1][M + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                box[i][j] = in.nextInt();
            }
        }

//        for (int i = 1; i <= N; i++) {
//            for (int j = 1; j <= M; j++) {
//                System.out.print(box[i][j] + " ");
//            }
//            System.out.println();
//        }

        Tomato sol = new Tomato();
        sol.bfs();

    }

}
