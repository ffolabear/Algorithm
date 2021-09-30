package Algo_practice.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Baek_2667 {


    static int area;

    static String[][] square;
    static boolean[][] visited;
    static ArrayList<Integer> answer;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        square = new String[N][N];
        visited = new boolean[N][N];
        answer = new ArrayList<Integer>();

        for (int i = 0; i < N; i++) {
            square[i] = bf.readLine().split("");
        }

        area = 0;

        for (int i = 0; i < square.length; i++) {


            for (int j = 0; j < square[i].length; j++) {
                if (square[i][j].equals("1") && !visited[i][j]) {
                    area = 1;
                    dfs(i, j, N);
                    answer.add(area);

                }

            }

            area = 0;
        }


        Collections.sort(answer);
        System.out.println(answer.size());
        for (int i : answer) {
            System.out.println(i);
        }
    }

    static void dfs(int x, int y, int N) {

        visited[x][y] = true;


        for (int i = 0; i < 4; i++) {


            int nx = x + dx[i];
            int ny = y + dy[i];


            if (nx >= 0 && nx < N && ny >= 0 && ny < N) {
                if (square[nx][ny].equals("1") && !visited[nx][ny]) {
                    dfs(nx, ny, N);
                    area++;

                }


            }

        }

    }

}
