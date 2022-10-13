package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1712 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        int answer = 0;

        int A = 0;
        int B = 0;
        int C = 0;

        StringTokenizer st = new StringTokenizer(str);
        while (st.hasMoreTokens()) {
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());

        }

        if (C <= B) {

            System.out.println(-1);

        } else {

            int benefit = C - B;

            System.out.println(A/benefit + 1);

        }


        System.out.println("answer : " + answer);
    }
}
