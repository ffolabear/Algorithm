package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_2839 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        boolean valid = false;

        int cntThree = 0;
        int three = N / 3;
        cntThree += three;

        if (N % 3 == 0) {
            valid = true;
        }

        int five = N / 5;
        int cntFive = 0;
        cntFive += five;

        if ((N % 5) % 3 == 0) {
            valid = true;
            cntFive += 1;
        }

        System.out.println("3 : " + cntThree);
        System.out.println("5 : " + cntFive);

        int answer = Math.min(cntFive, cntThree);
        System.out.println(answer);


    }

}
