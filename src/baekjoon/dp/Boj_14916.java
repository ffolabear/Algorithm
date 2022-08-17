package baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_14916 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int cnt = 0;

        if (N % 5 == 0) {
            cnt = N / 5;
        } else if (N < 5) {
            if (N % 2 == 0) {
                cnt = N / 2;
            } else {
                cnt = -1;
            }

        } else {

            while (N >= 5) {
                N -= 5;
                cnt++;
            }

            while (N >= 2) {
                N -= 2;
                cnt++;
            }

            if (N == 1) {
                cnt += 2;
            }

        }

        if (N < 0) {
            System.out.println(-1);
        } else {
            System.out.println(cnt);
        }

    }

}
