package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_2869 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();

        int[] snail = new int[3];

        StringTokenizer st = new StringTokenizer(input);
        while (st.hasMoreTokens()) {
            snail[0] = Integer.parseInt(st.nextToken());
            snail[1] = Integer.parseInt(st.nextToken());
            snail[2] = Integer.parseInt(st.nextToken());
        }

        int current = 0;
        int day = 1;

        while (true) {

            current += snail[0];

            if (current >= snail[2]) {
                System.out.println(day);
                break;

            }

            current -= snail[1];
            day++;


            if (current < 0) {
                current = 0;
            }

        }

    }

}
