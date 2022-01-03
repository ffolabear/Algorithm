package baekjoon.lecture.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj16234 {

    static int N, L, R;
    static int answer = 0;

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

        for (int i = 0; i < N; i++) {

            String[] row = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                country[i][j] = Integer.parseInt(row[j]);
            }

        }

        for (int i = 0; i < country.length; i++) {
            for (int j = 0; j < country[i].length; j++) {
                checkMove(i, j);

            }
        }

        //-----------------------------------------------------------------------------------

        for (int i = 0; i < country.length; i++) {
            for (int j = 0; j < country[i].length; j++) {
                System.out.print(country[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println(answer);
    }

    static void checkMove(int x, int y) {

        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];


            if (nx >= 0 && ny >= 0 &&
                nx < N && ny < N &&
                country[x][y] >= L && country[x][y] <= R &&
                country[nx][ny] >= L && country[nx][ny] <= R) {
                movePeople(x, y, nx, ny);
            }

        }
    }

    static void movePeople(int x, int y, int nx, int ny) {

        System.out.println(country[x][y] + " | " + country[nx][ny]);

        int xy = country[x][y];
        int nxny = country[nx][ny];

        country[x][y] = (xy + nxny) / 2;
        country[nx][ny] = (xy + nxny) / 2;
        answer++;

        System.out.println(country[x][y] + " | " + country[nx][ny]);
        System.out.println();
    }


}
