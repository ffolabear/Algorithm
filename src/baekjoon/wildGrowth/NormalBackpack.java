package baekjoon.wildGrowth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NormalBackpack {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String input = bf.readLine();
        StringTokenizer st = new StringTokenizer(input);

        int N=0;
        int K=0;

        while (st.hasMoreTokens()) {
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            String stuff = bf.readLine();
            st = new StringTokenizer(stuff);

            int W = 0;
            int V = 0;

            while (st.hasMoreTokens()) {
                W = Integer.parseInt(st.nextToken());
                V = Integer.parseInt(st.nextToken());
            }

            System.out.println(W + " "  + V);

        }

    }

}
