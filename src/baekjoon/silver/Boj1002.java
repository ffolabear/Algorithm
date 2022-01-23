package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1002 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //테스트 케이스
        int T = Integer.parseInt(br.readLine());

        int[][] location = new int[T][6];

        //좌표들
        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");

            for (int j = 0; j < location[i].length; j++) {
                location[i][j] = Integer.parseInt(input[j]);
            }
        }
    }

    static int calculation(int[] testcase) {

        return 0;
    }

}
