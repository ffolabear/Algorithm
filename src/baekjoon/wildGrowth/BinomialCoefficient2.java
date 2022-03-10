package baekjoon.wildGrowth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BinomialCoefficient2 {

    /*
        모듈러 연산
        (a + b) % m = ((a % m) + (b % m)) % m
        (a * b) % m = ((a % m) * (b % m)) % m
     */

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());


    }

    static int factorial(int n) {

        int res = 1;

        for (int i = 1; i <= n; i++) {
            res *= i;
        }

        return res;
    }

    static int inverse(int a, int p) {

        return 0;
    }

}
