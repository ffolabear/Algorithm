package baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2231 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        String[] input = str.split("");
        int[] digit = new int[input.length];

        for (int i = 0; i < digit.length; i++) {
            digit[i] = Integer.parseInt(input[i]);
        }

        int init = (int) (Math.pow(10, input.length - 1));
        int end = Integer.parseInt(str);

        if (end < 10) {
            System.out.println(end);
        } else {

            int sum= 0;
            int current = 0;

            for (int i = init; i < end; i++) {

                sum = 0;
                current = i;

                String[] temp = String.valueOf(i).split("");

                for (int j = 0; j < temp.length; j++) {
                    sum += Integer.parseInt(temp[j]);
                }

                System.out.println(i + " " + sum + " " + (sum + i));
                sum += i;

                if (sum == end) {
                    break;
                }
            }

            if (current < end) {
                System.out.println(sum);
            } else {
                System.out.println(0);
            }

        }



    }
}
