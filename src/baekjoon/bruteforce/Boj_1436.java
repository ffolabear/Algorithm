package baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_1436 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int num = 1;
        int cnt = 0;

        while (true) {

            if (String.valueOf(num).contains("666")) {
                cnt++;
            }

            if (cnt == N) {
                System.out.println(num);
                break;
            }
            num++;
        }
    }

}
