package sunday.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_10870 {

    static int n;

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bf.readLine());

        if (n == 0) {
            System.out.println(0);
        } else if (n == 1) {
            System.out.println(1);
        } else {
            recursion(0, 1, 2);

        }

    }

    static void recursion(int i, int j, int count) {

        if (count == n) {
            System.out.println(i + j);
            return;

        } else {
            recursion(j, i + j, count += 1);
        }

    }

}
