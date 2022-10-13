package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2292 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        int start = 1;
        int answer = 1;
        int plus = 6;

        if (N == 1) {
            System.out.println(answer);
        } else {

            while (true) {

                if (start < N) {
                    start += plus;
                    plus += 6;
                    answer++;

                } else {
                    System.out.println(answer);
                    break;

                }


            }

        }


    }

}
