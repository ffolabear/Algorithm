package baekjoon.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_11729 {

    static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        recursion(N, 1, 3);

        System.out.println(count);


    }

    static void recursion(int N, int from, int to) {

        System.out.println(from + " " + to);
        count++;

        if (N > 1) {
            recursion(N - 1, from,6 - from - to);
        }

        System.out.println(from + " " + to);

        if (N > 1) {
            recursion(N - 1, 6 - from - to, to);
        }



    }



}
