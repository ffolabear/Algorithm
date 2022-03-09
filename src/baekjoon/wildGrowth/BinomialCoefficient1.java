package baekjoon.wildGrowth;

import java.io.*;
import java.util.StringTokenizer;

public class BinomialCoefficient1 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int answer = factorial(N) / (factorial(N - K) * factorial(K));

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();

    }

    static int factorial(int n) {

        int res = 1;

        for (int i = 1; i <= n; i++) {
            res *= i;
        }

        return res;
    }

}
