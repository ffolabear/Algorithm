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
        int day = 0;

        while (current < snail[2]) {
            current += snail[0];
            current -= snail[1];
            if (current < 0) {
                current = 0;
            }
            day++;
        }

        System.out.println(day);
    }

}
