package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek_1012 {

    // T: 테스트 케이스의 갯수
    // M: 배추밭의 가로길이 M(1 ≤ M ≤ 50)
    // N: 배추밭의 세로길이 N(1 ≤ N ≤ 50)
    // K: 배추가 심어져있는 갯수 K(1 ≤ K ≤ 2500)
    static boolean[][] field;
    static boolean[][] visited;
    static StringBuilder sb = new StringBuilder();

    static int M;
    static int N;
    static int K;

    static void input() throws IOException {


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());

        for (int i = 0; i < T; i++) {

            String testcase = bf.readLine();
            StringTokenizer test = new StringTokenizer(testcase);


            while (test.hasMoreTokens()) {

                M = Integer.parseInt(test.nextToken());
                N = Integer.parseInt(test.nextToken());
                K = Integer.parseInt(test.nextToken());
            }

            field = new boolean[M][N];
            visited = new boolean[M][N];


            for (int j = 0; j < K; j++) {

                String location = bf.readLine();
                StringTokenizer loc = new StringTokenizer(location);

                int x = -2;
                int y = -2;

                while (loc.hasMoreTokens()) {

                    x = Integer.parseInt(loc.nextToken());
                    y = Integer.parseInt(loc.nextToken());
                }
                field[x][y] = true;

            }


            wormCount();

        }

    }

    static void wormCount() {

        int worm = 0;

        for (int l = 0; l < M; l++){
            for (int j = 0; j < N; j++) {

                if (locationChk(l, j)){
                    worm++;
                    direction(l, j);
                }

            }
        }

        sb.append(worm).append('\n');
    }

    static void direction(int x, int y) {

        visited[x][y] = true;

         if (locationChk(x - 1,y)){
             direction(x - 1, y);
         }

         if (locationChk(x + 1,y)){
             direction(x + 1, y);
         }

         if (locationChk(x,y - 1)){
             direction(x, y - 1);
         }

         if (locationChk(x,y + 1)){
             direction(x, y + 1);
         }

    }

    static boolean locationChk(int x, int y) {

        if (x < 0 || y < 0 || x >= M || y >= N) {
            return false;
        }

        if (visited[x][y] || !field[x][y] ){
            return false;
        }

        return true;
    }

    public static void main(String[] args) throws IOException {

        input();
        System.out.println(sb.toString());


    }
}

