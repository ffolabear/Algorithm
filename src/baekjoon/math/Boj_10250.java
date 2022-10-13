package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_10250 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());


        for (int i = 0; i < T; i++) {

            String input = bf.readLine();
            StringTokenizer st = new StringTokenizer(input);

            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            int floor = N % H;
            int room = 0;

            if (floor == 0) {

                floor = H * 100;
                room = N / H;

            } else {
                floor = floor * 100;
                room = (N / H )+ 1;
            }

            System.out.println(floor + room);
        }


    }

}
