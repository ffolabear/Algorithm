package baekjoon.lecture.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_16974 {

        static StringBuilder burger = new StringBuilder();
//    static StringBuffer burger = new StringBuffer();
    static int N;
    static long count;

    public static void main(String[] args) throws IOException {

        //BPPPB
        //B BPPPB P BPPPB B

        /*
        P                                     1
        BPPPB                                 1 + 1 + 1
        B BPPPB P BPPPB B                     3 + 1 + 3
        B BBPPPBPBPPPBB P BBPPPBPBPPPBB B     7 + 1 + 7

         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        burger.append("P");


        burger(0, 1);

        String eaten = burger.substring(burger.length() - 7);
        System.out.println(eaten);

        for (long i = 0; i < eaten.length(); i++) {

        }

        //BBPPPBPBPPPBB
        //      PBPPPBB

    }

    static void burger(int count, long patty) {

        System.out.println(burger + " " + patty);

        if (count == N) {
            return;
        }

        String lastBurger = burger.toString();
        burger = new StringBuilder();
        burger.append("B").append(lastBurger).append("P").append(lastBurger).append("B");
        patty = patty * 2 + 1;

        burger(count += 1, patty);

    }

}
