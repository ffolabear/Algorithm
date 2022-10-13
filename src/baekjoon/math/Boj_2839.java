package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2839 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int answer = 0;
        int devideFive = N / 5;
        int devideThree = N / 3;

        if (N < 5) {
            if (N == 3) {
                answer = 1;
            } else {
                answer = -1;

            }


        } else {
            if (N % 5 == 0) {
                answer = devideFive;
            } else if (N % 5 == 1) {
                answer = devideFive + 1;
            } else if (N % 5 == 4) {
                answer = devideFive + 2;
            } else if (N % 5 == 3) {
                answer = devideFive + 1;
            } else {
                if (N % 3 == 0) {
                    answer = devideThree;
                } else if (N % 3 == 2){
                    answer = devideThree;
                } else {
                    answer = -1;
                }


            }

        }


        System.out.println(answer);


    }

}
