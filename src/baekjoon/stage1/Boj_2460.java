package baekjoon.stage1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2460 {

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        int[][] train = new int[10][2];

        for (int i = 0; i < 10; i++) {

            String station = bf.readLine();
            StringTokenizer st = new StringTokenizer(station);
            train[i][0] = Integer.parseInt(st.nextToken());
            train[i][1] = Integer.parseInt(st.nextToken());


        }

        int temp = 0;
        int people = 0;

        for (int j = 0; j < train.length; j++) {

            people = people - train[j][0] + train[j][1];

            if (temp <= people) {
                temp = people;

            }

        }

        System.out.println(temp);
    }
}
