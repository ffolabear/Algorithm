package baekjoon.lecture.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj16234 {

    static int N, L, R;

    static int[][] country;
    static boolean[][] visited;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        System.out.println(N + " " + L + " " + R);
        System.out.println("----------------------");

        country = new int[N][N];
        visited = new boolean[N][N];
        int answer = 0;

        for (int i = 0; i < N; i++) {

            String[] row = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                country[i][j] = Integer.parseInt(row[j]);
            }

        }

        for (int i = 0; i < country.length; i++) {
            for (int j = 0; j < country[i].length; j++) {

                if (checkMove(i, j)) {
                    answer++;
                }

            }
        }

        //-----------------------------------------------------------------------------------

        for (int i = 0; i < country.length; i++) {
            for (int j = 0; j < country[i].length; j++) {
                System.out.print(country[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println(answer);
    }

    static boolean checkMove(int x, int y) {

        visited[x][y] = true;

        System.out.println(x + " | " + y);
        System.out.println("------------");

        for (int i = 0; i < 4; i++) {
            int nx = dx[i];
            int ny = dy[i];


            if (nx >= 0 && ny >= 0 &&
                nx < N && ny < N) {
                System.out.println(nx + " | " + ny + " = " + i);
            }

        }
        System.out.println();
        return false;
    }

    static void movePeople(int x, int y, int dx, int dy) {
        country[x][y] = (country[x][y] + country[dx][dy]) / 2;
        country[dx][dy] = (country[x][y] + country[dx][dy]) / 2;

    }


}
