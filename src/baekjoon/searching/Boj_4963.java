package baekjoon.searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_4963 {

    static int w, h;
    static int[][] map;
    static boolean[][] chk;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {

            st = new StringTokenizer(br.readLine());

            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            if (w == 0 && h == 0) {
                break;
            }

            map = new int[h][w];
            chk = new boolean[h][w];

            for (int i = 0; i < h; i++) {
                String[] input = br.readLine().split(" ");
                for (int j = 0; j < input.length; j++) {
                    map[i][j] = Integer.parseInt(input[j]);
                }
            }

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println();

        }





    }

}
