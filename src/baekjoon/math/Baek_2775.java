package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_2775 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());

        int[][] apt = new int[15][15];

        for (int i = 1; i < apt.length; i++) {
            apt[0][i] = i;
            apt[i][1] = 1;
        }

        for (int i = 1; i < apt.length; i++) {

            for (int j = 2; j < apt[i].length; j++) {
                apt[i][j] = apt[i - 1][j] + apt[i][j - 1];
            }


        }


        for (int i = 0; i < T; i++) {
            int floor = Integer.parseInt(bf.readLine());
            int room = Integer.parseInt(bf.readLine());
            System.out.println(apt[floor][room]);

        }


    }

}
