package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_10250 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());


        for (int i = 0; i < T; i++) {

            String input = bf.readLine();
            StringTokenizer st = new StringTokenizer(input);
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());


            boolean[][] hotel = new boolean[H + 1][W + 1];

            for (int j = 1; j <= N; j++) {

                for (int k = 1; k <= W; k++) {
                    for (int l = 1; l <= H; j++) {
                        hotel[k][l] = true;
                    }
                }

            }


        }


    }

}
